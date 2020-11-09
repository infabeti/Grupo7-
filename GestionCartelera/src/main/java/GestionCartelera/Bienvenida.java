package GestionCartelera;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Bienvenida {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Ventana Bienvenida");
		frame.setSize(800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		frame.add(panel);
		placeComponents(panel);

		frame.setVisible(true);
	}

	private static void placeComponents(JPanel panel) {

		panel.setLayout(null);

		JLabel userLabel = new JLabel("BIENVENIDA");
		userLabel.setFont(new Font("Serif", Font.BOLD, 40));
		userLabel.setForeground(Color.lightGray);
		userLabel.setBounds(270, 50, 300, 300);
		panel.add(userLabel);
				

		JLabel passwordLabel = new JLabel("AL CINE ELORRIETA");
		passwordLabel.setFont(new Font("Serif", Font.BOLD, 40));
		passwordLabel.setForeground(Color.lightGray);
		passwordLabel.setBounds(190, 80, 430, 490);
		panel.add(passwordLabel);

	}
}