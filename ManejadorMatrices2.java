package Ejecutables;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class ManejadorMatrices2 {
	
	//*************INTERCAMBIO AUXILIAR*************//
	public static void intercambioMat(int posX, int posY, int [][]a, int r) {
		int aux;
		aux = a[r][posX];
		a[r][posX]=a[r][posY];
		a[r][posY]=aux;
	}			
	
	//*************INVIERTE EL UN RENGLON SOBRE SI MISMO*************//
	public static void invierteRenglonMismo(int [][]a, int r, int c) {
		for(int i =0; i<c/2; i++)
			intercambioMat(i, c-1-i, a, r);
	}
	
	//***********ZIG ZAG *************//
		public static String zigZag(int[][] mat, int r, int c) {
		StringBuilder cad = new StringBuilder();
		
		for(int i=0;i<r;i++) {
			if(i%2!=0)
				invierteRenglonMismo(mat,i, c);	
		}
		
		for(int j=0; j<r; j++) {
			cad.append("- ");
			for( int k = 0 ; k<c; k++) {
				cad.append(mat[j][k]);
				cad.append(" ");
			}
		}
		return cad.toString();
	}

	//**********IMPRIMIR MATRIZ**********//
			public static void imprimeMatriz(int [][]mat, int nr, int nc) {
				for(int i=0; i<nr; i++)
					for(int j=0; j<nc; j++) {
						System.out.println("(" + i + ", " + j + "): " + mat[i][j]);
					}
			}
	
	//**********LECTOR DE ARCHIVOS A MATRIZ***********//
			public static int [] leeArchivoMatriz(int a[][]) {
				int nr=0; //el número de renglones que va a contener la matriz
				int nc=0; //el número de columnas que va a contener la matriz
				Scanner archivo;
				int res [] = new int [2];
				try {
					archivo = new Scanner (new File("zigzag.txt"));
					nr=archivo.nextInt(); //renglones
					nc=archivo.nextInt(); //columnas
					for(int i=0;i<nr;i++)
						for(int j=0;j<nc;j++)
						a[i][j]=archivo.nextInt();
				}catch(FileNotFoundException fnfe) {
					System.out.println(fnfe);
					System.exit(-1);
				}
				res [0] = nr;
				res [1] = nc;
				return res;

			}

		public static void main(String[] args) {
		//main
		int mat[][] = new int [4][5];
		String resul;
		leeArchivoMatriz(mat);
		System.out.println("Matriz Original");
		imprimeMatriz(mat, 4, 5);
		System.out.println("\n");
		System.out.println("Ejecuto el Zig Zag");
		resul = zigZag(mat, 4, 5);
		System.out.println(resul);
		
		int array [] = new int [6];
		int array2 [] = {1 ,2 ,3, 4, 5};
		array[1] = 34;
		System.out.println(array[2]);
		
		
	}
}
