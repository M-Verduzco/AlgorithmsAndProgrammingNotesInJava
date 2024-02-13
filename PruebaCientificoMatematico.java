package Ejecutables;
import Librerias.CientificoMatematico;

public class PruebaCientificoMatematico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//declarar variables
		CientificoMatematico c;
		c = new CientificoMatematico("Luis", "Computación");
		System.out.println("el ocho esta en orden creciente con respecto al 6" + c.estaOrdenCreciente(8, 6));
		System.out.println("cinco y siete ordenados crecientemente" + c.ordenCreciente(5,7));
		
		//System.out.println("el ocho es impar" + c.esImpar(8));
		if(c.esImpar(8)==true)
			System.out.println("el numero es impar");
		else
			System.out.println("el numero es par");
		
		System.out.println("En la funcion 1, si x=33, f(x)= " + c.calculaFuncion1(33.0));
		System.out.println("En la funcion 2, si x=33, f(x)= " + c.calculaFuncion2(45));
		System.out.println("En la funcion 3, si num=2 y v=5, f(v)= " + c.calculaFuncion3(2, 5));
		
		System.out.println(c.calculaUllman(26));
	}

}
