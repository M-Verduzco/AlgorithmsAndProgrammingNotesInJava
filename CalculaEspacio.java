package Ejecutables;
import Librerias.Rectangulo;
import java.util.Scanner;
import Librerias.Circulo;
public class CalculaEspacio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double totalArea, sumaAreaTapetes = 0, totalTotal = 0;
		double totalAreaC = 0;
		double base, altura;
		double total;
		double radio;
		int n, k;
		
		Scanner lee;
	
		lee = new Scanner(System.in);
		System.out.println("Dame el número de oficinas rectangulares");
		n= lee.nextInt();
		
		for(int i=1; i <= n; i ++ ) {
		
			//**************¿POR QUÉ AQUÍ?**************
		Rectangulo oficina;
		Circulo c;
		
		
		System.out.println("Dame la base de la oficina #" + i);
		base= lee.nextDouble();
		System.out.println("Dame la altura de la oficina #" + i);
		altura=lee.nextDouble();
		oficina= new Rectangulo(base,altura);
		System.out.println("Dame el número de tapetes circulares");
		k = lee.nextInt();
		
		for(int j=1; j <= k; j ++ ) {

		System.out.println("Dame el radio del tapete # " + j);
		radio=lee.nextDouble();
		c=new Circulo(radio);
		
		//System.out.println("Dame el radio del segundo tapete");
		//radio=lee.nextDouble();
		//c2=new Circulo(radio);
		//System.out.println("Dame el radio del tercer tapete");
		//radio=lee.nextDouble();
		//c3=new Circulo(radio);
		//totalArea=r1.calculaArea()+r2.calculaArea()+r3.calculaArea();	
		
		sumaAreaTapetes+=c.calculaArea(3.1416);
		//sumaAreaTapetes= sumaAreaTapetes + c.calculaArea(3.1416);
		}
		
		totalAreaC+=sumaAreaTapetes;
		sumaAreaTapetes=0;
		
		total= oficina.calculaArea();
		totalTotal += total;
		total=0;
		
		}
		
		System.out.println("El area total de la suma de oficinas es: " + totalTotal);
		System.out.println("El area total de la suma de los tapes es: " + totalAreaC);
		System.out.println("El espacio que sobra de los tapetes circulares es respecto a las oficinas: " + (totalTotal-totalAreaC));
	}
}

				
	

