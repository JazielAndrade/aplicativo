package control;

import totalcross.db.sqlite.SQLiteUtil;
import totalcross.sql.PreparedStatement;
import totalcross.sql.ResultSet;
import totalcross.sql.Statement;
import totalcross.sys.Settings;
import totalcross.sys.Vm;
import totalcross.ui.dialog.MessageBox;
import view.Cadastro;
import view.Inicio;
import view.Login2;

public class appControl {
	private static SQLiteUtil util;
	private static PreparedStatement ps;
	private static ResultSet rs;

	public static SQLiteUtil CriarConexao() {
		try {
			util = new SQLiteUtil(Settings.appPath, "BancoApp2.db");

			Vm.debug(util.fullPath);

		}catch(Throwable t){
			throw new RuntimeException(t);
		}
		return util;
	}
	public static boolean CreateTable() {
		boolean b = false;

		try {
			Statement st = util.con().createStatement();
			st.execute("CREATE TABLE IF NOT EXISTS APP_USER(" +
					"  nome VARCHAR(255) NOT NULL," +
					"  cpf VARCHAR(11) NOT NULL," +
					"  email VARCHAR(300) NOT NULL,"+
					"  senha VARCHAR(16) NOT NULL);");
			b = true;
		}catch(Exception e) {
			new MessageBox("Deu Erro", e.getMessage()).popup();
			b = false;
		}

		return b;
	}
	public static boolean AdicionarUser(String nome, String cpf, String email, String senha) {

		try {

			ps = util.prepareStatement("INSERT INTO APP_USER( nome, cpf, email, senha) VALUES(?,?,?,?)");
			ps.setString(1, nome);
			ps.setString(2, cpf);
			ps.setString(3, email);
			ps.setString(4, senha);
			int i = ps.executeUpdate();
			if (i > 0) {
				return true;
			}
		}catch(Exception e) {

			new MessageBox("Erro ao cadastrar", e.getMessage()).popup();

		}

		return false;

	}
	public static void VerificarEmail (String email) {
		try {
			ps = util.prepareStatement("SELECT * FROM APP_USER WHERE email='"+email+"'");
			rs = ps.executeQuery();

			if(rs.next()) {
				new Login2().swapToTopmostWindow();
			}else {
				new Cadastro(email).swapToTopmostWindow();
			}

		}catch(Exception e) {
			e.printStackTrace();
		}
	
	}
	
	public static void VerificarSenha (String senha) {
		try {
			ps = util.prepareStatement("SELECT * FROM APP_USER WHERE senha='"+senha+"'");
			rs = ps.executeQuery();

			if(rs.next()) {
				new Inicio().swapToTopmostWindow();
			}else {
				new MessageBox("Desculpe", "Senha não encontrada").popup();
			}

		}catch(Exception e) {
			e.printStackTrace();
		}
	
	}
}


