package Ejecutables;
import Librerias.Servicio;
public class EjecutableUber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Servicio s1, s2;
		
		s1=new Servicio( 345, 3523,  2000,  'M',  5,  22,  true);
		s2=new Servicio(102, 12865, 2015, 'N', 2, 40, false);
		
		System.out.println("El monto a pagar del servicio " + s1.getClaveUnica() + " es: " + s1.calculaMonto());
		System.out.println("El monto a pagar del servicio " + s2.getClaveUnica() + " es: " + s2.calculaMonto());

		System.out.println("El viaje 2 fue extenso: " + s2.extenso());
		
		System.out.println("El viaje 2 fue pool: " +  s2.getPool());
		
		if(s1.equals(s2))
		System.out.println("Los servicios son iguales");
		else
			System.out.println("Los servicios son distintos");
		
		System.out.println("La info del primer servicio es: \n " + s1.toString());
		
		System.out.println("La info del segundo servicio es: \n " + s2.toString());

		
	}

}
