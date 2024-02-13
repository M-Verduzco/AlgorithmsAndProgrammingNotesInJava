package Ejecutables;
import Librerias.Fruta;
public class Fruteria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int res;
		Fruta f1, f2;
		
		f1= new Fruta ("Manzana", "Roja", "Campeche", 14.50);
		f2= new Fruta ("Plátano", "Amarillo", "Veracruz", 6.85);
		
		System.out.println("El porcentaje de descuento para $8500 de invesion en manzanas es: " + f1.calculaPorcentajeDescuento(8500.00));
		System.out.println("El porcentaje de descuento para $8500 de invesion en plátanos es: " + f2.calculaPorcentajeDescuento(8500.00));
		
		System.out.println("El precio de comprar 122 kilos de manzanas es: " + f1.calculaCosto(122));
		System.out.println("El precio de comprar 122 kilos de plátanos es: " + f2.calculaCosto(122));
		
		System.out.println("La información de la manzana es: \n " + f1.toString());
		System.out.println("La información del plátano es: \n " + f2.toString());
		
		res = f1.compareTo(f2);
		switch (res) {
		case -1:
			System.out.println("La manzana es más pequeña que el plátano");
			break;
		case 0:
			System.out.println("La manzana es igual  que el plátano");
			break;
		case 1:
			System.out.println("La manzana es más grande que el plátano");
			break;
		}
	
	}

}
