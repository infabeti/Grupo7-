package GestionCartelera;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		//Creamos un controlador de peliculas con todas las peliculas
		ControladorPelicula CrontPeli = new ControladorPelicula();
		//añadimos todas las pelis
		CrontPeli.AnadirPeli(new Pelicula(1,1,"Handia",116));
		CrontPeli.AnadirPeli(new Pelicula(1,2,"La lista de Schindler",197));
		CrontPeli.AnadirPeli(new Pelicula(1,3,"Cadena Perpetua",142));
		CrontPeli.AnadirPeli(new Pelicula(1,4,"Million Dollar Baby",133));
		CrontPeli.AnadirPeli(new Pelicula(2,5,"2001: Odisea en el espacio",142));
		CrontPeli.AnadirPeli(new Pelicula(2,6,"La novia de Frankenstein",75));
		CrontPeli.AnadirPeli(new Pelicula(2,7,"El planeta de los simios",115));
		CrontPeli.AnadirPeli(new Pelicula(2,8,"Alien, el octavo pasajero",117));
		CrontPeli.AnadirPeli(new Pelicula(3,9,"Scary movie",90));
		CrontPeli.AnadirPeli(new Pelicula(3,10,"El gran Lebowsky",119));
		CrontPeli.AnadirPeli(new Pelicula(3,11,"La vida de Brian",94));
		CrontPeli.AnadirPeli(new Pelicula(3,12,"Aterriza como puedas",88));
		CrontPeli.AnadirPeli(new Pelicula(4,13,"Psicosis",109));
		CrontPeli.AnadirPeli(new Pelicula(4,14,"El resplandor",146));
		CrontPeli.AnadirPeli(new Pelicula(4,15,"Dracula",155));
		CrontPeli.AnadirPeli(new Pelicula(4,15,"Cisne negro",110));
		
		//Creamos la ventana principal y le damos 
		ControladorVentana Princicpal = new ControladorVentana(CrontPeli);
		Princicpal.setBounds(0,0,800,600);
		Princicpal.setVisible(true);
        Princicpal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Princicpal.setResizable(false);
        
        Princicpal.PushVentana(new Bienvenida(Princicpal));
	}

}
