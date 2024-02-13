package Ejecutables;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ejercicio4problema1 {

	public static int leeArregloCadenasArchivo(String []a) {
		int n=0; //el número de datos que va a contener el arreglo
		Scanner archivo;
		try {
			archivo = new Scanner (new File("cadenas.txt"));
			n=archivo.nextInt();
			archivo.nextLine();
			for(int i=0;i<n;i++)
				a[i]=archivo.nextLine();
		}catch(FileNotFoundException fnfe) {
			System.out.println(fnfe);
			System.exit(-1);
		}
		return n;
	}
	
	public static void imprimeArre(String []a, int n) {
		for(int i=0; i<n;i++)
			System.out.println("La cadena " + i + " es: " + a[i]);
	}
	
	public static int cuantasPalabra(String cad, String []a, int n) {
		int num =0;
		for(int i=0; i<n; i++)
			if(a[i].indexOf(cad)!=-1);
			num++;
		return num;
	}
	
	public static ArrayList<String>encuentraInicia(String[]a, int n, String cad){
		ArrayList<String> res= new ArrayList<String>();
		for(int i = 0; i<n;i++) {
			if(a[i].startsWith(cad)) {
				res.add("se encuentra al inicio de la linea " + i );
			}
		}
	return res;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String []a = new String [20];
		String res;
		String []resultado= new String [20];
		String cad;
		int na;
		Scanner lee;
		lee = new Scanner (System.in);
		String nombre;
		na=leeArregloCadenasArchivo(a);
		imprimeArre(a,na);
		System.out.println("Dame el nombre a buscar");
		nombre = lee.next();
		System.out.println("La palababra " + nombre + "  está " + cuantasPalabra(nombre, a, na) + "en nuestro arreglo");	
		ArrayList<String> respuesta = new ArrayList<String>();
		System.out.println("Dame la cadena a buscar");
		cad=lee.next();
		respuesta = encuentraInicia(a, na, cad);
		System.out.println(respuesta.toString());
		a[0]=a[0].trim();
		System.out.println(a[0].toString());
		resultado = a[0].split(" ");
		imprimeArre(resultado, resultado.length);
	}

}
