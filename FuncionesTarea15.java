package Librerias;

import java.util.ArrayList;

public class FuncionesTarea15 {
	
	public static boolean esArregloInverso(double[]a,double[]b) {
	boolean res = false;
	double c [] = new double [a.length];
	ManejadorArreglos1.invertirArreOtroD(a, c, (a.length-1));
		for (int i=0; i<a.length; i++) {
			if(c[i]==b[i]) {
				res=true;
				i++;
			}else {
				//res=false;
				i=a.length;
			}
		}
	return res;
	}
	
	public static ArrayList<Double> generaInterseccionArreglos (Double[] c, Double[] d){
		ArrayList<Double> newList = new ArrayList<Double>(); 
		for (int i=0; i<c.length; i++) {
			for (int j=0; j<d.length; j++) {
				if(c[i]==d[j]) {
					newList.add(c[i]);
				}
			}
		}
		return newList;
	}
}
