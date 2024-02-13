package Ejecutables;

import java.util.ArrayList;
import Librerias.ManMatGen;
	
public class pruebaManMatGen {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//problema1
		System.out.println("Problema 1");
		boolean res;
		ArrayList<Integer> nums = new ArrayList<Integer>();
		Integer matA[][] = {{1,2,3},{4,5,6},{7,8,9}};
		Integer matB[][] = {{1,2,3},{4,5,6},{7,8,9}};
		res = ManMatGen.matricesIguales(matA, matB, 3,3,3,3);
		if(res)
			System.out.println("Las matrices SI son iguales");
		else
			System.out.println("Las matrices NO son iguales");
		System.out.println("\n");
		
		//problema 2
		System.out.println("Problema 2");
		
		double matC[][] = new double [4][4];
		double resul [] = new double [10];
		
		nums=ManMatGen.leeMatrizArchivo(matC);
		ManMatGen.problema2(matC, resul, nums.get(0),nums.get(1));
		ManMatGen.imprimeArregloD(resul, 4);
		
		ManMatGen.imprimeMat(matC, 4, 4);
	}
}
