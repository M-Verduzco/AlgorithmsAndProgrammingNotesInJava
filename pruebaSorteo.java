package Ejecutables;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import Librerias.Sorteo;

public class pruebaSorteo {
	public static void  leeMatrizArchivo(Sorteo otro) {
		Scanner archivo;
		int n;
		try {
			archivo = new Scanner (new File("DatosSorteo.txt"));
			n=archivo.nextInt();
			for(int i=0; i<n; i++)
				otro.actualizaMatriz(archivo.nextInt(), archivo.nextInt());
		}catch(FileNotFoundException fnfe) {
			System.out.println(fnfe);
			System.exit(-1);
		}
	}
	
	//**********IMPRIMIR MATRIZ**********//
	public static void imprimeMatriz(int [][]mat, int nr, int nc) {
		for(int i=0; i<nr; i++)
			for(int j=0; j<nc; j++) {
				System.out.println("(" + i + ", " + j + "): " + mat[i][j]);
			}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sorteo x = new Sorteo();
		leeMatrizArchivo(x);
		System.out.println("Matriz Original");
		imprimeMatriz(x.getMat(), 12, 10);

		x.actualizaMatriz(2, 8);
		x.actualizaMatriz(4, 6);
		x.actualizaMatriz(1, 7);
		x.actualizaMatriz(5, 3);
		imprimeMatriz(x.getMat(), 12, 10);
		
		System.out.println(x.mesGanador().toString());
		
		
	}

}
