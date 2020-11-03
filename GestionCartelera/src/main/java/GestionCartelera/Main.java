package GestionCartelera;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		//Creanis la ventana principal y le damos 
		ControladorVentana Princicpal = new ControladorVentana();
		Princicpal.setBounds(0,0,800,600);
		Princicpal.setVisible(true);
        Princicpal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Princicpal.setResizable(false);
        
        Princicpal.PushVentana(new VentanaLogin(Princicpal));
	}

}
