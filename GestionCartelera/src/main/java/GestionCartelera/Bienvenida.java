package GestionCartelera;

import java.awt.Color;
import java.awt.Font;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class Bienvenida extends JPanel{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	class TimerEx {
	    public void main(String arglist[]) {
	    Timer timer;
	    timer = new Timer();

	    TimerTask task = new TimerTask() {
	        public void run()
	        {
	            // Aqui Añadimos la accion a realizar
	        	
	        	
	        }
	        };
	        // Empezamos dentro de 10ms y luego lanzamos la tarea cada 3000ms
	    timer.schedule(task, 0, 3000);
	    }
	}

	
	void initialize(){
	}
	//metodo que indica la accion al acabar el Timer "tiempo", cambiar system.exit(0) por la ventana de login
	protected void metodoTimer() {
	System.exit(0);
	}
	
	

	protected static final String VLogin = null;
	ControladorVentana Padre;

	Bienvenida(ControladorVentana inPadre) {

		Padre = inPadre;
		this.setLayout(null);
    	this.setSize(800, 600);

		JLabel bienvenidaLabel = new JLabel("BIENVENIDA");
		bienvenidaLabel.setFont(new Font("Serif", Font.BOLD, 40));
		bienvenidaLabel.setForeground(Color.lightGray);
		bienvenidaLabel.setBounds(270, 50, 300, 300);
		this.add(bienvenidaLabel);
				

		JLabel cineLabel = new JLabel("AL CINE ELORRIETA");
		cineLabel.setFont(new Font("Serif", Font.BOLD, 40));
		cineLabel.setForeground(Color.lightGray);
		cineLabel.setBounds(190, 80, 430, 490);
		this.add(cineLabel);
		
		
	   }
	
	

	}
