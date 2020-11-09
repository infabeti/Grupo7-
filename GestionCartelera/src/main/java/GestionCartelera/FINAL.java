package GestionCartelera;


import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class FINAL {

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

		JLabel userLabel = new JLabel("DISFRUTA");
		userLabel.setFont(new Font("Serif", Font.BOLD, 40));
		userLabel.setForeground(Color.lightGray);
		userLabel.setBounds(270, 50, 300, 300);
		panel.add(userLabel);
				

		JLabel passwordLabel = new JLabel("DE LA SESION!!");
		passwordLabel.setFont(new Font("Serif", Font.BOLD, 40));
		passwordLabel.setForeground(Color.lightGray);
		passwordLabel.setBounds(220, 80, 400, 450);
		panel.add(passwordLabel);

}
}