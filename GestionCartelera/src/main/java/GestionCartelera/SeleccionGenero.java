package GestionCartelera;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SeleccionGenero extends JPanel{

	private static final long serialVersionUID = 1L;
	ControladorVentana Padre;
	
	SeleccionGenero(ControladorVentana inPadre) {
		
		Padre = inPadre;
		this.setLayout(null);
		this.setSize(800, 600);

		JLabel seleccionLabel = new JLabel("Seleccion De Genero");
		seleccionLabel.setBounds(40, 10, 300, 25);
		seleccionLabel.setFont(new Font("Serif", Font.BOLD, 30));
		seleccionLabel.setForeground(Color.lightGray);
		this.add(seleccionLabel);;

		JButton dramaButton = new JButton("DRAMA");
		dramaButton.setBounds(40, 80, 140, 25);
		this.add(dramaButton);
	
		JButton comediaButton = new JButton("COMEDIA");
		comediaButton.setBounds(40, 160, 140, 25);
		this.add(comediaButton);
		
		JButton terrorButton = new JButton("TERROR");
		terrorButton.setBounds(40, 240, 140, 25);
		this.add(terrorButton);
		
		JButton cienciaButton = new JButton("CIENCIA FICCION");
		cienciaButton.setBounds(40, 320, 140, 25);
		this.add(cienciaButton);
		
		JButton sabadoButton = new JButton("SABADO");
		sabadoButton.setBounds(400, 20, 140, 25);
		this.add(sabadoButton);
		
		JButton domingoButton = new JButton("DOMINGO");
		domingoButton.setBounds(550, 20, 140, 25);
		this.add(domingoButton);
		
	
	}
}
