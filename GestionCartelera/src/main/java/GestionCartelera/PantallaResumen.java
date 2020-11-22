package GestionCartelera;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class PantallaResumen extends VentanaMedia implements ActionListener {

	private static final long serialVersionUID = 1L;
	
	JLabel Sabado,Domingo;
	JButton Atras,Siguiente;
	JTextArea TextSabado,TextDomingo;
	ControladorVentana Padre;
	int hasloaded=0;
	TiempoFormater TF;
	
	@Override
	public void Limpiar()
	{
		if(hasloaded==1)
		{
			String out="";
			for(Pelicula inPeli: Padre.Dias[0].getPelisHoy())
			{
				out+=inPeli.getNombre()+"\n"+TF.MinutosAString(inPeli.minutosDuracion)+"\n-------------------------------\n";
			}
			TextSabado.setText(out);
			
			out="";
			for(Pelicula inPeli: Padre.Dias[1].getPelisHoy())
			{
				out+=inPeli.getNombre()+"\n"+TF.MinutosAString(inPeli.minutosDuracion)+"\n-------------------------------\n";
			}
			TextDomingo.setText(out);
		}
	}
	
	PantallaResumen(ControladorVentana iPadre)
	{
		hasloaded=1;
		Padre = iPadre; 
		this.setLayout(null);
		this.setSize(800, 600);
		
		TF = new TiempoFormater();
		
		Sabado = new JLabel("SABADO");
		Sabado.setBounds(50,-25,200,200);
		add(Sabado);
		
		Domingo = new JLabel("DOMINGO");
		Domingo.setBounds(400,-25,200,200);
		add(Domingo);
		
		TextSabado = new JTextArea();
		TextSabado.setBounds(50, 100, 300, 400);
		TextSabado.setEditable(false);
		add(TextSabado);
		
		TextDomingo = new JTextArea();
		TextDomingo.setBounds(400, 100, 300, 400);
		TextDomingo.setEditable(false);
		add(TextDomingo);
		
		Siguiente = new JButton("Siguiente");
		Siguiente.setBounds(500, 500, 150, 50);
		Siguiente.addActionListener(this);
		this.add(Siguiente);
		
		Atras = new JButton("Cancelar");
		Atras.setBounds(50, 500, 150, 50);
		Atras.addActionListener(this);
		this.add(Atras);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		if(arg0.getSource()==Atras)
		{
			Padre.SetVentanaActual(0);
		}
		
	}
}
