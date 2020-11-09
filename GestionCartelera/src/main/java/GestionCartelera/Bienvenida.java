package GestionCartelera;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Bienvenida extends JPanel{

	ControladorVentana Padre;

	Bienvenida(ControladorVentana inPadre) {

		Padre = inPadre;
		this.setLayout(null);
    	this.setSize(800, 600);

		JLabel userLabel = new JLabel("BIENVENIDA");
		userLabel.setFont(new Font("Serif", Font.BOLD, 40));
		userLabel.setForeground(Color.lightGray);
		userLabel.setBounds(270, 50, 300, 300);
		this.add(userLabel);
				

		JLabel passwordLabel = new JLabel("AL CINE ELORRIETA");
		passwordLabel.setFont(new Font("Serif", Font.BOLD, 40));
		passwordLabel.setForeground(Color.lightGray);
		passwordLabel.setBounds(190, 80, 430, 490);
		this.add(passwordLabel);

	}
}