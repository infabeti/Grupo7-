package GestionCartelera;

public class TiempoFormater {
	public String MinutosAString(int minutos)
	{
		int horas = minutos/60;
		minutos %=60; 
		String outmin;
		if(minutos<10)
			outmin= "0" + Integer.toString(minutos);
		else
			outmin= Integer.toString(minutos);
		
		return Integer.toString(horas)+":"+outmin;
	}
}
