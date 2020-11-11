package GestionCartelera;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.util.ArrayList; 

@SuppressWarnings("serial")
public class ControladorVentana extends JFrame {
	ArrayList<JPanel> ListaVentanas;
	private int VentanaActual;
	private ControladorPelicula PeliControler;
	
	ControladorVentana(ControladorPelicula iPeliControler)
	{	
		setLayout(null);
		//Creamos el array dinamico
		ListaVentanas = new ArrayList<JPanel>();
		//creamos el controlador de peliculas
		PeliControler = iPeliControler;
		//Por defecto empieza en la ventana cero
		VentanaActual = 0;
	}
	
	public void PushVentana(JPanel inPanel)
	{
		//Añadimos la ventana al array de ventanas
		ListaVentanas.add(inPanel);
		//Añadimos la ventana al JFrame
		add(ListaVentanas.get(ListaVentanas.size()-1));
		//Si es la primera que añadimos la hacemos visble, el resto por defecto seran invisibles
		if(ListaVentanas.size()==1)
			ListaVentanas.get(ListaVentanas.size()-1).setVisible(true);
		else
			ListaVentanas.get(ListaVentanas.size()-1).setVisible(false);
		
		this.update(getGraphics());
	}
	
	public int GetVentanaActual()
	{
		return this.VentanaActual;
	}
	
	public void SetVentanaActual(int inVentana)
	{
		ListaVentanas.get(this.GetVentanaActual()).setVisible(false);
		ListaVentanas.get(inVentana).setVisible(true);
		this.VentanaActual = inVentana;
	}
}
