package Ejecutables;

import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;





public class PruebaTarea17 {
	
	public static int leeArregloArchivo(int []a) {
		int na=0;
		Scanner archivo;
		try {
			archivo = new Scanner(new File("datos1.txt"));
			na=archivo.nextInt();
			for(int i = 0; i<na; i++)
				a[i]=archivo.nextInt();
		} catch(FileNotFoundException fnfe){
			System.out.println(fnfe);
			System.exit(-1);
		}
		return na;
	}
	
	public static void leeArrayListArchivo(ArrayList<Integer> lista) {
		int na=0;
		Scanner archivo;
		try {
			archivo = new Scanner(new File("datos2.txt"));
			na=archivo.nextInt();
			for(int i = 0; i<na; i++)
				lista.add(archivo.nextInt());
		} catch(FileNotFoundException fnfe){
			System.out.println(fnfe);
			System.exit(-1);
		}
	}
	
	
	public static void imprimeArreglo(int [] c, int n) {
		for(int i = 0; i<n; i++)
			System.out.println(i + ".- " + c[i]);	
	}
	
	
	public static int intercambiaArreLista (int []c, int na, ArrayList<Integer> lista) {
		int z=lista.size();
		int cont=0;
		int aux;
		for(int i=0; i<c.length; i++) {
			lista.add(c[i]);
			cont++;
		}
		for (int j=0;j<cont;j++) {
			c[j]=0;
		}
		na=0;
		for (int k =0; k<z; k++) {
			c[k]=lista.get(0);
			lista.remove(0);
			na++;	
		}
		return na;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int na;
		int []arreglo = new int [9];
		ArrayList <Integer >res = new ArrayList<Integer>();;
		na=leeArregloArchivo(arreglo);
		leeArrayListArchivo(res);	
		imprimeArreglo(arreglo, na);
		System.out.println(res.toString());
		na=intercambiaArreLista(arreglo, na, res);
		imprimeArreglo(arreglo,na);
		System.out.println(res.toString());
		
		
	}

}
