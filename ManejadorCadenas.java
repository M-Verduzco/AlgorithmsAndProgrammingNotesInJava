package Librerias;

public class ManejadorCadenas {

	public boolean igual(String c1, String c2) {
		boolean res=false;
		if(c1.contentEquals(c2))
			res=true;
		return res;
	}
	
	public boolean igual2(String c1, String c2) {
		return c1.equals(c2);
	}
	
	public static String igual3(String c1, String c2) {
		String res = "las cadenas no son iguales";
		if(c1.contentEquals(c2))
			res="Las cadenas son iguales";
		return res;
	}
	
	public static boolean palindroma(String c1) {
		boolean res = false;
		int i=0;
		int n =c1.length();
		while(i<n/2 && c1.charAt(i)==c1.charAt(n-1-i))
			i++;
		if(i==n/2)
			res=true;
		return res;
	}
	
	// 5 funciones con cosas estáticas de Strings del link
	public static Character inicial(String c) {
		return c.charAt(0);
	}
	
	public static String inicialesUltimas(String nombre, String apellido1, String apellido2) {
		return "" + inicial(apellido1) + inicial(apellido2) + inicial(nombre) + "";
	}
	
	public static Character primeraVocal (String c) {
		Character res = null;
		int i = 0;
		int k=0;
		while (i<c.length() && k==0) {
			if(c.charAt(i)=='A') {
				res = 'A';
				k=1;
			}
				if(c.charAt(i)=='E') {
					res = 'E';
					k=1;
				}
					if(c.charAt(i)=='I') {
						res = 'I';
						k=1;
					}
						if(c.charAt(i)=='O') {
							res = 'O';
							k=1;
						}
								if(c.charAt(i)=='U') {
									res = 'U';
									k=1;
								}
			i++;
		}
		return res;
						
	}
	
	
	
	public static String nacimiento(String dia, String mes, String ano) {
		return "" + ano.charAt(3) + mes.charAt(0) + mes.charAt(1) + dia.charAt(0) + "";
	}
	
	public static String estado(String estado) {
		String res = null;
		switch (estado) {
		case "AGUASCALIENTES":
			res = "AS";
			break;
		case "JALISCO":
			res= "JC";
			break;
		case "MEXICO":
			res="MC";
			break;
		case "NUEVO LEON":
			res="NL";
			break;
		case "VERACRUZ":
			res = "VZ";
			break;
		}
		return res;
	}
	
	public static Character genero (String genero) {
		return genero.charAt(0);
	}
	
	public static String CURP(String nombre, String apellido1, String apellido2, String dia, String mes, String ano, String genero, String estado) {
		return ""+ inicial(apellido1) + primeraVocal(apellido1) + inicial(apellido2) + inicial(nombre) + nacimiento(dia, mes, ano) + genero(genero) + estado(estado) + inicialesUltimas(nombre, apellido1, apellido2) + "" ;		
		 
				
	}
	
	
	
	
}
