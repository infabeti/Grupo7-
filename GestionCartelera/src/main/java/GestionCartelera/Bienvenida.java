package GestionCartelera;

import java.awt.Color;
import java.awt.Font;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class Bienvenida extends JPanel{
	
	private static final long serialVersionUID = 1L;

	void initialize(){
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
		
		
		Timer cronom=new Timer();
	    cronom.schedule(new TimerTask(){

	    public void run(){
	  
	      
	    }},3000);
	}
	   }
	
