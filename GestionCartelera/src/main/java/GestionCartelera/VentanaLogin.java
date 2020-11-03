package GestionCartelera;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class VentanaLogin extends JPanel implements ActionListener {
	JLabel imgfondo;
    JLabel textDNI,textPSWD;
    JTextField inDNI;
    JPasswordField inPSWD;
    JButton Login;
    ControladorVentana Padre;
    JLabel Error;
    
    VentanaLogin(ControladorVentana inPadre)
    {
    	Padre = inPadre;
    	this.setLayout(null);
    	this.setSize(800, 600);
    	this.setBackground(Color.WHITE);

        textDNI = new JLabel("DNI:");
        textDNI.setFont(new Font(textDNI.getFont().getName(), Font.PLAIN, 30));
        textDNI.setBounds(260, 120, 100, 50);
        add(textDNI);

        inDNI =  new JTextField();
        inDNI.setBounds(300,170,200,50);
        inDNI.setFont(new Font(inDNI.getFont().getName(), Font.PLAIN, 20));
        add(inDNI);

        textPSWD = new JLabel("Contraseña:");
        textPSWD.setFont(textDNI.getFont());
        textPSWD.setBounds(260, 220, 300, 50);
        add(textPSWD);

        inPSWD =  new JPasswordField();
        inPSWD.setBounds(300,270,200,50);
        inPSWD.setFont(inDNI.getFont());
        add(inPSWD);

        Login= new JButton("Login");
        Login.setBounds(248, 350, 300, 40);
        Login.setFont(inDNI.getFont());
        Login.addActionListener(this);
        add(Login);

        Error=new JLabel("Error");
        Error.setForeground(Color.RED);
        Error.setBounds(228, 520, 300, 20);
        add(Error);
    }

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
