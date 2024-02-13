package Ejecutables;

import java.util.Scanner;

import Librerias.Compa�ia;

public class PruebaCompa�ia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Compa�ia comp;
		comp= new Compa�ia(12, "Empaques S.A. de C.V.", "Av. Consituci�n 34", "Cd.Queretaro", "Sr.P�rez" );
		Scanner lee; 
		lee= new Scanner (System.in);
		for (int i=0; i<12; i++) {
				
			System.out.println("Dame la venta del mes: " + (i+1));
			comp.setVentas(i, lee.nextDouble());
		}
		
		
		System.out.println("El mes con mayores ventas: " + comp.mesMayor());
		System.out.println("El mes con menores ventas: " + comp.mesMenor());
		System.out.println("El promedio de ventas: " + comp.promedioVentas());
		System.out.println("El total de meses con ventas arriba del promedio es : " + comp.cantArribaProm());
		System.out.println("La informaci�n de la compa�ia es: " + comp.toString());
	}
}


