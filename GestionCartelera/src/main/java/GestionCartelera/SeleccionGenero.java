package GestionCartelera;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class SeleccionGenero extends JPanel implements ActionListener{

	private static final long serialVersionUID = 1L;
	ControladorVentana Padre;
	Dia[] Dias = new Dia[2];
	JButton dramaButton,comediaButton,terrorButton,cienciaButton,sabadoButton,domingoButton;
	int currentDia=0;
	JTextArea OutPut;
	JLabel RestMin;
	TiempoFormater TF;
	
	SeleccionGenero(ControladorVentana inPadre) {
		
		Padre = inPadre;
		this.setLayout(null);
		this.setSize(800, 600);
		
		Dias[0] = new Dia(480);
		Dias[1] = new Dia(360);
		
		TF = new TiempoFormater();

		JLabel seleccionLabel = new JLabel("Seleccion De Genero");
		seleccionLabel.setBounds(40, 10, 300, 25);
		seleccionLabel.setFont(new Font("Serif", Font.BOLD, 30));
		seleccionLabel.setForeground(Color.lightGray);
		this.add(seleccionLabel);;

		dramaButton = new JButton("DRAMA");
		dramaButton.setBounds(40, 80, 140, 25);
		dramaButton.addActionListener(this);
		this.add(dramaButton);
	
		comediaButton = new JButton("COMEDIA");
		comediaButton.setBounds(40, 160, 140, 25);
		comediaButton.addActionListener(this);
		this.add(comediaButton);
		
		terrorButton = new JButton("TERROR");
		terrorButton.setBounds(40, 240, 140, 25);
		terrorButton.addActionListener(this);
		this.add(terrorButton);
		
		cienciaButton = new JButton("CIENCIA FICCION");
		cienciaButton.setBounds(40, 320, 140, 25);
		cienciaButton.addActionListener(this);
		this.add(cienciaButton);
		
		sabadoButton = new JButton("SABADO");
		sabadoButton.setBounds(400, 20, 140, 25);
		sabadoButton.addActionListener(this);
		this.add(sabadoButton);
		
		domingoButton = new JButton("DOMINGO");
		domingoButton.setBounds(550, 20, 140, 25);
		domingoButton.addActionListener(this);
		this.add(domingoButton);
		
		OutPut = new JTextArea();
		OutPut.setBounds(400, 100, 300, 400);
		OutPut.setEditable(false);
		this.add(OutPut);
		
		RestMin = new JLabel("8:00 restantes");
		RestMin.setBounds(400,500,200,50);
		this.add(RestMin);
	}
	
	public void updateTextAtrea()
	{
		ArrayList<Pelicula> PelisHoy = Dias[currentDia].getPelisHoy();
		String out="";
		for(Pelicula inPeli: PelisHoy)
		{
			out+=inPeli.getNombre()+"\n"+TF.MinutosAString(inPeli.minutosDuracion)+"\n-------------------------------\n";
		}
		OutPut.setText(out);
		RestMin.setText(TF.MinutosAString(Dias[currentDia].MinutosRestantes())+" restantes");
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		if(arg0.getSource()==dramaButton)
		{
			SeleccionPeli SP = new SeleccionPeli(Dias[currentDia], this, 1);
			SP.setVisible(true);
			SP.setBounds(0,0,400,600);
			SP.setResizable(false);
		}
		else if(arg0.getSource()==comediaButton)
		{
			SeleccionPeli SP = new SeleccionPeli(Dias[currentDia], this, 3);
			SP.setVisible(true);
			SP.setBounds(0,0,400,600);
			SP.setResizable(false);
		}
		else if(arg0.getSource()==cienciaButton)
		{
			SeleccionPeli SP = new SeleccionPeli(Dias[currentDia], this, 2);
			SP.setVisible(true);
			SP.setBounds(0,0,400,600);
			SP.setResizable(false);
		}
		else if(arg0.getSource()==terrorButton)
		{
			SeleccionPeli SP = new SeleccionPeli(Dias[currentDia], this, 4);
			SP.setVisible(true);
			SP.setBounds(0,0,400,600);
			SP.setResizable(false);
		}
		else if(arg0.getSource()==sabadoButton)
		{
			currentDia=0;
			this.updateTextAtrea();
		}
		else if(arg0.getSource()==domingoButton)
		{
			currentDia=1;
			this.updateTextAtrea();
		}
		
	}
}
