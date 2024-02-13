package Ejecutables;
import Librerias.Bicicleta;
import java.util.Scanner;
public class TiendaBicicletas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char tipo;
		char matF;
		int numA;
		Scanner  lee;
		lee = new Scanner(System.in);
		
		
		Bicicleta b1, b2, b3;
		b1 =new Bicicleta('U', 1, 'A');
		b2 = new Bicicleta('P', 4, 'F');
		System.out.println("dame el tipo"); 
		tipo=lee.next().charAt(0);
		System.out.println("dame el número de accesorios"); 
		numA=lee.nextInt();
		System.out.println("dame el material"); 
		matF=lee.next().charAt(0);

		b3 = new Bicicleta(tipo, numA, matF);
		

		System.out.println("el costo total de la primera bici es: " + b1.calculaCosto());
		System.out.println("el costo total de la segunda bici es: " + b2.calculaCosto());
		System.out.println("el costo total de la tercera bici es: " + b3.calculaCosto());
		
		System.out.println("el tiempo total de la primera bici es: " + b1.calculaTiempo());
		System.out.println("el tiempo total de la segunda bici es: " + b2.calculaTiempo());
		System.out.println("el tiempo total de la tercera bici es: " + b3.calculaTiempo());

		System.out.println(b1.toString());
		System.out.println(b2.toString());
		System.out.println(b3.toString());
		
		b1.setNumA(5);
		System.out.println("el costo modificado de la primera bici es: " + b1.calculaCosto());
	}
}