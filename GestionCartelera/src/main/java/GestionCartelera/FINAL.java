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

		JLabel disfrutaLabel = new JLabel("DISFRUTA");
		disfrutaLabel.setFont(new Font("Serif", Font.BOLD, 40));
		disfrutaLabel.setForeground(Color.lightGray);
		disfrutaLabel.setBounds(270, 50, 300, 300);
		panel.add(disfrutaLabel);
				

		JLabel sesionLabel = new JLabel("DE LA SESION!!");
		sesionLabel.setFont(new Font("Serif", Font.BOLD, 40));
		sesionLabel.setForeground(Color.lightGray);
		sesionLabel.setBounds(220, 80, 400, 450);
		panel.add(sesionLabel);

}
}