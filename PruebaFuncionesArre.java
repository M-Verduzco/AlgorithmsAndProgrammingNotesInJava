package Ejecutables;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import Librerias.ManejadorArreglos1;

public class PruebaFuncionesArre {
	
	public static int leeArregloArchivo(double []a) {
		int n=0; //el número de datos que va a contener el arreglo
		Scanner archivo;
		try {
			archivo = new Scanner (new File("datos.txt"));
			n=archivo.nextInt();
			for(int i=0;i<n;i++)
				a[i]=archivo.nextDouble();
		}catch(FileNotFoundException fnfe) {
			System.out.println(fnfe);
			System.exit(-1);
		}
		return n;
	}
	
	public static void imprimeArre(double []a, int n) {
		for(int i=0; i<n;i++)
			System.out.println("El dato " + i + " es: " + a[i]);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double []a = new double [20];
		int na;
		na=leeArregloArchivo(a);
		imprimeArre(a,na);
		ManejadorArreglos1.ordenarArreD(a,na);
		System.out.println("El arreglo ordenado es: ");
		imprimeArre(a,na);
		na=ManejadorArreglos1.insertaDatoOrdD(a, na, 3.8);
		System.out.println("El arreglo con el dato insertado es: ");
		imprimeArre(a,na);
		na=ManejadorArreglos1.eliminarDatoOrdD(a, na, 2.1);
		System.out.println("El arreglo con el dato eliminado es: ");
		imprimeArre(a,na);
	}

}
