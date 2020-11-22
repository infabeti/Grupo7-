package GestionCartelera;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestTiempoFormater {

	private TiempoFormater T = new TiempoFormater();
	
	@Test
	public void TestSoloMinutos() {
		assertEquals("0:30", T.MinutosAString(30));
	}
	
	@Test
	public void TestSoloHora() {
		assertEquals("1:00", T.MinutosAString(60));
	}
	
	@Test
	public void TestMinutosMenorDiez() {
		assertEquals("1:01", T.MinutosAString(61));
	}
	
	@Test
	public void TestHora() {
		assertEquals("3:33", T.MinutosAString(213));
	}

}