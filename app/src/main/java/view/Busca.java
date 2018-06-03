package view;

import interfaces.cores;
import totalcross.io.IOException;
import totalcross.ui.Container;
import totalcross.ui.Edit;
import totalcross.ui.ImageControl;
import totalcross.ui.ScrollContainer;
import totalcross.ui.image.Image;
import totalcross.ui.image.ImageException;

public class Busca  extends Container{
	Container ctED;
	Edit e1;
	Image img;
	ImageControl imgC;
	public void initUI(){
		setBackColor(cores.branco);
		ctED = new Container() {
			public void initUI() {
				
				try {
					Image i = new Image("img/buscar1.png").getSmoothScaledInstance(ctED.getWidth()*11/100, ctED.getHeight()*60/100);
					i.applyColor2(cores.cinza);
					ImageControl ic = new ImageControl(i);
					add(ic,LEFT,CENTER,PREFERRED,PREFERRED);
					
					e1 = new Edit();
					e1.caption = "Buscar restaurantes";
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
		
}
}
