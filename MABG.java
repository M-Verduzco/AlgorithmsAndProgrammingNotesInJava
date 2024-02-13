package Librerias;

public class MABG {
	
	public static <T> boolean esTriangularInf( T [][] mat, int m, int n) {
		boolean res = true;
		int ren, col;
		if(m==n) {
			ren=1;
			while(ren<m && res) {
				col=0;
				while(col<ren && mat[ren][col]==null) 
					col++;
				if(col!=ren)
					res=false;
				ren ++;
			}
		}else
			res=false;
		return res;
	}
}