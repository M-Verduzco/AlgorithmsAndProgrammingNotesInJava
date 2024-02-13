package Ejecutables;

import java.util.ArrayList;

import Librerias.Tarea16;

public class PruebaTarea16 {
	
	public static void imprimeArreglo(int [] c, int n) {
		for(int i = 0; i<n; i++)
			System.out.println(i + ".- " + c[i]);	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 9;
		ArrayList <Integer> resultante = new ArrayList<Integer>();
		int [] claves  = {2020,2261,2312,2456,4411,5189,6001,6855,7527};
		ArrayList<Integer> numeros = new ArrayList <Integer>();
		numeros.add(1);
		numeros.add(6);
		numeros.add(2);
		//imprime mis claves originales
		imprimeArreglo(claves,n);
		System.out.println("\n");
		//imprime mis números que serán premiados de entre las claves anteriores
		System.out.println(numeros.toString());
		System.out.println("\n");
		//ejecuta la funcion
		resultante=Tarea16.encuentraPremiados(claves, numeros, n);
		//imprime mi resultante
		System.out.println(resultante.toString());
		System.out.println("\n");
		//imprime como quedó mi arreglo
		imprimeArreglo(claves,n);
	}

}
