package Ejecutables;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import Librerias.AnimalFantastico;
import Librerias.tiendaAnimalesFantasticos;




public class PruebaAnimalFantastico {
	 
	
	public static int  leeArregloArchivo(tiendaAnimalesFantasticos t){
		Scanner archivo;
		int n=-1;
		try {
			archivo = new Scanner (new File("animalesfantasticos.txt"));
			n=archivo.nextInt();
			for(int i=0; i<n; i++)
				t.altaAnimal(archivo.next().toUpperCase(), archivo.next().toUpperCase(), archivo.nextLine().toUpperCase(), i+1);
		}catch(FileNotFoundException fnfe) {
			System.out.println(fnfe);
			System.exit(-1);
		}
		return n;
	}


	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		tiendaAnimalesFantasticos t = new tiendaAnimalesFantasticos("SupertienditaFantastica");
		n=leeArregloArchivo(t);
		System.out.println(t.toString());
		System.out.println("El animal Escarbato en inglés se dice: " + t.nombreIngles("Demiguise"));
		System.out.println("La descripción del animal Escarbato es: " + t.historia("Demiguise"));
		
		
		
		
		

	}

}
