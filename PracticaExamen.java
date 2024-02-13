package Librerias;

public class PracticaExamen {
 
	//*************INTERCAMBIO AUXILIAR*************//
	public static <T extends Comparable <T>> void intercambioMatC(int posX, int posY, T [][]a, int r) {
		T aux;
		aux = a[r][posX];
		a[r][posX]=a[r][posY];
		a[r][posY]=aux;
	}			
		
	//*************INVIERTE EL UN RENGLON SOBRE SI MISMO*************//
	public static <T extends Comparable <T>> void invierteRenglonMismoMat(T [][]a, int r, int c) {
		for(int i =0; i<c/2; i++)
			intercambioMatC(i, c-1-i, a, r);
	}
		
	//***********ZIG ZAG *************//
	public static <T extends Comparable <T>>  String zigZag(T[][] mat, int r, int c) {
		StringBuilder cad = new StringBuilder();
			for(int i=0;i<r;i++) {
				if(i%2!=0)
					invierteRenglonMismoMat(mat,i, c);	
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
	
	public static <T extends Comparable <T>> void intercambioMatR (int r1, int r2, T [][] a, int c) {
		T aux;
		aux =a[r1][c];
		a[r1][c]=a[r2][c];
		a[r2][c]=aux;
	}
	
	public static <T extends Comparable <T>> void invierteRenglosMatriz(T[][]a, int r, int c) {
		for (int i=0; i<r/2; i++)
			for(int j=0; j<c; j++)
				intercambioMatR(i, r-1-i, a, j);
		
	}
	
	public static <T extends Comparable <T>>void imprimeMat(T [][]a, int nr, int nc) {
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
