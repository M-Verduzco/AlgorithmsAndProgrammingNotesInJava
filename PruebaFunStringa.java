package Ejecutables;
import Librerias.ManejadorArreglos1;
public class PruebaFunStringa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int in =6;
		String [] c ={"Jose", "Javier", "Marta", "Aurelio", "Zack", "Jesús"};
		ManejadorArreglos1.imprimeArregloS(c, in);
		
		System.out.println("\n");
		
		System.out.println(ManejadorArreglos1.buscaSecuencialDesS(c,in,"Aurelio"));
		
		System.out.println("\n");

		ManejadorArreglos1.ordenarArreS(c, in);
		ManejadorArreglos1.imprimeArregloS(c, in);
		
		System.out.println("\n");
		
		System.out.println(ManejadorArreglos1.buscaSecuencialOrdS(c,in,"Aurelio"));
		
		System.out.println("\n");
		
		in=ManejadorArreglos1.eliminarDatoOrdS(c, in, "Marta");
		ManejadorArreglos1.imprimeArregloS(c, in);
		
		System.out.println("\n");

		
		in=ManejadorArreglos1.insertaDatoOrdS(c, in, "Bety");
		ManejadorArreglos1.imprimeArregloS(c, in);
	}
}