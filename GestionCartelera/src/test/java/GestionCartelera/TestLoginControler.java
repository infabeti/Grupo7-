package GestionCartelera;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class TestLoginControler {

	private LoginControler LoginC = new LoginControler("admin", "nimda".toCharArray());
	
	@Test
	public void CompracionFalseUsuario() {
		assertEquals(false, LoginC.compararContrasenas("asdasds", "sadasd".toCharArray()));
	}
	
	@Test
	public void CompracionFalseContrasena() {
		assertEquals(false, LoginC.compararContrasenas("admin", "sadasd".toCharArray()));
	}
	
	@Test
	public void CompracionTrue() {
		assertEquals(true, LoginC.compararContrasenas("admin", "nimda".toCharArray()));
	}

}
