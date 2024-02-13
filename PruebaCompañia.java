package Ejecutables;

import java.util.Scanner;

import Librerias.Compañia;

public class PruebaCompañia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Compañia comp;
		comp= new Compañia(12, "Empaques S.A. de C.V.", "Av. Consitución 34", "Cd.Queretaro", "Sr.Pérez" );
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
		System.out.println("La información de la compañia es: " + comp.toString());
	}
}


