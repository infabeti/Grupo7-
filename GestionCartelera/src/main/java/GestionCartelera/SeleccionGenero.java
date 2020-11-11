package GestionCartelera;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SeleccionGenero{

	public static void main(String[] args) {
		JFrame frame = new JFrame("Ventana Seleccion de Genero");
		frame.setSize(800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		frame.add(panel);
		placeComponents(panel);

		frame.setVisible(true);
	}

	private static void placeComponents(JPanel panel) {

		panel.setLayout(null);

		JLabel seleccionLabel = new JLabel("Seleccion De Genero");
		seleccionLabel.setBounds(40, 10, 300, 25);
		seleccionLabel.setFont(new Font("Serif", Font.BOLD, 30));
		seleccionLabel.setForeground(Color.lightGray);
		panel.add(seleccionLabel);;

		JButton dramaButton = new JButton("DRAMA");
		dramaButton.setBounds(40, 80, 140, 25);
		panel.add(dramaButton);
	
		JButton comediaButton = new JButton("COMEDIA");
		comediaButton.setBounds(40, 160, 140, 25);
		panel.add(comediaButton);
		
		JButton terrorButton = new JButton("TERROR");
		terrorButton.setBounds(40, 240, 140, 25);
		panel.add(terrorButton);
		
		JButton cienciaButton = new JButton("CIENCIA FICCION");
		cienciaButton.setBounds(40, 320, 140, 25);
		panel.add(cienciaButton);
		
		JButton sabadoButton = new JButton("SABADO");
		sabadoButton.setBounds(400, 20, 140, 25);
		panel.add(sabadoButton);
		
		JButton domingoButton = new JButton("DOMINGO");
		domingoButton.setBounds(550, 20, 140, 25);
		panel.add(domingoButton);
		
	
	}
}
