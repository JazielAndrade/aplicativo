package view;

import com.app.app;

import control.appControl;
import interfaces.cores;
import totalcross.io.IOException;
import totalcross.ui.Button;
import totalcross.ui.Container;
import totalcross.ui.Edit;
import totalcross.ui.ImageControl;
import totalcross.ui.Label;
import totalcross.ui.dialog.MessageBox;
import totalcross.ui.font.Font;
import totalcross.ui.gfx.Color;
import totalcross.ui.image.Image;
import totalcross.ui.image.ImageException;

public class Cadastro extends Container  {
	Container ctBar, ctBar2,ctED;
	Image img;
	Edit e1,e2,e3,e4;
	String email;
	public Cadastro() {}
	
	public Cadastro(String email) {
		this.email = email;
	}
	public void initUI() {

		ctBar = new Container(){
			public void initUI() {
				Button back;

				try {
					back = new Button("");
					back.setBorder(BORDER_NONE);
					add(back,LEFT,TOP,PREFERRED+300,PARENTSIZE);
					back.addPressListener((e) -> {
						new Login().swapToTopmostWindow();
					});

					img = new Image("img/back1.png").getSmoothScaledInstance(back.getWidth()*50/100, back.getHeight()*50/100);
					img.applyColor2(cores.vermelho);
					back.setImage(img);

					Label t = new Label("Cadastre-se no clube");
					t.setFont(Font.getFont(t.getFont().size*120/100).asBold());
					add(t,CENTER,CENTER,PREFERRED,PREFERRED);

				} catch (IOException | ImageException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}


			}
		};	
		add(ctBar,CENTER,TOP,PARENTSIZE,PREFERRED+200);

		ctBar2 = new Container(){
			public void initUI() {

				Label t = new Label("Período de degustação:");
				t.setFont(Font.getFont(Font.NORMAL_SIZE-2));
				add(t,LEFT+40,BOTTOM,PREFERRED+20,PREFERRED);

				Label t2 = new Label("1 mês grátis");
				t2.setFont(Font.getFont(Font.NORMAL_SIZE-2).asBold());
				add(t2,RIGHT,BOTTOM,PREFERRED+20,PREFERRED);

			}
		};	
		add(ctBar2,CENTER,AFTER,PARENTSIZE+90,PREFERRED+100);

		Container linha = new Container() {
			public void initUI() {

				Container linha = new Container();
				linha.setBackColor(cores.fundo_cinza);
				add(linha,LEFT,CENTER,PARENTSIZE,1);	
			}
		};
		add(linha,LEFT,AFTER,PARENTSIZE,PREFERRED+25);

		setBackColor(Color.WHITE);
		ctED = new Container() {
			public void initUI() {
				
				try {
					Image i = new Image("img/cpf1.png").getSmoothScaledInstance(ctED.getWidth()*11/100, ctED.getHeight()*60/100);
					i.applyColor2(cores.cinza);
					ImageControl ic = new ImageControl(i);
					add(ic,LEFT,CENTER,PREFERRED,PREFERRED);
					
					e1 = new Edit();
					e1.caption = "CPF";
					e1.transparentBackground = true;
					add(e1, RIGHT-50, CENTER,PARENTSIZE+80, PARENTSIZE+60);

					Container linha = new Container();
					linha.setBackColor(cores.fundo_cinza);
					add(linha,SAME,AFTER+20,SAME,2);
				} catch (IOException | ImageException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}		
			}
		};
		add(ctED,CENTER,AFTER + 50,PARENTSIZE+85,PREFERRED+200);

		ctED = new Container() {
			public void initUI() {
				
				try {
					Image i = new Image("img/email1.png").getSmoothScaledInstance(ctED.getWidth()*11/100, ctED.getHeight()*60/100);
					i.applyColor2(cores.cinza);
					ImageControl ic = new ImageControl(i);
					add(ic,LEFT,CENTER,PREFERRED,PREFERRED);
					
					e2 = new Edit();
					e2.caption = "Email";
					e2.transparentBackground = true;
					
					add(e2, RIGHT-50, CENTER,PARENTSIZE+80, PARENTSIZE+60);

					e2.setText(email);
					Container linha = new Container();
					linha.setBackColor(cores.fundo_cinza);
					add(linha,SAME,AFTER+20,SAME,2);
				} catch (IOException | ImageException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}		
			}
		};
		add(ctED,CENTER,AFTER + 50,SAME,PREFERRED+200);
		
		ctED = new Container() {
			public void initUI() {
				
				try {
					Image i = new Image("img/perfil1.png").getSmoothScaledInstance(ctED.getWidth()*11/100, ctED.getHeight()*60/100);
					i.applyColor2(cores.cinza);
					ImageControl ic = new ImageControl(i);
					add(ic,LEFT,CENTER,PREFERRED,PREFERRED);
					
					e3 = new Edit();
					e3.caption = "Nome";
					e3.transparentBackground = true;
					add(e3, RIGHT-50, CENTER,PARENTSIZE+80, PARENTSIZE+60);

					Container linha = new Container();
					linha.setBackColor(cores.fundo_cinza);
					add(linha,SAME,AFTER+20,SAME,2);
				} catch (IOException | ImageException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}		
			}
		};
		add(ctED,CENTER,AFTER + 50,SAME,PREFERRED+200);

		ctED = new Container() {
			public void initUI() {
				
				try {
					Image i = new Image("img/key1.png").getSmoothScaledInstance(ctED.getWidth()*11/100, ctED.getHeight()*60/100);
					i.applyColor2(cores.cinza);
					ImageControl ic = new ImageControl(i);
					add(ic,LEFT,CENTER,PREFERRED,PREFERRED);
					
					e4 = new Edit();
					e4.caption = "Senha";
					e4.transparentBackground = true;
					add(e4, RIGHT-50, CENTER,PARENTSIZE+80, PARENTSIZE+60);

					Container linha = new Container();
					linha.setBackColor(cores.fundo_cinza);
					add(linha,SAME,AFTER+20,SAME,2);
				} catch (IOException | ImageException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}		
			}
		};
		add(ctED,CENTER,AFTER + 50,SAME,PREFERRED+200);

		Button o = new Button("CADASTRAR");
		o.setBackForeColors(cores.vermelho, cores.branco);
		add(o, CENTER, AFTER+80, SAME, PREFERRED+150);

		o.addPressListener((e) -> {
			String cpf = e1.getText();
			String email = e2.getText();
			String nome = e3.getText();
			String senha = e4.getText();
			if(cpf.isEmpty() || email.isEmpty()||nome.isEmpty()||senha.isEmpty()) {
				new MessageBox("Campos vazios", "Por favor preencha todos os campos").popup();
			}else {
				if(appControl.AdicionarUser(nome, cpf, email, senha)) {
					app.email= email;
					app.nome= nome;
					new Inicio().swapToTopmostWindow();
				}else {
					new MessageBox("Desculpe", "Erro ao cadastrar").popup();
				}

			}
			//			new Login2().swapToTopmostWindow();
		});

		//		o.addPressListener((e) -> {
		//			String Nome = ed.getText();
		//			String cpf = ep.getText();
		//			if(Nome.isEmpty() || cpf.isEmpty()) {
		//				new MessageBox("Campos vazios ", "Por favor preencha todos os campos").popup();
		//			}else {
		//				//			boolean t = appControl.AdicionarUser(Nome, cpf);
		//				//			if(t) {
		//				//				new MessageBox("", "Usuário cadastrado").popup();
		//				//				new Inicio().swapToTopmostWindow();
		//				//				
		//				//			}else {
		//				//				new MessageBox("Erro", "Falha ao Cadastrar").popup();
		//				//			}
		//			}
		//		});
		//		U.addPressListener((e) -> {
		//			new Login().swapToTopmostWindow();	
		//		});
	}
}
