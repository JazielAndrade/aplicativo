package com.app;

import control.appControl;
import totalcross.sys.Settings;
import totalcross.ui.MainWindow;
import totalcross.ui.dialog.MessageBox;
import view.Cadastro;
import view.Splash;

public class app extends MainWindow{
	
	public static String nome= null;
	public static String email= null;
	static {
		Settings.companyInfo = "Teste1";
		Settings.appVersion = "1.04";
		Settings.windowSize = Settings.WINDOWSIZE_480X640;

	}

	public app() {
		setUIStyle(Settings.MATERIAL_UI); // Padrão
		Settings.uiAdjustmentsBasedOnFontHeight = true; //Fonte
		Settings.scrollDistanceOnMouseWheelMove = fmH*10;
	}

	public void initUI() {
		appControl.CriarConexao();
		if(appControl.CreateTable()) {

			new Splash().swapToTopmostWindow();

		}else {
			new MessageBox("Erro,", "Erro ao criar tabela").popup();
		}
		
	}

}

