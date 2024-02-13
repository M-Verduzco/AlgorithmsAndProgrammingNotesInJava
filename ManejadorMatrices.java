package Librerias;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ManejadorMatrices {
	
	//**********LEER MATRIZ**********//
		public static void leeMatriz1(int [][]mat, int nr, int nc) {
			Scanner dato;
			dato = new Scanner(System.in);
			for(int i=0; i<nr; i++)
				for(int j=0; j<nc; j++) {
					System.out.println("Dame el valor: (" + i + ", " + j + ") " );
					mat[i][j]=dato.nextInt();
				}
		}
		
		//**********IMPRIMIR MATRIZ**********//
		public static void imprimeMatriz(int [][]mat, int nr, int nc) {
			for(int i=0; i<nr; i++)
				for(int j=0; j<nc; j++) {
					System.out.println("(" + i + ", " + j + "): " + mat[i][j]);
				}
		}
		
		//**********SUMAR ELEMENTOS DE UNA FILA DE UNA MATRIZ**********//
		public static double sumaFila(double [][]mat, int fila, int nc) {
			double suma=0;
			for(int i=0; i<nc; i++)
				suma+=mat[fila][i];
			return suma;
		}
		
		//**********SUMAR ELEMENTOS DE UNA FILA DE UNA MATRIZ**********//
				public static int sumaFila(int [][]mat, int fila, int nc) {
					int suma=0;
					for(int i=0; i<nc; i++)
						suma+=mat[fila][i];
					return suma;
				}
		
		//**********SUMAR ELEMENTOS DE UN RENGLÓN DE UNA MATRIZ**********//
		public static double sumaColumna(double [][]mat, int columna, int nr) {
			double suma=0;
			for(int j=0; j<nr; j++)
				suma+=mat[j][columna];
			return suma;
		}
		
		//**********SUMAR ELEMENTOS DE UNa columna DE UNA MATRIZ**********//
				public static int sumaColumna(int [][]mat, int columna, int nr) {
					int suma=0;
					for(int j=0; j<nr; j++)
						suma+=mat[j][columna];
					return suma;
				}
		
		//**********ENCONTRAR EL INDICE DEL ELEMENTO MAYOR DE UNA FILA**********//
		public static int mayorFila(double [][]mat, int fila, int nc) {
			int max=0;
			for(int i=1; i<nc; i++)
				if(mat[fila][i]>mat[fila][max])
					max=i;
			return max;
		}
		
		//**********ENCONTRAR EL INDICE DEL ELEMENTO MAYOR DE UNA COLUMNA**********//
		public static int mayorColumna(double [][]mat, int nr, int columna) {
			int max=0;
			for(int i=1; i<nr; i++)
				if(mat[i][columna]>mat[max][columna])
					max=i;
			return max;
		}
		
		//**********ENCONTRAR EL ELEMENTO MAYOR DE UNA MATRIZ**********//
		public static int [] encuentraMayorMatriz(double [][]mat, int nr, int nc) {
			int fmayor=0, cmayor=0;
			int []res = new int [2];
			for(int i=0; i<nr; i++) {
				for(int j=0; j<nc; j++) 
					if(mat[i][j]>mat[fmayor][cmayor]) {
						fmayor=i;
						cmayor=j;
					}
			}
			res[0]=fmayor;
			res[1]=cmayor;
			return res;
		}
		
		//**********HACER UNA SUMA DE LOS ELEMENTOS EN DIAGONAL DE UNA MATRIZ (COLUMNAS = FILAS)**********//
		public static int sumaDiagonal(int [][]mat, int n) {
			int suma=0;
			for(int i=0; i<n; i++) {
				suma+=mat[i][i];
			}
			return suma;
		}
		
		//**********HACER UNA SUMA DE LOS ELEMENTOS EN DIAGONAL DE UNA MATRIZ (COLUMNAS != FILAS)**********//
		public static int sumaDiagonal(int [][]mat, int nr, int nc) {
			int suma=0;
			int i=0;
			int j=0;
			while(i<nr && j<nc) {
				suma+=mat[i][i];
				i++;
				j++;
			}
			return suma;
		}
		
		//**********SUMA DE DOS MATRICES**********//REGRESA MATRIZ
		public static int [][] sumaMatrices(int [][]a, int [][]b, int nr, int nc){
			int [][]c = new int [nr][nc];
			for(int i=0; i<nr-1; i++)
				for(int j=0; j<nc-1; j++)
					 c[i][j] = (a[i][j]+b[i][j]);
			return c;				
		}
		
		//**********MULTIPLICACIÓN DE DOS MATRICES**********//REGRESA MATRIZ
		public static int[][] multiplicacionMatrices ( int[][] a, int[][] b) {
		      int[][] c = new int[a.length][b[0].length];
		      
		      for (int i= 0; i<c.length; i++)
		    	  for (int j=0; j<c[0].length; j++)
		        	  for (int k=0; k<b.length; k++)
		                  c[i][j] = c[i][j] + a[i][k] * b[k][j];
		      return c;
		   }
		
		public static int menorSumaFilas(double[][] mat, int nr, int nc) {
			Double[] s= new Double[nr];
			for(int i=0; i<nr; i++)
				s[i]=sumaFila(mat, i, nc);
			return ManejadorArreglosGenerico.minimo(s, nr, 0);
		}
		
		
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
