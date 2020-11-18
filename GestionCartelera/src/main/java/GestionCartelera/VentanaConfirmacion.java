package GestionCartelera;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class VentanaConfirmacion extends JPanel implements ActionListener{

	private static final long serialVersionUID = 1L;
	ControladorVentana Padre;
	Dia Sabado,Domingo;
	JButton dramaButton,comediaButton,terrorButton,cienciaButton,sabadoButton,domingoButton;
	
	VentanaConfirmacion(ControladorVentana inPadre) {
		
		Padre = inPadre;
		this.setLayout(null);
		this.setSize(800, 600);
		

		JLabel confirmacionLabel = new JLabel("Estas Seguro");
		confirmacionLabel.setBounds(40, 10, 300, 25);
		confirmacionLabel.setFont(new Font("Serif", Font.BOLD, 30));
		confirmacionLabel.setForeground(Color.lightGray);
		this.add(confirmacionLabel);;

		dramaButton = new JButton("Si");
		dramaButton.setBounds(40, 80, 140, 25);
		dramaButton.addActionListener(this);
		this.add(dramaButton);
	
		comediaButton = new JButton("No");
		comediaButton.setBounds(40, 160, 140, 25);
		comediaButton.addActionListener(this);
		this.add(comediaButton);
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}

	