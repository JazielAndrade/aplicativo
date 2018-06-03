package view;

import totalcross.ui.Bar;
import totalcross.ui.Container;
import totalcross.ui.Label;
import totalcross.ui.font.Font;
import totalcross.ui.gfx.Color;

public class Reserva extends Container {
	public void initUI(){
		Font f = Font.getFont(true,Font.NORMAL_SIZE+2);
		Bar h1 = new Bar("Chef's Club");
		h1.canSelectTitle = true;
		h1.setFont(f);
		h1.setBackForeColors(0x1C1C1C,Color.WHITE);
		add(h1, LEFT,0,FILL,PREFERRED); 
		
		Label c = new Label("Faça aqui sua reserva");
		add(c,CENTER,CENTER);
		 
		
		
	}
}
