package Librerias;

import java.util.ArrayList;

public class Sorteo {
	private int [][]mat;
	private final int MESES= 12;
	private final int DIG = 10;
	
	public Sorteo() {
		mat = new int [MESES][DIG];
		for(int i=0; i<MESES; i++)
			for(int j=0; j <DIG; j++)
				mat[i][j]=0;
	}
	
	public boolean actualizaMatriz(int mes, int dig) {
		boolean res=false;
		mes=mes-1;
		if(mes<MESES && dig<DIG) {
			mat[mes][dig]++;
			res=true;
		}
		return res;
	}
	
	public ArrayList<Integer> mesGanador(){
		ArrayList<Integer> l = new ArrayList<Integer>();
		int suma=0;
		int j;
		for(int i=0; i<MESES; i++) {
			j=0;
			while(j<DIG && (mat[i][j]!=0))
				j++;;
			if(j==DIG)	
				l.add(i+1);
		}
		return l;
	}

	public int[][] getMat() {
		return mat;
	}

	
		
}
