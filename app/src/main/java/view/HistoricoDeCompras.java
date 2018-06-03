package view;

import interfaces.cores;
import totalcross.io.IOException;
import totalcross.sys.Vm;
import totalcross.ui.Button;
import totalcross.ui.Container;
import totalcross.ui.ImageControl;
import totalcross.ui.Label;
import totalcross.ui.font.Font;
import totalcross.ui.image.Image;
import totalcross.ui.image.ImageException;

public class HistoricoDeCompras extends Container{
	Container ctImg, ctBar2;
	ImageControl imgC;
	Image img;
	public void initUI(){
		setBackColor(cores.branco);

		ctBar2 = new Container(){
			public void initUI() {
				ctBar2.setBackForeColors(cores.preto, cores.branco);
				Label t = new Label("Histórico");
				Font f= Font.getFont(true,Font.NORMAL_SIZE+2);
				t.setFont(f);
				add(t,CENTER,AFTER+30,PREFERRED+20,PREFERRED);

			}
		};	
		add(ctBar2,CENTER,AFTER,PARENTSIZE,PREFERRED+100);

		ctImg = new Container(){
			public void initUI(){
				try {
					img = new Image("img/sad.png").getSmoothScaledInstance(ctImg.getWidth(), ctImg.getHeight());
					img.applyColor2(cores.preto);
					imgC = new ImageControl(img);
					add(imgC,CENTER,CENTER,PREFERRED,PREFERRED); 

				} catch (IOException | ImageException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		add(ctImg,CENTER,AFTER+300,PREFERRED+300,PREFERRED+300);

		Label t = new Label("Você ainda não usou seu Chef´s Club");
		Font f= Font.getFont(true,Font.NORMAL_SIZE+2);
		t.setFont(f);
		add(t,CENTER,AFTER+30,PREFERRED+20,PREFERRED);

		Label t2 = new Label("Encontre um restaurante com desconto para ir agora\ncom check-in, fazer uma reserva ou pedir delivery em\ncasa!");
		Font f2= Font.getFont(true,Font.NORMAL_SIZE-5);
		t2.setFont(f2);
		add(t2,CENTER,AFTER+40,PREFERRED+20,PREFERRED);

		Button o = new Button("BUSCAR RESTAURANTES");
		o.setBackForeColors(cores.vermelho,cores.branco);
		add(o, CENTER, AFTER+60, PARENTSIZE+70,PREFERRED+100);
	}
}
