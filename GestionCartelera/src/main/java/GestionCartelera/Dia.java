package GestionCartelera;

import java.util.ArrayList;

public class Dia {
	private int MinutosProyeccion;
	private ArrayList<Pelicula> PelisHoy;
	
	Dia(int iMaxMins)
	{
		PelisHoy = new ArrayList<Pelicula>();
		MinutosProyeccion = iMaxMins;
	}
	
	public void AnadirPelicula(Pelicula inPeli)
	{
		PelisHoy.add(inPeli);
	}
	
	public int MinutosRestantes()
	{
		int minutosOcupados=0;
		for(int i=0;i<PelisHoy.size();i++)
		{
			minutosOcupados+= PelisHoy.get(i).getMinutos();
		}
		return MinutosProyeccion-minutosOcupados;
	}
	
	public boolean CabePeli(int iMinutosDuracion)
	{
		if(iMinutosDuracion>this.MinutosRestantes())
			return false;
		else
			return true;
	}
	
	public ArrayList<Integer> GetGenerosHoy()
	{
		ArrayList<Integer> ListaGeneros = new ArrayList<Integer>();
		
		for(int i=0;i<PelisHoy.size();i++)
		{
			ListaGeneros.add(PelisHoy.get(i).getGenero());
		}
		
		return ListaGeneros;
	}
	
	public ArrayList<Pelicula> getPelisHoy()
	{
		return PelisHoy;	
	}
	
}
