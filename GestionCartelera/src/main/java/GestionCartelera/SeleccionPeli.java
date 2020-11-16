package GestionCartelera;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class SeleccionPeli extends JFrame implements ActionListener{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Dia Hoy;
	SeleccionGenero Padre;
	JLabel SelecPeli;
	ArrayList<Pelicula> PelisHoy;
	TiempoFormater TF;
	JButton[] ListaBotones;
	
	SeleccionPeli(Dia inDia,SeleccionGenero inPadre, int Genero)
	{
		ListaBotones = new JButton[4];
		TF = new TiempoFormater();
		this.setLayout(null);
		
		Padre = inPadre;
		Hoy = inDia;
		
		SelecPeli = new JLabel("Seleccione la peli");
		SelecPeli.setBounds(10,10,300,25);
		this.add(SelecPeli);
		
		PelisHoy = Padre.Padre.PeliControler.GetPelisPorGenero(Genero);
		
		int pelisAnadidas=0;
		for(Pelicula inPeli: PelisHoy)
		{
			ListaBotones[pelisAnadidas] = new JButton(inPeli.getNombre()+" - Duracion:"+TF.MinutosAString(inPeli.getMinutos()));
			ListaBotones[pelisAnadidas].setBounds(50,50+50*pelisAnadidas,300,50);
			ListaBotones[pelisAnadidas].addActionListener(this);
			if(!Hoy.CabePeli(inPeli.getMinutos()))
			{
				ListaBotones[pelisAnadidas].setBackground(Color.RED);
				ListaBotones[pelisAnadidas].setEnabled(false);
			}
			this.add(ListaBotones[pelisAnadidas]);
			pelisAnadidas++;
		}
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		for(int i=0;i<4;i++)
		{
			if(arg0.getSource()==ListaBotones[i])
			{
				Hoy.AnadirPelicula(PelisHoy.get(i));
				this.setVisible(false); //you can't see me!
				this.dispose();
			}
		}
		
	}

}
