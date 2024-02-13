package Ejecutables;
import Librerias.Fruta;
public class Fruteria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int res;
		Fruta f1, f2;
		
		f1= new Fruta ("Manzana", "Roja", "Campeche", 14.50);
		f2= new Fruta ("Pl�tano", "Amarillo", "Veracruz", 6.85);
		
		System.out.println("El porcentaje de descuento para $8500 de invesion en manzanas es: " + f1.calculaPorcentajeDescuento(8500.00));
		System.out.println("El porcentaje de descuento para $8500 de invesion en pl�tanos es: " + f2.calculaPorcentajeDescuento(8500.00));
		
		System.out.println("El precio de comprar 122 kilos de manzanas es: " + f1.calculaCosto(122));
		System.out.println("El precio de comprar 122 kilos de pl�tanos es: " + f2.calculaCosto(122));
		
		System.out.println("La informaci�n de la manzana es: \n " + f1.toString());
		System.out.println("La informaci�n del pl�tano es: \n " + f2.toString());
		
		res = f1.compareTo(f2);
		switch (res) {
		case -1:
			System.out.println("La manzana es m�s peque�a que el pl�tano");
			break;
		case 0:
			System.out.println("La manzana es igual  que el pl�tano");
			break;
		case 1:
			System.out.println("La manzana es m�s grande que el pl�tano");
			break;
		}
	
	}

}
