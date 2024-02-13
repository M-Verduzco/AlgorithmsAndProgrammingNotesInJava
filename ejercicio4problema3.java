package Ejecutables;

import java.util.Scanner;

import Librerias.ManejadorMatrices;

public class ejercicio4problema3 {

	
	public static void imprimeMatriz(int [][]mat, int nr, int nc) {
		for(int i=0; i<nr; i++)
			for(int j=0; j<nc; j++) {
				System.out.println("(" + i + ", " + j + "): " + mat[i][j]);
			}
	}
	
	public static void leeMatriz(int [][]mat, int nr, int nc) {
		Scanner dato;
		dato = new Scanner(System.in);
		for(int i=0; i<nr; i++)
			for(int j=0; j<nc; j++) {
				System.out.println("Dame el valor: (" + i + ", " + j + ") " );
				mat[i][j]=dato.nextInt();
			}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int res;
//1
		System.out.println("solucion del problema 1");
		int matriz [][] = new int [5] [3];
		int i,j;
		for (i = 0; i < 5; i++)
		  for (j = 0; j < 3; j++)
			matriz[i][j] = i + j;
		j = 0;
		for (i = 0; i < 3; i++)
		  System.out.println( "(" + (i+j) + " ," + (2-i) + " )" +  matriz[i + j][2-i]);
		System.out.println("\n");	
//2
		System.out.println("Solucion del problema 2");
		int matriz2 [][] = new int [10][10];
		for (int k=0; k < matriz2.length; k++)
				matriz2[k][k] = 1;
		imprimeMatriz(matriz2, matriz2.length, matriz2[0].length);
		System.out.println("\n");
	}
}
