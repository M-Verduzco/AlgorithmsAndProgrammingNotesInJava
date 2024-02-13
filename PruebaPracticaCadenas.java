package Ejecutables;

import Librerias.PracticaCadenas;
public class PruebaPracticaCadenas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String x1= ("federico es alto y me cae bien");
		String x2= ("aeioklu");
		String x3= ("c1m3l4");
		String x4= ("ana");
		String x5= (" ana cuenta bananas en el rancho de ana");
		
		System.out.println(PracticaCadenas.eliminaEspacios(x1));
		System.out.println(PracticaCadenas.vocalesYConsonantes(x2));
		System.out.println(PracticaCadenas.corrijeTexto(x3));
		System.out.println(PracticaCadenas.cuentaPalabra(x5, x4));
		
		
	}

}
