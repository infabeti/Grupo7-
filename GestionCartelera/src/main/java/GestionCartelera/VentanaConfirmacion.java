package GestionCartelera;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class VentanaConfirmacion extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
	PantallaResumen Padre;
	Dia Sabado,Domingo;
	JButton SiButton,NoButton;
	
	VentanaConfirmacion(PantallaResumen inPadre) {
		
		Padre = inPadre;
		this.setLayout(null);
		this.setSize(400, 300);
		

		JLabel confirmacionLabel = new JLabel("Estas Seguro");
		confirmacionLabel.setBounds(40, 10, 300, 25);
		confirmacionLabel.setFont(new Font("Serif", Font.BOLD, 30));
		confirmacionLabel.setForeground(Color.lightGray);
		this.add(confirmacionLabel);;

		SiButton = new JButton("Si");
		SiButton.setBounds(40, 80, 140, 25);
		SiButton.addActionListener(this);
		this.add(SiButton);
	
		NoButton = new JButton("No");
		NoButton.setBounds(40, 160, 140, 25);
		NoButton.addActionListener(this);
		this.add(NoButton);
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		if(arg0.getSource()==SiButton)
		{
			JOptionPane.showMessageDialog(null, "Se ha guardado la configuracion");
			this.setVisible(false); 
			this.dispose();
			System.exit(NORMAL);
		}
		else if(arg0.getSource()==NoButton)
		{
			Padre.Padre.SetVentanaActual(0);
			this.setVisible(false); 
			this.dispose();
		}
		
	}
}

	