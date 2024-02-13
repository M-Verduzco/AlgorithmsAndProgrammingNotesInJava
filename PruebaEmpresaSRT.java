package Ejecutables;

import java.util.ArrayList;

import Librerias.EmpresaSRT1;

public class PruebaEmpresaSRT {

		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean res;
		ArrayList<String>lista1=new ArrayList<String>();
		EmpresaSRT1 e;
		e = new EmpresaSRT1("BlockBuster", 200);
		
		
		res = e.altaVideo("serie", 3180, "Downtown Abbey" , "drama", true, 1800000);
		if(res)
			System.out.println("Alta exitosa");
		else
			System.out.println("No se pudo dar de alta");
		System.out.println("\n");
		
		res = e.altaVideo("pelicula", 180, "Coco" , "animada", false, 100000);
		if(res)
			System.out.println("Alta exitosa");
		else
			System.out.println("No se pudo dar de alta");
		System.out.println("\n");
		
		res = e.altaVideo("serie", 3250, "House of Cards" , "drama", true, 1500000);
		if(res)
			System.out.println("Alta exitosa");
		else
			System.out.println("No se pudo dar de alta");
		System.out.println("\n");
		
		System.out.println("El video favorito de la página es: " + e.videoFav());
		
		System.out.println("\n");
		
		if(e.consulta("serie", "drama")!=null) {
			lista1= (e.consulta("serie", "drama"));
			System.out.println("Los videos de tipo serie y de genero dramático son: " + lista1.toString());
		}
		else
			System.out.println("No hay videos que cumplan con esas características");
		}

}
