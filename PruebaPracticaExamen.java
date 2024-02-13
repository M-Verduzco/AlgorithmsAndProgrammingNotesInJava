package Ejecutables;
import Librerias.PracticaExamen;
public class PruebaPracticaExamen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//EJERCICIO 1
		System.out.println("Ejercicio #1");
		Integer [][] mat1 = {{14,13,0,8,0},{7,16,0,12,5},{10,0,15,6,15},{11,14,4,2,20}};
		String resul;
		System.out.println("Matriz Original");
		PracticaExamen.imprimeMat(mat1, 4, 5);
		System.out.println("\n");
		System.out.println("Ejecuto el Zig Zag");
		resul = PracticaExamen.zigZag(mat1, 4, 5);
		System.out.println(resul);
		
		System.out.println("\n");
		
		//EJERCICIO 2
		System.out.println("Ejercicio #2");
		Integer [][] mat2 = {{14,13,0,8,0},{7,16,0,12,5},{10,0,15,6,15},{11,14,4,2,20}};
		System.out.println("Matriz Original");
		PracticaExamen.imprimeMat(mat2, 4, 5);
		System.out.println("\n");
		System.out.println("Ejecuto el Invierte Renglones");
		PracticaExamen.invierteRenglosMatriz(mat2, 4, 5);
		PracticaExamen.imprimeMat(mat2, 4, 5);
		
		
	}

}
