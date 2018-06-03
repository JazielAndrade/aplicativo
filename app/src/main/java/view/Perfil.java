package view;

import interfaces.cores;
import totalcross.io.IOException;
import totalcross.ui.Button;
import totalcross.ui.Container;
import totalcross.ui.ImageControl;
import totalcross.ui.Label;
import totalcross.ui.ScrollContainer;
import totalcross.ui.font.Font;
import totalcross.ui.image.Image;
import totalcross.ui.image.ImageException;

public class Perfil extends Container{
	ScrollContainer s;
	Container ct1,ct2,ctP,ctImg,ctB;
	Button bt;
	Label lb,lb2,lb3,lb4;
	Image img;
	ImageControl imgC;
	public void initUI(){
		s = new ScrollContainer() {
					public void initUI(){
						setBackColor(cores.fundo_cinza);
						ct1 = new Container() {
							public void initUI(){
								setBackColor(cores.branco);
								ctImg = new Container(){
									public void initUI(){
										try {
											img = new Image("img/pfC.png").getSmoothScaledInstance(ctImg.getWidth(), ctImg.getHeight());
											img.applyColor2(cores.fundo_cinza);
											imgC = new ImageControl(img);
											add(imgC,CENTER,CENTER,PREFERRED,PREFERRED); 

										} catch (IOException | ImageException e) {
											// TODO Auto-generated catch block
											e.printStackTrace();
										}
									}
								};
								add(ctImg,CENTER,TOP+50,PREFERRED+300,PREFERRED+300);
								
								lb = new Label("User");
								Font f= Font.getFont(true,Font.NORMAL_SIZE+4);
								lb.setFont(f);
								lb.setForeColor(cores.preto);
								add(lb,CENTER,AFTER+30,PREFERRED+20,PREFERRED);
								
								lb2 = new Label("user@email.com");
								Font f2= Font.getFont(true,Font.NORMAL_SIZE);
								lb2.setFont(f2);
								lb2.setForeColor(cores.cinza);
								add(lb2,CENTER,AFTER+30,PREFERRED+20,PREFERRED);
								
								lb3 = new Label("Faltam 30 dias");
								Font f3= Font.getFont(true,Font.NORMAL_SIZE+6);
								lb3.setFont(f3);
								lb3.setForeColor(cores.vermelho);
								add(lb3,CENTER,AFTER+30,PREFERRED+20,PREFERRED);
								
								lb4 = new Label("para sua assinatura acabar");
								Font f4= Font.getFont(true,Font.NORMAL_SIZE);
								lb4.setFont(f4);
								lb4.setForeColor(cores.cinza);
								add(lb4,CENTER,AFTER+10,PREFERRED+20,PREFERRED);
								
								Button o = new Button("RENOVAR AGORA");
								Font f5= Font.getFont(Font.NORMAL_SIZE-2);
								o.setFont(f5);
								o.setBackForeColors(cores.vermelho,cores.branco);
								add(o, RIGHT-170, AFTER+50, PREFERRED+40,PREFERRED+70);
								
								Button o2 = new Button("VER DETALHES");
								o2.setFont(f5);
								o2.setBackForeColors(cores.branco,cores.vermelho);
								o2.setBorder(BORDER_NONE);
								add(o2, LEFT+170, SAME, PREFERRED+40,PREFERRED+70);
								
							}

						};
						add(ct1,CENTER,TOP,PARENTSIZE,PREFERRED+1500);
						ct2 = new Container() {
							public void initUI(){
								setBackColor(cores.branco);
								lb = new Label("Conta");
								Font f4= Font.getFont(true,Font.NORMAL_SIZE);
								lb.setFont(f4);
								lb.setForeColor(cores.cinza);
								add(lb,LEFT+30,TOP+50,PREFERRED,PREFERRED);
								
								
								ctB = new Container() {
									public void initUI() {
										
										try {
											Image i = new Image("img/cpf1.png").getSmoothScaledInstance(ctB.getWidth()*11/100, ctB.getHeight()*60/100);
											i.applyColor2(cores.cinza);										
											
											bt = new Button("Dados pessoais",i,RIGHT,8);
											bt.setBorder(BORDER_NONE);
											add(bt, LEFT, CENTER,PREFERRED+80, PARENTSIZE+60);
										} catch (IOException | ImageException e) {
											// TODO Auto-generated catch block
											e.printStackTrace();
										}		
									}
								};
								add(ctB,LEFT,AFTER+50,PARENTSIZE+85,PREFERRED+200);
								
								ctB = new Container() {
									public void initUI() {
										
										try {
											Image i = new Image("img/fav.png").getSmoothScaledInstance(ctB.getWidth()*11/100, ctB.getHeight()*60/100);
											i.applyColor2(cores.cinza);										
											
											bt = new Button("Favoritos",i,RIGHT,8);
											bt.setBorder(BORDER_NONE);
											add(bt, LEFT, AFTER,PREFERRED+80, PARENTSIZE+60);
										} catch (IOException | ImageException e) {
											// TODO Auto-generated catch block
											e.printStackTrace();
										}		
									}
								};
								add(ctB,LEFT,AFTER+50,PARENTSIZE+85,PREFERRED+200);
								
								ctB = new Container() {
									public void initUI() {
										
										try {
											Image i = new Image("img/star.png").getSmoothScaledInstance(ctB.getWidth()*11/100, ctB.getHeight()*60/100);
											i.applyColor2(cores.cinza);										
											
											bt = new Button("Insira código promocional",i,RIGHT,8);
											bt.setBorder(BORDER_NONE);
											add(bt, LEFT, AFTER,PREFERRED+80, PARENTSIZE+60);
										} catch (IOException | ImageException e) {
											// TODO Auto-generated catch block
											e.printStackTrace();
										}		
									}
								};
								add(ctB,LEFT,AFTER+50,PARENTSIZE+85,PREFERRED+200);
								
								ctB = new Container() {
									public void initUI() {
										
										try {
											Image i = new Image("img/pf.png").getSmoothScaledInstance(ctB.getWidth()*11/100, ctB.getHeight()*60/100);
											i.applyColor2(cores.cinza);										
											
											bt = new Button("Ganhe assinaturas mensais",i,RIGHT,8);
											bt.setBorder(BORDER_NONE);
											add(bt, LEFT, AFTER,PREFERRED+80, PARENTSIZE+60);
										} catch (IOException | ImageException e) {
											// TODO Auto-generated catch block
											e.printStackTrace();
										}		
									}
								};
								add(ctB,LEFT,AFTER+50,PARENTSIZE+85,PREFERRED+200);
								
								ctB = new Container() {
									public void initUI() {
										
										try {
											Image i = new Image("img/exit.png").getSmoothScaledInstance(ctB.getWidth()*11/100, ctB.getHeight()*60/100);
											i.applyColor2(cores.cinza);										
											
											bt = new Button("Sair",i,RIGHT,8);
											bt.setBorder(BORDER_NONE);
											add(bt, LEFT, AFTER,PREFERRED+80, PARENTSIZE+60);
										} catch (IOException | ImageException e) {
											// TODO Auto-generated catch block
											e.printStackTrace();
										}		
									}
								};
								add(ctB,LEFT,AFTER+50,PARENTSIZE+85,PREFERRED+200);
								
							}

						};
						add(ct2,CENTER,AFTER+50,PARENTSIZE,PREFERRED+1800);
						
					}
		};
		add(s,CENTER,CENTER,PARENTSIZE,PARENTSIZE);
	}
}
