package GestionCartelera;

import java.util.ArrayList;

public class ControladorPelicula {
	ArrayList<Pelicula> ListaPelis;
	
	ControladorPelicula()
	{
		ListaPelis = new ArrayList<Pelicula>();
	}
	
	public void AnadirPeli(Pelicula inPeli)
	{
		ListaPelis.add(inPeli);
	}
	
	public Pelicula GetPeliPorCodigo(int icodigo)
	{
		for(int i=0;i<ListaPelis.size();i++)
		{
			if(ListaPelis.get(i).getCodigo()==icodigo)
				return ListaPelis.get(i);
		}
		//si no encontramos peli devolvemos un null
		return null;
	}
	
	public Pelicula[] GetPelisPorGenero(int igenero)
	{
		ArrayList<Pelicula> PelisGenero = new ArrayList<Pelicula>();
		for(int i=0;i<ListaPelis.size();i++)
		{
			if(ListaPelis.get(i).getGenero()==igenero)
				PelisGenero.add(ListaPelis.get(i));
		}
		return (Pelicula[]) PelisGenero.toArray();
	}
	
	
}
