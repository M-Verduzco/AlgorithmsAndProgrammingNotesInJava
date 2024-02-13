package Ejecutables;
import Librerias.Pago;
public class EjecutablePago {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pago p1;
		
		//	public Pago (double monto, String tp, double d, int cc, boolean s)
		
		p1= new Pago (657.5, "PP", 1.1, 5699, true);
		
		System.out.println(p1.toString());
		
		System.out.println(p1.calculaComision());
		
		System.out.println(p1.calculaIva());
		
		System.out.println(p1.montoTotal());
		
		p1.setStatus(false);


		
		
		
		
	}
}
