package view;

import com.app.app;

import interfaces.cores;
import totalcross.ui.Button;
import totalcross.ui.Container;
import totalcross.ui.TabbedContainer;
import totalcross.ui.event.ControlEvent;
import totalcross.ui.event.Event;
import totalcross.ui.font.Font;
import totalcross.ui.image.Image;


public class Inicio extends Container {
	public String email1; 
	Container ctP,ctBottom,ctTop,ctCenter;
	Button ini,pesq,hist,perf;
	TabbedContainer tb;

	public void initUI() {

		ctP = new Container() {
			public void initUI() {


				ctBottom = new Container() {
					public void initUI() {
						try{
							setBackColor(cores.branco);
							Image i = new Image("img/talheres1.png").getSmoothScaledInstance(ctBottom.getWidth()*10/100, ctBottom.getHeight()*50/100);
							i.applyColor2(cores.vermelho);
							ini  = new Button("Início",i,BOTTOM,8); 
							ini.setFont(Font.getFont(ini.getFont().size*80/100));
							ini.setForeColor(cores.vermelho);
							ini.setBorder(BORDER_NONE);
							add(ini,LEFT,TOP,PARENTSIZE+55,PARENTSIZE);

							Image i2 = new Image("img/buscar1.png").getSmoothScaledInstance(ctBottom.getWidth()*10/100, ctBottom.getHeight()*50/100);
							i2.applyColor2(cores.cinza);
							pesq  = new Button(i2);
							pesq.setBorder(BORDER_NONE);
							add(pesq,AFTER,TOP,PARENTSIZE+15,PARENTSIZE);

							Image i3 = new Image("img/seta1.png").getSmoothScaledInstance(ctBottom.getWidth()*10/100, ctBottom.getHeight()*50/100);
							i3.applyColor2(cores.cinza);
							hist  = new Button(i3);
							hist.setBorder(BORDER_NONE);
							add(hist,AFTER,TOP,SAME,PARENTSIZE);

							Image i4 = new Image("img/perfil1.png").getSmoothScaledInstance(ctBottom.getWidth()*10/100, ctBottom.getHeight()*50/100);
							i4.applyColor2(cores.cinza);
							perf  = new Button(i4);
							perf.setBorder(BORDER_NONE);
							add(perf,AFTER,TOP,SAME,PARENTSIZE);

						}catch(Exception e) {
							e.printStackTrace();
						}
					}
				};

				add(ctBottom,LEFT, BOTTOM, PARENTSIZE,PREFERRED+200);

				ctCenter = new Container() {
					public void initUI() {
						String[] tits = {"","","",""};
						tb = new TabbedContainer(tits);
						add(tb,LEFT,TOP - 160,PARENTSIZE,ctCenter.getHeight()+30);
						tb.setContainer(0, new OpcoesDeEstabelimento());
						tb.setContainer(1, new Busca());
						tb.setContainer(2, new HistoricoDeCompras());
						if(app.email == null) {
							tb.setContainer(3, new Login());
						}else {
							tb.setContainer(3, new Perfil());
						}
						
						tb.setActiveTab(0);

					}
				};

				add(ctCenter,LEFT, TOP, PARENTSIZE,ctP.getHeight()-ctBottom.getHeight());
			}
		};

		add(ctP,LEFT, TOP, PARENTSIZE,PARENTSIZE);
	}

	public void onEvent(Event e) {

		switch(e.type) {
		case ControlEvent.PRESSED:
			if(e.target == ini) {
				ctBottom.removeAll();

				ctBottom = new Container() {
					public void initUI() {
						try{
							setBackColor(cores.branco);
							Image i = new Image("img/talheres1.png").getSmoothScaledInstance(ctBottom.getWidth()*10/100, ctBottom.getHeight()*50/100);
							i.applyColor2(cores.vermelho);
							ini  = new Button("Início",i,BOTTOM,8); 
							ini.setFont(Font.getFont(ini.getFont().size*80/100));
							ini.setForeColor(cores.vermelho);
							ini.setBorder(BORDER_NONE);
							add(ini,LEFT,TOP,PARENTSIZE+55,PARENTSIZE);

							Image i2 = new Image("img/buscar1.png").getSmoothScaledInstance(ctBottom.getWidth()*10/100, ctBottom.getHeight()*50/100);
							i2.applyColor2(cores.cinza);
							pesq  = new Button(i2);
							pesq.setBorder(BORDER_NONE);
							add(pesq,AFTER,TOP,PARENTSIZE+15,PARENTSIZE);

							Image i3 = new Image("img/seta1.png").getSmoothScaledInstance(ctBottom.getWidth()*10/100, ctBottom.getHeight()*50/100);
							i3.applyColor2(cores.cinza);
							hist  = new Button(i3);
							hist.setBorder(BORDER_NONE);
							add(hist,AFTER,TOP,SAME,PARENTSIZE);

							Image i4 = new Image("img/perfil1.png").getSmoothScaledInstance(ctBottom.getWidth()*10/100, ctBottom.getHeight()*50/100);
							i4.applyColor2(cores.cinza);
							perf  = new Button(i4);
							perf.setBorder(BORDER_NONE);
							add(perf,AFTER,TOP,SAME,PARENTSIZE);

						}catch(Exception e) {
							e.printStackTrace();
						}
					}
				};

				add(ctBottom,LEFT, BOTTOM, PARENTSIZE,PREFERRED+200);

				tb.setActiveTab(0);
			}
			if(e.target == pesq || e.target == OpcoesDeEstabelimento.pesqui) {
				ctBottom.removeAll();

				ctBottom = new Container() {
					public void initUI() {
						try {
							setBackColor(cores.branco);
							Image i = new Image("img/talheres1.png").getSmoothScaledInstance(ctBottom.getWidth()*10/100, ctBottom.getHeight()*50/100);
							i.applyColor2(cores.cinza);
							ini  = new Button(i);
							ini.setBorder(BORDER_NONE);
							add(ini,LEFT,TOP,PARENTSIZE+15,PARENTSIZE);

							Image i2 = new Image("img/buscar1.png").getSmoothScaledInstance(ctBottom.getWidth()*10/100, ctBottom.getHeight()*50/100);
							i2.applyColor2(cores.vermelho);
							pesq  = new Button("Busca",i2,BOTTOM,8);
							pesq.setFont(Font.getFont(pesq.getFont().size*80/100));
							pesq.setForeColor(cores.vermelho);
							pesq.setBorder(BORDER_NONE);
							add(pesq,AFTER,TOP,PARENTSIZE+55,PARENTSIZE);

							Image i3 = new Image("img/seta1.png").getSmoothScaledInstance(ctBottom.getWidth()*10/100, ctBottom.getHeight()*50/100);
							i3.applyColor2(cores.cinza);
							hist  = new Button(i3);
							hist.setBorder(BORDER_NONE);
							add(hist,AFTER,TOP,PARENTSIZE+15,PARENTSIZE);

							Image i4 = new Image("img/perfil1.png").getSmoothScaledInstance(ctBottom.getWidth()*10/100, ctBottom.getHeight()*50/100);
							i4.applyColor2(cores.cinza);
							perf  = new Button(i4);
							perf.setBorder(BORDER_NONE);
							add(perf,AFTER,TOP,SAME,PARENTSIZE);
						}catch(Exception e) {
							e.printStackTrace();
						}
					}
				};

				add(ctBottom,LEFT, BOTTOM, PARENTSIZE,PREFERRED+200);
				tb.setActiveTab(1);
			}
			if(e.target == hist) {
				ctBottom.removeAll();

				ctBottom = new Container() {
					public void initUI() {
						try {
							setBackColor(cores.branco);
							Image i = new Image("img/talheres1.png").getSmoothScaledInstance(ctBottom.getWidth()*10/100, ctBottom.getHeight()*50/100);
							i.applyColor2(cores.cinza);
							ini  = new Button(i);
							ini.setBorder(BORDER_NONE);
							add(ini,LEFT,TOP,PARENTSIZE+15,PARENTSIZE);

							Image i2 = new Image("img/buscar1.png").getSmoothScaledInstance(ctBottom.getWidth()*10/100, ctBottom.getHeight()*50/100);
							i2.applyColor2(cores.cinza);
							pesq  = new Button(i2);
							pesq.setBorder(BORDER_NONE);
							add(pesq,AFTER,TOP,SAME,PARENTSIZE);

							Image i3 = new Image("img/seta1.png").getSmoothScaledInstance(ctBottom.getWidth()*10/100, ctBottom.getHeight()*50/100);
							i3.applyColor2(cores.vermelho);
							hist  = new Button("Histórico",i3,BOTTOM,8);
							hist.setFont(Font.getFont(hist.getFont().size*80/100));
							hist.setForeColor(cores.vermelho);
							hist.setBorder(BORDER_NONE);
							add(hist,AFTER,TOP,PARENTSIZE+55,PARENTSIZE);

							Image i4 = new Image("img/perfil1.png").getSmoothScaledInstance(ctBottom.getWidth()*10/100, ctBottom.getHeight()*50/100);
							i4.applyColor2(cores.cinza);
							perf  = new Button(i4);
							perf.setBorder(BORDER_NONE);
							add(perf,AFTER,TOP,PARENTSIZE+15,PARENTSIZE);
						}catch(Exception e) {
							e.printStackTrace();
						}
					}
				};

				add(ctBottom,LEFT, BOTTOM, PARENTSIZE,PREFERRED+200);

				tb.setActiveTab(2);
			}
			if(e.target == perf) {
				ctBottom.removeAll();

				ctBottom = new Container() {

					public void initUI() {
						try {
							setBackColor(cores.branco);
							Image i = new Image("img/talheres1.png").getSmoothScaledInstance(ctBottom.getWidth()*10/100, ctBottom.getHeight()*50/100);
							i.applyColor2(cores.cinza);

							ini  = new Button(i);
							ini.setBorder(BORDER_NONE);
							add(ini,LEFT,TOP,PARENTSIZE+15,PARENTSIZE);

							Image i2 = new Image("img/buscar1.png").getSmoothScaledInstance(ctBottom.getWidth()*10/100, ctBottom.getHeight()*50/100);
							i2.applyColor2(cores.cinza);
							pesq  = new Button(i2);
							pesq.setBorder(BORDER_NONE);
							add(pesq,AFTER,TOP,SAME,PARENTSIZE);

							Image i3 = new Image("img/seta1.png").getSmoothScaledInstance(ctBottom.getWidth()*10/100, ctBottom.getHeight()*50/100);
							i3.applyColor2(cores.cinza);
							hist  = new Button(i3);
							hist.setBorder(BORDER_NONE);
							add(hist,AFTER,TOP,SAME,PARENTSIZE);

							Image i4 = new Image("img/perfil1.png").getSmoothScaledInstance(ctBottom.getWidth()*10/100, ctBottom.getHeight()*50/100);
							i4.applyColor2(cores.vermelho);
							perf  = new Button("Perfil",i4,BOTTOM,8);
							perf.setFont(Font.getFont(perf.getFont().size*80/100));
							perf.setForeColor(cores.vermelho);
							perf.setBorder(BORDER_NONE);
							add(perf,AFTER,TOP,PARENTSIZE+55,PARENTSIZE);

						}catch(Exception e) {
							e.printStackTrace();
						}
					}
				};

				add(ctBottom,LEFT, BOTTOM, PARENTSIZE,PREFERRED+200);
				tb.setActiveTab(3);
			}

			if(tb == e.target && tb.focusTraversable) {
				switch(tb.getActiveTab()) {
				case 0 :
					ctBottom.removeAll();

					ctBottom = new Container() {
						public void initUI() {
							try{
								setBackColor(cores.branco);
								Image i = new Image("img/talheres1.png").getSmoothScaledInstance(ctBottom.getWidth()*10/100, ctBottom.getHeight()*50/100);
								i.applyColor2(cores.vermelho);
								ini  = new Button("Início",i,BOTTOM,8); 
								ini.setFont(Font.getFont(ini.getFont().size*80/100));
								ini.setForeColor(cores.vermelho);
								ini.setBorder(BORDER_NONE);
								add(ini,LEFT,TOP,PARENTSIZE+55,PARENTSIZE);

								Image i2 = new Image("img/buscar1.png").getSmoothScaledInstance(ctBottom.getWidth()*10/100, ctBottom.getHeight()*50/100);
								i2.applyColor2(cores.cinza);
								pesq  = new Button(i2);
								pesq.setBorder(BORDER_NONE);
								add(pesq,AFTER,TOP,PARENTSIZE+15,PARENTSIZE);

								Image i3 = new Image("img/seta1.png").getSmoothScaledInstance(ctBottom.getWidth()*10/100, ctBottom.getHeight()*50/100);
								i3.applyColor2(cores.cinza);
								hist  = new Button(i3);
								hist.setBorder(BORDER_NONE);
								add(hist,AFTER,TOP,SAME,PARENTSIZE);

								Image i4 = new Image("img/perfil1.png").getSmoothScaledInstance(ctBottom.getWidth()*10/100, ctBottom.getHeight()*50/100);
								i4.applyColor2(cores.cinza);
								perf  = new Button(i4);
								perf.setBorder(BORDER_NONE);
								add(perf,AFTER,TOP,SAME,PARENTSIZE);

							}catch(Exception e) {
								e.printStackTrace();
							}
						}
					};

					add(ctBottom,LEFT, BOTTOM, PARENTSIZE,PREFERRED+200);
					break;
				case 1:
					ctBottom.removeAll();

					ctBottom = new Container() {
						public void initUI() {
							try {
								setBackColor(cores.branco);
								Image i = new Image("img/talheres1.png").getSmoothScaledInstance(ctBottom.getWidth()*10/100, ctBottom.getHeight()*50/100);
								i.applyColor2(cores.cinza);
								ini  = new Button(i);
								ini.setBorder(BORDER_NONE);
								add(ini,LEFT,TOP,PARENTSIZE+15,PARENTSIZE);

								Image i2 = new Image("img/buscar1.png").getSmoothScaledInstance(ctBottom.getWidth()*10/100, ctBottom.getHeight()*50/100);
								i2.applyColor2(cores.vermelho);
								pesq  = new Button("Busca",i2,BOTTOM,8);
								pesq.setFont(Font.getFont(pesq.getFont().size*80/100));
								pesq.setForeColor(cores.vermelho);
								pesq.setBorder(BORDER_NONE);
								add(pesq,AFTER,TOP,PARENTSIZE+55,PARENTSIZE);

								Image i3 = new Image("img/seta1.png").getSmoothScaledInstance(ctBottom.getWidth()*10/100, ctBottom.getHeight()*50/100);
								i3.applyColor2(cores.cinza);
								hist  = new Button(i3);
								hist.setBorder(BORDER_NONE);
								add(hist,AFTER,TOP,PARENTSIZE+15,PARENTSIZE);

								Image i4 = new Image("img/perfil1.png").getSmoothScaledInstance(ctBottom.getWidth()*10/100, ctBottom.getHeight()*50/100);
								i4.applyColor2(cores.cinza);
								perf  = new Button(i4);
								perf.setBorder(BORDER_NONE);
								add(perf,AFTER,TOP,SAME,PARENTSIZE);
							}catch(Exception e) {
								e.printStackTrace();
							}
						}
					};

					add(ctBottom,LEFT, BOTTOM, PARENTSIZE,PREFERRED+200);
					break;
				case 2:
					ctBottom.removeAll();

					ctBottom = new Container() {
						public void initUI() {
							try {
								setBackColor(cores.branco);
								Image i = new Image("img/talheres1.png").getSmoothScaledInstance(ctBottom.getWidth()*10/100, ctBottom.getHeight()*50/100);
								i.applyColor2(cores.cinza);
								ini  = new Button(i);
								ini.setBorder(BORDER_NONE);
								add(ini,LEFT,TOP,PARENTSIZE+15,PARENTSIZE);

								Image i2 = new Image("img/buscar1.png").getSmoothScaledInstance(ctBottom.getWidth()*10/100, ctBottom.getHeight()*50/100);
								i2.applyColor2(cores.cinza);
								pesq  = new Button(i2);
								pesq.setBorder(BORDER_NONE);
								add(pesq,AFTER,TOP,SAME,PARENTSIZE);

								Image i3 = new Image("img/seta1.png").getSmoothScaledInstance(ctBottom.getWidth()*10/100, ctBottom.getHeight()*50/100);
								i3.applyColor2(cores.vermelho);
								hist  = new Button("Histórico",i3,BOTTOM,8);
								hist.setFont(Font.getFont(hist.getFont().size*80/100));
								hist.setForeColor(cores.vermelho);
								hist.setBorder(BORDER_NONE);
								add(hist,AFTER,TOP,PARENTSIZE+55,PARENTSIZE);

								Image i4 = new Image("img/perfil1.png").getSmoothScaledInstance(ctBottom.getWidth()*10/100, ctBottom.getHeight()*50/100);
								i4.applyColor2(cores.cinza);
								perf  = new Button(i4);
								perf.setBorder(BORDER_NONE);
								add(perf,AFTER,TOP,PARENTSIZE+15,PARENTSIZE);
							}catch(Exception e) {
								e.printStackTrace();
							}
						}
					};

					add(ctBottom,LEFT, BOTTOM, PARENTSIZE,PREFERRED+200);
					break;
				case 3:
					ctBottom.removeAll();

					ctBottom = new Container() {

						public void initUI() {
							try {
								setBackColor(cores.branco);
								Image i = new Image("img/talheres1.png").getSmoothScaledInstance(ctBottom.getWidth()*10/100, ctBottom.getHeight()*50/100);
								i.applyColor2(cores.cinza);

								ini  = new Button(i);
								ini.setBorder(BORDER_NONE);
								add(ini,LEFT,TOP,PARENTSIZE+15,PARENTSIZE);

								Image i2 = new Image("img/buscar1.png").getSmoothScaledInstance(ctBottom.getWidth()*10/100, ctBottom.getHeight()*50/100);
								i2.applyColor2(cores.cinza);
								pesq  = new Button(i2);
								pesq.setBorder(BORDER_NONE);
								add(pesq,AFTER,TOP,SAME,PARENTSIZE);

								Image i3 = new Image("img/seta1.png").getSmoothScaledInstance(ctBottom.getWidth()*10/100, ctBottom.getHeight()*50/100);
								i3.applyColor2(cores.cinza);
								hist  = new Button(i3);
								hist.setBorder(BORDER_NONE);
								add(hist,AFTER,TOP,SAME,PARENTSIZE);

								Image i4 = new Image("img/perfil1.png").getSmoothScaledInstance(ctBottom.getWidth()*10/100, ctBottom.getHeight()*50/100);
								i4.applyColor2(cores.vermelho);
								perf  = new Button("Perfil",i4,BOTTOM,8);
								perf.setFont(Font.getFont(perf.getFont().size*80/100));
								perf.setForeColor(cores.vermelho);
								perf.setBorder(BORDER_NONE);
								add(perf,AFTER,TOP,PARENTSIZE+55,PARENTSIZE);

							}catch(Exception e) {
								e.printStackTrace();
							}
						}
					};

					add(ctBottom,LEFT, BOTTOM, PARENTSIZE,PREFERRED+200);
					break;
				}
			}
			
		
			break;

		}
	}
}
