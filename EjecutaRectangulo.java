package Ejecutables;
import Librerias.Rectangulo;
public class EjecutaRectangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangulo r1, r2, r3;
		//crear rect�ngulo1
		r1= new Rectangulo(6,8); 
		//crear rect�ngulo2
		r2= new Rectangulo(2,7);
		//crear rectangulo3
		r3= new Rectangulo(3,7);
		//si quiero cambiar r2 a base 9
		r2.setBase(9);
		System.out.println("Hola Mundo :)");
		System.out.println("El �rea del rect�ngulo 1 es: " + r1.calculaArea());
		System.out.println("El per�metro del rect�ngulo 2 es: " + r2.calculaPerimetro());
		System.out.println(r1.toString());
		System.out.println(r2.toString());
		if(r1.compareTo(r2)==0)
			System.out.println("Son iguales");
		else
			if(r1.compareTo(r2)==1)
				System.out.println("r1 es mayor a r2");
			else
				System.out.println("r1 es menor a r2");

System.out.println("El numero es" + Math.round(Math.random()*10+1));
	} 

}
