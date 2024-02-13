package Ejecutables;
import Librerias.ManejadorCadenas;
import Librerias.ManejadorArreglos;

public class PruebaManejadorArreglos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		String res;
		String s1 = "SANTIAGO";
		String s2 = "Santiago";
		System.out.println(ManejadorCadenas.igual3(s1, s2));
		System.out.println(ManejadorCadenas.igual3(s1.toUpperCase(),s2.toUpperCase()));
	
		String nom = "Mauricio";
		String ap1 = "vErDuZcO";
		String ap2 = "cHAVIRA";
		String d= "03";
		String m = "10";
		String a = "2001";
		String est = "jalisco";
		String g = "hombre";
		
		res = ManejadorCadenas.CURP(nom.toUpperCase(), ap1.toUpperCase(), ap2.toUpperCase(), d, m, a, g.toUpperCase(), est.toUpperCase());
		System.out.println("El CURP ES: " + res);
		*/
		int n=6;
		int prueba [] = new int [n];
		
		ManejadorArreglos.llenaArregloI(prueba, n);		
		
		
	}

}
