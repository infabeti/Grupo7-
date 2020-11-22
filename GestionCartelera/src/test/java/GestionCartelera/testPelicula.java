package GestionCartelera;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class testPelicula {

	private Pelicula peli = new Pelicula(1,2,"El dia mas largo",127);
	
	@Test
	public void testGenero() {
		assertEquals(1, peli.getGenero());
	}
	
	@Test
	public void testCodigo() {
		assertEquals(2, peli.getCodigo());
	}
	
	@Test
	public void testNombre() {
		assertEquals("El dia mas largo", peli.getNombre());
	}
	
	@Test
	public void testDuracion() {
		assertEquals(127, peli.getMinutos());
	}
	
	

}
