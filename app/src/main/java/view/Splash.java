package view;

import totalcross.io.IOException;
import totalcross.sys.Vm;
import totalcross.ui.Container;
import totalcross.ui.ImageControl;
import totalcross.ui.image.Image;
import totalcross.ui.image.ImageException;

public class Splash extends Container{
	
	
	ImageControl imgC;
	Image img;
	public void initUI() {
			try {
				
				img = new Image("img/ft.png").getSmoothScaledInstance(getWidth(), getHeight());
				imgC = new ImageControl(img);
				add(imgC,CENTER,CENTER,PARENTSIZE,PARENTSIZE); 
				repaintNow();
				Vm.sleep(2000);
				
				new Login().swapToTopmostWindow();
				
			} catch (IOException | ImageException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
}
