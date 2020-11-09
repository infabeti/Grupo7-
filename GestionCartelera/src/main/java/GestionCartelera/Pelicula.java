package GestionCartelera;

public class Pelicula {
	int codigoGenero;
	int codigoPeli;
	String Nombre;
	int minutosDuracion;
	
	Pelicula(int icodigoGenero,int icodigoPeli, String iNombre,int iminutosDuracion)
	{
		codigoGenero=icodigoGenero;
		codigoPeli=icodigoPeli;
		Nombre=iNombre;
		minutosDuracion=iminutosDuracion;
	}
	
	int getGenero()
	{
		return codigoGenero;
	}
	
	int getCodigo()
	{
		return codigoPeli;
	}
	
	String getNombre()
	{
		return Nombre;
	}
	
	int getMinutos()
	{
		return minutosDuracion;
	}
}
