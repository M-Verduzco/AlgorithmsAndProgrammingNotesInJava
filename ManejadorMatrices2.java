package Librerias;


import Librerias.ManejadorArreglos1;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ManejadorMatrices2 {
	
public static String zigZag(int[][] mat, int r, int c) {
		StringBuilder cad=new StringBuilder();
		for(int i=0;i<r;i++)
			for(int j=0;j<c;j++)
				if(i%2==0)
				cad.append(mat[i][j]);
				else {
					invierteRenglonI(mat[i][j],i);
					cad.append(mat[i][j]);
				}
		return cad.toString();		
	}

	private static void invierteRenglonI(int i, int i2) {
	// TODO Auto-generated method stub
	
}

	public static void leeMatriz(int[][]mat, int r, int c) {
		Scanner lec;
		lec=new Scanner(System.in);
		for(int i=0;i<r;i++) 
			for(int j=0;j<c;j++) {
				System.out.println("Dame el dato del renglon"+i+ "Dame el dato de la columna"+j);
				mat[i][j]=lec.nextInt();
			}
	}

	public static void main(String[] args) {
		
		int mat[][];
		Scanner archivo;
		int n;
		mat= new int[4][4];
		
		leeMatriz(mat,4,4);	
		System.out.println("ZigZag"+zigZag(mat, 4, 4));
		try {
			archivo = new Scanner(new File("zigZag.txt"));
			n=archivo.nextInt();
			for(int i=0;i<n;i++) 
				for(int j=0;j<4;j++) 
					for(int k=0;k<4;k++)
						mat[j][k]=archivo.nextInt();	
		}catch(FileNotFoundException fnfe) {
			System.out.println(fnfe);
			System.exit(-1);
		}
		System.out.println("ZigZag"+zigZag(mat, 4, 4));
	}
}
