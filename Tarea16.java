package Librerias;

import java.util.ArrayList;

public class Tarea16 {
	
	public static ArrayList<Integer> encuentraPremiados(int[]c,ArrayList<Integer> numeros, int n){
		ArrayList<Integer> resultante = new ArrayList <Integer>();
		for (int i=0; i<c.length; i++) {
			for (int j=0; j<numeros.size(); j++) {
				if((c[i]-(Math.round(c[i]/10)*10))==(numeros.get(j))) {
					resultante.add(c[i]);
					for (int k=c[i];k<n-1;k++)
						c[i]=c[i+1];
					n--;
				}
			}
		}
		return resultante;
	}

}
