package view;

import control.appControl;
import interfaces.cores;
import totalcross.io.IOException;
import totalcross.ui.Button;
import totalcross.ui.Container;
import totalcross.ui.Edit;
import totalcross.ui.ImageControl;
import totalcross.ui.Label;
import totalcross.ui.dialog.MessageBox;
import totalcross.ui.gfx.Color;
import totalcross.ui.image.Image;
import totalcross.ui.image.ImageException;

public class Login2 extends Container {
	Container ctImg;
	ImageControl imgC;
	Image img;
	Button fb,gm,p;
		public void initUI(){
			appControl.CriarConexao();
			ctImg = new Container() {
				public void initUI(){
					try {
						img = new Image("img/logo1.png").getSmoothScaledInstance(ctImg.getWidth(), ctImg.getHeight());
						imgC = new ImageControl(img);
						add(imgC,CENTER,TOP,PREFERRED,PREFERRED); 


					} catch (IOException | ImageException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			};

			add(ctImg,CENTER,TOP+170,PREFERRED+700,PREFERRED+150);
			
			
			Container linha = new Container() {
				public void initUI() {
					
					Container linha = new Container();
					linha.setBackColor(cores.fundo_cinza);
					add(linha,LEFT,CENTER,PARENTSIZE,1);
					
				}
			};
			add(linha,LEFT,AFTER+150,PARENTSIZE,PREFERRED+25);
			
			
			setBackColor(Color.WHITE);
			Edit ed = new Edit();
			ed.caption = "Senha";
			ed.setBackColor(Color.BRIGHT);
			ed.setForeColor(Color.BLACK);
			add(ed, CENTER, AFTER+200, PARENTSIZE+89, PREFERRED+50);

			Button o = new Button("LOGAR");
			o.setBackForeColors(cores.vermelho,cores.branco);
			add(o, CENTER, AFTER+150, PARENTSIZE+90,PREFERRED+80);
			
			o.addPressListener((e) -> {
				String senha = ed.getText();
				if(senha.isEmpty()) {
					new MessageBox("Campos vazios", "Por favor preencha todos os campos").popup();
								}else {
									appControl.VerificarSenha(senha);
								}
			});
	}
}
