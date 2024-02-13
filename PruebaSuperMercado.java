package Ejecutables;

import Librerias.SuperMercado;

public class PruebaSuperMercado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SuperMercado s = new SuperMercado ("super tiendita");
		
		if(s.altaProducto("galletas", 34, 1))
			System.out.println("alta exitosa");
		else	
			System.out.println("alta NO exitosa");
		
		if(s.altaProducto("coca", 54, 2))
			System.out.println("alta exitosa");
		else	
			System.out.println("alta NO exitosa");
		
		if(s.altaProducto("cerveza", 456, 3))
			System.out.println("alta exitosa");
		else	
			System.out.println("alta NO exitosa");
		
		if(s.altaProducto("jitomate", 456, 4))
			System.out.println("alta exitosa");
		else	
			System.out.println("alta NO exitosa");
		
		if(s.altaProducto("cebolla", 4345, 1))
			System.out.println("alta exitosa");
		else	
			System.out.println("alta NO exitosa");
		
		if(s.altaProducto("vino", 345, 1))
			System.out.println("alta exitosa");
		else	
			System.out.println("alta NO exitosa");
		
		if(s.altaProducto("ajo", 45, 2))
			System.out.println("alta exitosa");
		else	
			System.out.println("alta NO exitosa");
		
		if(s.altaProducto("apio", 345, 3))
			System.out.println("alta exitosa");
		else	
			System.out.println("alta NO exitosa");
		
		if(s.altaProducto("zanahoria", 65, 4))
			System.out.println("alta exitosa");
		else	
			System.out.println("alta NO exitosa");
		
		if(s.altaProducto("carne", 32, 4))
			System.out.println("alta exitosa");
		else	
			System.out.println("alta NO exitosa");
		
		if(s.altaProducto("crema", 756, 1))
			System.out.println("alta exitosa");
		else	
			System.out.println("alta NO exitosa");
		
		if(s.altaProducto("queso", 12, 1))
			System.out.println("alta exitosa");
		else	
			System.out.println("alta NO exitosa");
		
		if(s.altaProducto("crema", 756, 2))
			System.out.println("alta exitosa");
		else	
			System.out.println("alta NO exitosa");
		
		if(s.altaProducto("crema", 756, 3))
			System.out.println("alta exitosa");
		else	
			System.out.println("alta NO exitosa");
		
		if(s.altaProducto("paletas", 756, 4))
			System.out.println("alta exitosa");
		else	
			System.out.println("alta NO exitosa");
		
		System.out.println("\n");
		
		if(s.productoEnTodasCajas("crema"))
			System.out.println("En todas las cajas hay crema");
		else
			System.out.println("No en todas las cajas hay crema");
				
		System.out.println("\n");
		
		System.out.println(s.productoMasBarato());
		
		System.out.println("\n");
		
		System.out.println(s.toString());
		
	}
	
	
	
	
	

}
