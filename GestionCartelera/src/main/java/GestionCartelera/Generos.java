package GestionCartelera;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Generos {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Ventana  de Generos");
		frame.setSize(800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		frame.add(panel);
		placeComponents(panel);

		frame.setVisible(true);
	}

	private static void placeComponents(JPanel panel) {

		JLabel generos = new JLabel("Aqui tienes los generos");
		generos.setFont(new Font("Serif", Font.BOLD, 40));
		generos.setForeground(Color.lightGray);
		generos.setBounds(270, 50, 300, 300);
		
	}
}
