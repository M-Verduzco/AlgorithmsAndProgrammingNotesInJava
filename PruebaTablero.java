package Ejecutables;

import Librerias.Tablero;

public class PruebaTablero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tablero t = new Tablero("Jaimito", 13);
		
		if(t.altaMedicamento("Maltodexina", 21, 1, 4))
			System.out.println("alta exitosa");
		else	
			System.out.println("alta NO exitosa");
		if(t.altaMedicamento("Rimorfina", 19, 3, 4))
			System.out.println("alta exitosa");
		else	
			System.out.println("alta NO exitosa");
		if(t.altaMedicamento("Paracetamol", 34, 2, 4))
			System.out.println("alta exitosa");
		else	
			System.out.println("alta NO exitosa");
		if(t.altaMedicamento("Aspirinas", 56, 1, 4))
			System.out.println("alta exitosa");
		else	
			System.out.println("alta NO exitosa");
		if(t.altaMedicamento("Dimegan", 65, 1, 1))
			System.out.println("alta exitosa");
		else	
			System.out.println("alta NO exitosa");
		if(t.altaMedicamento("Loratadina", 36, 1, 2))
			System.out.println("alta exitosa");
		else	
			System.out.println("alta NO exitosa");
		if(t.altaMedicamento("Avapena", 83, 2, 3))
			System.out.println("alta exitosa");
		else	
			System.out.println("alta NO exitosa");
		if(t.altaMedicamento("Glucosamina", 12, 3, 1))
			System.out.println("alta exitosa");
		else	
			System.out.println("alta NO exitosa");
		if(t.altaMedicamento("Samplex", 64, 2, 1))
			System.out.println("alta exitosa");
		else	
			System.out.println("alta NO exitosa");
		
		System.out.println("\n");
		System.out.println(t.toString());
		System.out.println("\n");
		
		System.out.println("La cantidad de tratamientos con una dosis mayor o igual a 20 son: "+ t.cuentaPorDosis(20));
			
	}

}
