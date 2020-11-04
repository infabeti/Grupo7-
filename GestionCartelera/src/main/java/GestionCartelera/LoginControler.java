package GestionCartelera;

import java.util.Arrays;

public class LoginControler {
	String Usuario;
	char[] Contrasena;
	
	LoginControler(String inUsuario,char[] inContrasena)
	{
		Usuario=inUsuario;
		Contrasena=inContrasena;
	}
	
	public boolean compararContrasenas(String inUsuario,char[] inContrasena)
	{
		if(!Usuario.equals(inUsuario))
			return false;
		else if(!Arrays.equals(Contrasena, inContrasena))
			return false;
		else
			return true;
	}
}
