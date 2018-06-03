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
import totalcross.ui.gfx.Color;
import totalcross.ui.image.Image;
import totalcross.ui.image.ImageException;

public class Login extends Container{
	Container ctImg;
	ImageControl imgC;
	Image img;
	private Label lbValue;
	Button fb,gm,p;
	Edit ed;
	public void initUI(){
		setBackColor(Color.WHITE);
		
		p = new Button("PULAR");
		p.setBackForeColors(cores.branco,cores.vermelho);
		p.setBorder(BORDER_NONE);
		add(p,RIGHT,TOP,PREFERRED+200,PREFERRED+100);
		p.addPressListener((e) -> {
			new Inicio().swapToTopmostWindow();
		});

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

		lbValue = new Label("Para iniciar, faça login ou\ncadastre-se abaixo",CENTER);
		lbValue.setForeColor(0x0c0c0c);
		add(lbValue,CENTER,AFTER+30,PREFERRED,PREFERRED);


		try {

			fb = new Button("		ENTRAR COM FACEBOOK",img = new Image("img/logfb.png"),RIGHT, 8);

			fb.setBackForeColors(cores.azul, cores.branco);
			add(fb, CENTER, AFTER+200, PARENTSIZE+90, PREFERRED+90);

			gm = new Button("		ENTRAR COM GOOGLE",img = new Image("img/gLogoED.png"),RIGHT, 8);

			gm.setBackForeColors(cores.branco,cores.preto);
			add(gm, CENTER, AFTER+25, PARENTSIZE+90, fb.getHeight());

		} catch (IOException | ImageException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Container linha = new Container() {
			public void initUI() {

				Container linha = new Container();
				linha.setBackColor(cores.fundo_cinza);
				add(linha,LEFT,CENTER,PARENTSIZE,1);

				Label l = new Label(" ou",CENTER);
				add(l,CENTER,CENTER,PREFERRED+20,PARENTSIZE);
				
			}
		};
		add(linha,LEFT,AFTER+150,PARENTSIZE,PREFERRED+50);

		
		
		ed = new Edit();
		add(ed, CENTER, AFTER+70, PARENTSIZE+89, PREFERRED+50);
		ed.caption = "Email";
		ed.setBackColor(cores.cinza);
		ed.setForeColor(cores.preto);
		
		Button o = new Button("CONTINUAR");
		o.setBackForeColors(cores.vermelho,cores.branco);
		add(o, CENTER, AFTER+150, PARENTSIZE+90, PREFERRED+150);

		o.addPressListener((e) -> {
			String email = ed.getText();
			if(email.isEmpty()) {
				new MessageBox("Campos vazios", "Por favor preencha todos os campos").popup();
			}else {
				appControl.VerificarEmail(email);
				app.email= email;
			}
		});

	}
}

