package Ejecutables;

import java.util.ArrayList;

import Librerias.Galeria1;

public class PruebaGaleria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Galeria1 g = new Galeria1("Frida", "555");
		boolean res;
		boolean res1;
		ArrayList<String> l = new ArrayList<String>();
		res=g.altaPintura("mujer", "Rusell", "palma", 2019, 1000);
		if(res)
			System.out.println("pintura dada de alta");
		res=g.altaPintura("hombre", "Rusell", "palma", 2020, 1500);
		if(res)
			System.out.println("pintura dada de alta");
		
		l=g.consultaTecnicaPintor("Rusell", "palma");
		
		System.out.println(l.toString());
		
		res1=g.precioMenor(2000);
		if(res1)
			System.out.println("si hay pinturas menores a 2000 de precio");
		
		
		
		
	}

}

