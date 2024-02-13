package Ejecutables;

import Librerias.Licor;
import Librerias.Licoreria1;
public class PruebaLicoreria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Licoreria1 g;
		g= new Licoreria1 ("Licoreria el amigo Luis", "Jose Miguel Sánchez Bustos");
		boolean res;
		
		res = g.altaLicor("Whiskey", "Jameson", 47, true, 500);
		if(res)
			System.out.println("Licor dado de alta");
	
		res = g.altaLicor("Dry London Gin", "Bombay", 55, false, 600);
		if(res)
			System.out.println("Licor dado de alta");
		
		System.out.println("La cantidad de licores con un procentaje mayor a 50 es: " + g.gradosMayores(50));
		
		System.out.println("El licor más caro es: ");
		System.out.println(g.masCaro());
		
		
		
		
		
	}

}
