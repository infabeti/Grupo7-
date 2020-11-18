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
	
	static VentanaLogin tempologin;
	
	JLabel imgfondo;
    JLabel textUser,textPSWD;
    JTextField inUser;
    JPasswordField inPSWD;
    JButton Login;
    ControladorVentana Padre;
    JLabel Error;
    LoginControler LoginC;
    
    VentanaLogin(ControladorVentana inPadre)
    {
    	LoginC = new LoginControler("admin", ("nimda").toCharArray());
    	Padre = inPadre;
    	this.setLayout(null);
    	this.setSize(800, 600);
    	this.setBackground(Color.WHITE);

        textUser = new JLabel("Usuario:");
        textUser.setFont(new Font(textUser.getFont().getName(), Font.PLAIN, 30));
        textUser.setBounds(260, 120, 300, 50);
        add(textUser);

        inUser =  new JTextField();
        inUser.setBounds(300,170,200,50);
        inUser.setFont(new Font(inUser.getFont().getName(), Font.PLAIN, 20));
        add(inUser);

        textPSWD = new JLabel("Contraseña:");
        textPSWD.setFont(textUser.getFont());
        textPSWD.setBounds(260, 220, 300, 50);
        add(textPSWD);

        inPSWD =  new JPasswordField();
        inPSWD.setBounds(300,270,200,50);
        inPSWD.setFont(inUser.getFont());
        add(inPSWD);

        Login= new JButton("Login");
        Login.setBounds(248, 350, 300, 40);
        Login.setFont(inUser.getFont());
        Login.addActionListener(this);
        add(Login);

        Error=new JLabel("");
        Error.setForeground(Color.RED);
        Error.setBounds(228, 520, 300, 20);
        add(Error);
    }

	@Override
	public void actionPerformed(ActionEvent arg0) {
		if(arg0.getSource()==Login)
		{
			String Usuario = inUser.getText();
			char[] Contrasena = (inPSWD.getPassword());
			if(LoginC.compararContrasenas(Usuario, Contrasena))
			{
				Padre.SetVentanaActual(2);
			}
			else
				Error.setText("Login fallido");
		}
		
	}

	public void setDefaultCloseOperation(int exitOnClose) {
		// TODO Auto-generated method stub
		
	}
}
