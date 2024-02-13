package Librerias;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public  class ManMatGen {
	
	public static  <T extends Comparable <T>>  boolean matricesIguales(T[][] matA, T[][] matB, int mA, int nA, int mB, int nB) {
		boolean res = true;
		int i,j;
		if(mA==mB && nA==mB) {
			i=0; 
			while(i<mA && res) {
				j=0;
				while (j<nA && res) {
					res = matA[i][j].equals(matB[i][j]);
					j++;
				}
				if(j==nA)
					i++;
				else
					res=false;
			}		
		}else
			res=false;
		return res;
	}
	
	public static void problema2 (double [][]mat, double [] res, int m, int n) {
		for(int i=0; i<m; i++) {
			for (int j=1; j<n; j+=2) {
				if(mat[i][j]%mat[i][0]==0)
					res [i]+=mat[i][j];
			}
		}
	}
	
	public static ArrayList<Integer> leeMatrizArchivo(double [][]a) {
		int nr=0;
		int nc=0;
		ArrayList<Integer> l = new ArrayList<Integer>();
		Scanner archivo;
		try {
			archivo = new Scanner (new File("datosMatriz.txt"));
			nr = archivo.nextInt();
			nc = archivo.nextInt();
			for(int i=0; i<nr; i++)
				for(int j=0; j<nc; j++)
					a[i][j] = archivo.nextDouble();
			l.add(nr);
			l.add(nc);
		}catch(FileNotFoundException fnfe) {
			System.out.println(fnfe);
			System.exit(-1);
		}
		return l;
	}
	
	public static void imprimeArregloD(double [] c, int n) {
		for(int i = 0; i<n; i++)
			System.out.println(i + ".- " + c[i]);	
	}
	
	public static void imprimeMat(double [][]a, int nr, int nc) {
		for (int i=0; i<nr; i++) {
			System.out.print("[");
			for (int j=0; j<nc; j++) {
				System.out.print(a[i][j]);
				if(j!=nc-1)
					System.out.print(", ");
			}
			System.out.println("]");
		}
	}
}
