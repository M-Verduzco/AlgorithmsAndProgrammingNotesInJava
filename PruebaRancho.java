package Ejecutables;

import Librerias.Rancho;

public class PruebaRancho {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rancho r= new Rancho ("mi vida", "Veracruz");
		boolean res;
		res=r.altaVegetal("jitomate", 15, 'v', 0, 0);
		if (res)
			System.out.println("alta exitosa");
		else
			System.out.println("alta fallida");
		
		res=r.altaVegetal("jitomate", 15, 'v', 3, 0);
		if (res)
			System.out.println("alta exitosa");
		else
			System.out.println("alta fallida");

		res=r.altaVegetal("jitomate", 15, 'v', 3, 3);
		if (res)
			System.out.println("alta exitosa");
		else
			System.out.println("alta fallida");
		
		res=r.altaVegetal("jitomate", 15, 'v', 9, 2);
		if (res)
			System.out.println("alta exitosa");
		else
			System.out.println("alta fallida");
		
		res=r.altaVegetal("ejote", 15, 'v', 8, 3);
		if (res)
			System.out.println("alta exitosa");
		else
			System.out.println("alta fallida");
		
		System.out.println(r.toString());
		
		System.out.println( "la cantidad de parcelas con jitomates son : " +(r.lotesJito()));
			
		System.out.println(r.vecesPorLote("jitomate"));	
		
		
		
		if (r.hayEjotes())
			System.out.println("si hay ejotes :,)");
		else
			System.out.println("no hay ejotes :,(");
	}
}
