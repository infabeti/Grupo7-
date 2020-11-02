package GestionCartelera;

import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Font;
import java.util.Timer;
import java.util.TimerTask;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;

public class Bienvenida extends JPanel {

	
	ControladorVentana Padre;
	
	
//Constructor
    public Bienvenida(ControladorVentana inPadre) {
    	Padre = inPadre;
        dibujarVentana();
        
        this.setLayout(null);
        this.setSize(800, 600);
        JLabel linea = new JLabel("BIENVENIDOS");
        linea.setFont(new Font("Serif", Font.BOLD, 100)); 
        linea.setForeground(Color.lightGray);
        linea.setBounds(800,600,0,0);
        this.add(linea);
        
     


private void dibujarVentana() {
	// TODO Auto-generated method stub
	
}
}
