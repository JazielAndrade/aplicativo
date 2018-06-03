package view;

import interfaces.cores;
import totalcross.io.IOException;
import totalcross.ui.Button;
import totalcross.ui.Container;
import totalcross.ui.ImageControl;
import totalcross.ui.Label;
import totalcross.ui.ScrollContainer;
import totalcross.ui.font.Font;
import totalcross.ui.gfx.Color;
import totalcross.ui.image.Image;
import totalcross.ui.image.ImageException;

public class OpcoesDeEstabelimento extends Container {
	Container CTBody, tex,ctTop;

	private Container cont;
	private Container cont2,but;
	private ImageControl imgIcon;
	private Label lbValue;
	private Label lbText;
	public static Button pesqui;

	public void initUI(){
		CTBody = new Container() {
			public void initUI() {
				ctTop = new Container() {
					public void initUI() {
						setBackColor(cores.branco);
						Label h1 = new Label("Chef's Club");

						add(h1, CENTER,CENTER,PARENTSIZE+90,PREFERRED); 
						Image i2;
						try {
						
							i2 = new Image("img/buscar1.png").getSmoothScaledInstance(ctTop.getWidth()*10/100, ctTop.getHeight()*60/100);
							i2.applyColor2(cores.cinza);
							pesqui  = new Button(i2);
							pesqui.setBorder(BORDER_NONE);
							add(pesqui,RIGHT - 50,CENTER,ctTop.getWidth()*11/100,PARENTSIZE);
							
						} catch (IOException | ImageException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
					}
				};

				add(ctTop,LEFT, AFTER, PARENTSIZE,PREFERRED+200);

				ScrollContainer sc = new ScrollContainer() {
					public void initUI() {
						setBackColor(cores.fundo_cinza);
						but = new Container() {
							public void initUI() {

								try {
									Image i = new Image("img/now.png").getSmoothScaledInstance(but.getWidth()*9/100, but.getHeight()*40/100);
									Button b1 = new Button("Agora",i,BOTTOM,8);
									b1.setFont(Font.getFont(b1.getFont().size*90/100));
									b1.setBackColor(0xfffffe);

									b1.setBorder(BORDER_NONE);
									add(b1,LEFT-20, TOP, PARENTSIZE+25, PARENTSIZE);

									Image i2 = new Image("img/food12.png").getSmoothScaledInstance(but.getWidth()*9/100, but.getHeight()*40/100);
									Button b2 = new Button("Almoço",i2,BOTTOM,8);
									b2.setBackColor(0xfffffe);
									b2.setFont(Font.getFont(b2.getFont().size*90/100));
									b2.setBorder(BORDER_NONE);
									add(b2,AFTER+10, TOP,PARENTSIZE+25, PARENTSIZE);

									Image i3 = new Image("img/food13.png").getSmoothScaledInstance(but.getWidth()*9/100, but.getHeight()*40/100);
									Button b3 = new Button("Jantar",i3,BOTTOM,8);
									b3.setFont(Font.getFont(b3.getFont().size*90/100));
									b3.setBorder(BORDER_NONE);
									b3.setBackColor(0xfffffe);
									add(b3,AFTER+10, TOP,PARENTSIZE+25, PARENTSIZE);

									Image i4 = new Image("img/calendar-2561.png").getSmoothScaledInstance(but.getWidth()*9/100, but.getHeight()*40/100);
									i4.applyColor2(0x000000);
									Button b4 = new Button("Reserva",i4,BOTTOM,8);
									b4.setBorder(BORDER_NONE);
									b4.setFont(Font.getFont(b4.getFont().size*90/100));
									b4.setBackColor(0xfffffe);
									add(b4,AFTER+10, TOP,PARENTSIZE+25, PARENTSIZE);
								}catch(Exception e) {
									e.printStackTrace();
								}
							}
						};
						add(but,LEFT,AFTER+10,ctTop.getWidth(),PREFERRED+250);

						cont = new Container() {
							public void initUI() {
								setBackColor(cores.branco);
								Label ll = new Label("RESTAURANTES RECOMENDADOS");
								add(ll, CENTER, CENTER, PARENTSIZE+90, PREFERRED);

							}
						};
						add(cont, LEFT, AFTER+30, ctTop.getWidth(),PREFERRED+130);

						tex = new Container() {
							public void initUI() {
								setBackColor(cores.branco);
								tex = new Container() {//aqui
									public void initUI() {		
										tex = new Container() {
											public void initUI() {

												try {

													cont = new Container() {
														public void initUI() {
															try {
																imgIcon = new ImageControl(new Image("img/imgFood2ed.png").getSmoothScaledInstance(cont.getWidth(), cont.getHeight()));
																add(imgIcon, CENTER, TOP, PREFERRED, PREFERRED);
															}catch(Exception e) {
																e.printStackTrace();
															}
														}
													};

													add(cont, LEFT, TOP, PARENTSIZE, PARENTSIZE+50);

													cont2 = new Container() {
														public void initUI() {

															cont.borderColor = 0xffffff;

															lbValue = new Label("Lar do Sabor");
															Font f = Font.getFont(true,Font.NORMAL_SIZE+2);
															lbValue.setFont(f);
															lbValue.setForeColor(0x363636);
															lbText = new Label("Lanchonete");
															lbText.setForeColor(0x215968);
															add(lbValue, CENTER, AFTER, PREFERRED, PREFERRED);
															add(lbText, CENTER, AFTER, PREFERRED, PREFERRED);

															Button o = new Button("-30%");

															o.setBackForeColors( Color.RED,0xffffff);

															add(o,LEFT, BOTTOM, PREFERRED + 50, PREFERRED+20);


														}
													};

													add(cont2, LEFT, AFTER, PARENTSIZE, PARENTSIZE+50);

												} catch (Exception e) {
													e.printStackTrace();
												} 

											}
										};

										add(tex, LEFT,AFTER,PARENTSIZE+95/2,PARENTSIZE);

										tex = new Container() {
											public void initUI() {


												try {

													cont = new Container() {
														public void initUI() {
															try {
																imgIcon = new ImageControl(new Image("img/imgFood1ed.jpg").getSmoothScaledInstance(cont.getWidth(), cont.getHeight()));
																add(imgIcon, CENTER, TOP, PREFERRED, PREFERRED);
															}catch(Exception e) {
																e.printStackTrace();
															}
														}
													};

													add(cont, LEFT, TOP, PARENTSIZE, PARENTSIZE+50);

													cont2 = new Container() {
														public void initUI() {

															cont.borderColor = 0xffffff;

															lbValue = new Label("Sirí Cascudo");
															Font f = Font.getFont(true,Font.NORMAL_SIZE+2);
															lbValue.setFont(f);
															lbValue.setForeColor(0x363636);
															lbText = new Label("Hamburgueria");
															lbText.setForeColor(0x215968);
															add(lbValue, CENTER, AFTER, PREFERRED, PREFERRED);
															add(lbText, CENTER, AFTER, PREFERRED, PREFERRED);

															Button o = new Button("-30%");

															o.setBackForeColors( Color.RED,0xffffff);

															add(o,LEFT, BOTTOM, PREFERRED + 50, PREFERRED+20);


														}
													};

													add(cont2, LEFT, AFTER, PARENTSIZE, PARENTSIZE+50);

												} catch (Exception e) {
													e.printStackTrace();
												} 
											}
										};

										add(tex, RIGHT,SAME,PARENTSIZE+95/2,PARENTSIZE);

									}
								
								};
								add(tex,CENTER,CENTER,PARENTSIZE + 90,PARENTSIZE+90);

							}
						};
						add(tex,LEFT,AFTER+10,ctTop.getWidth(),PREFERRED+1100);

						tex = new Container() {
							public void initUI() {
								setBackColor(cores.branco);

								tex = new Container() {
									public void initUI() {		
										tex = new Container() {
											public void initUI() {

												try {

													cont = new Container() {
														public void initUI() {
															try {
																imgIcon = new ImageControl(new Image("img/imgFood7.jpg").getSmoothScaledInstance(cont.getWidth(), cont.getHeight()));
																add(imgIcon, CENTER, TOP, PREFERRED, PREFERRED);
															}catch(Exception e) {
																e.printStackTrace();
															}
														}
													};

													add(cont, LEFT, TOP, PARENTSIZE, PARENTSIZE+50);

													cont2 = new Container() {
														public void initUI() {

															cont.borderColor = 0xffffff;

															lbValue = new Label("Chine is here");
															Font f = Font.getFont(true,Font.NORMAL_SIZE+2);
															lbValue.setFont(f);
															lbValue.setForeColor(0x363636);
															lbText = new Label("Restaurante Chinês");
															lbText.setForeColor(0x215968);
															add(lbValue, CENTER, AFTER, PREFERRED, PREFERRED);
															add(lbText, CENTER, AFTER, PREFERRED, PREFERRED);

															Button o = new Button("-30%");

															o.setBackForeColors( Color.RED,0xffffff);

															add(o,LEFT, BOTTOM, PREFERRED + 50, PREFERRED+20);


														}
													};

													add(cont2, LEFT, AFTER, PARENTSIZE, PARENTSIZE+50);

												} catch (Exception e) {
													e.printStackTrace();
												} 

											}
										};

										add(tex, LEFT,AFTER,PARENTSIZE+95/2,PARENTSIZE);

										tex = new Container() {
											public void initUI() {


												try {

													cont = new Container() {
														public void initUI() {
															try {
																imgIcon = new ImageControl(new Image("img/imgFood8.jpg").getSmoothScaledInstance(cont.getWidth(), cont.getHeight()));
																add(imgIcon, CENTER, TOP, PREFERRED, PREFERRED);
															}catch(Exception e) {
																e.printStackTrace();
															}
														}
													};

													add(cont, LEFT, TOP, PARENTSIZE, PARENTSIZE+50);

													cont2 = new Container() {
														public void initUI() {

															cont.borderColor = 0xffffff;

															lbValue = new Label("Le Restô");
															Font f = Font.getFont(true,Font.NORMAL_SIZE+2);
															lbValue.setFont(f);
															lbValue.setForeColor(0x363636);
															lbText = new Label("Restaurante");
															lbText.setForeColor(0x215968);
															add(lbValue, CENTER, AFTER, PREFERRED, PREFERRED);
															add(lbText, CENTER, AFTER, PREFERRED, PREFERRED);

															Button o = new Button("-30%");

															o.setBackForeColors( Color.RED,0xffffff);

															add(o,LEFT, BOTTOM, PREFERRED + 50, PREFERRED+20);


														}
													};

													add(cont2, LEFT, AFTER, PARENTSIZE, PARENTSIZE+50);

												} catch (Exception e) {
													e.printStackTrace();
												} 
											}
										};

										add(tex, RIGHT,SAME,PARENTSIZE+95/2,PARENTSIZE);

									}
									
								};
								add(tex,CENTER,AFTER,PARENTSIZE + 90,PARENTSIZE+90);
							}
						};
						add(tex,LEFT,AFTER,ctTop.getWidth(),PREFERRED+1100);
					}
				};
				

				add(sc,LEFT,AFTER,PARENTSIZE,CTBody.getHeight() - ctTop.getHeight());
                
			}

		};

		add(CTBody,LEFT,TOP,PARENTSIZE,PARENTSIZE);
	}
}