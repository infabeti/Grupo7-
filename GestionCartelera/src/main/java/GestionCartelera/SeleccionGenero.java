package GestionCartelera;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class SeleccionGenero {

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

		JLabel userLabel = new JLabel("Seleccion De Genero");
		userLabel.setBounds(40, 10, 300, 25);
		userLabel.setFont(new Font("Serif", Font.BOLD, 30));
		userLabel.setForeground(Color.lightGray);
		panel.add(userLabel);;

		JButton loginButton = new JButton("DRAMA");
		loginButton.setBounds(40, 80, 140, 25);
		panel.add(loginButton);
		
		JButton registerButton = new JButton("COMEDIO");
		registerButton.setBounds(40, 160, 140, 25);
		panel.add(registerButton);
		
		JButton loginButton1 = new JButton("TERROR");
		loginButton1.setBounds(40, 240, 140, 25);
		panel.add(loginButton1);
		
		JButton registerButton1 = new JButton("CIENCIA FICCION");
		registerButton1.setBounds(40, 320, 140, 25);
		panel.add(registerButton1);
		
		JButton loginButton11 = new JButton("SABADO");
		loginButton11.setBounds(400, 20, 140, 25);
		panel.add(loginButton11);
		
		JButton registerButton11 = new JButton("DOMINGO");
		registerButton11.setBounds(550, 20, 140, 25);
		panel.add(registerButton11);
	}

}
