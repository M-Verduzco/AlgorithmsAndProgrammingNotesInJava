package Ejecutables;
import Librerias.CuentaBancaria; 

public class PruebaCuentaBancaria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//***********CREAR CUENTAS BANCARIAS************
		CuentaBancaria c1, c2;
		c1 = new CuentaBancaria( "José Pérez" , 3000.00);
		c2 = new CuentaBancaria("Juana García" , 0.0);
		
		//*******OPERACIONES BANCARIAS***********
		c2.deposito(4000);
		System.out.println("La señora Juana Garcia hizo un deposito de $4,000.00");
		
		if(c1.retiro(10000))
			System.out.println("El señor José Pérez hizo un retiro de $10,000.00");
		else
			System.out.println("El señor José Pérez hizo NO PUDO HACER un retiro de $10,000.00");
		
		System.out.println("El señor José Pérez hizo un deposito de $1,000.00");
		c1.deposito(1000);
	
		//***********COMPARAR NUMEROS DE CUENTA**********
		if (c1.compareTo(c2)==0)
			System.out.println("Las cuentas son iguales");
		else if (c1.compareTo(c2)==1)
			System.out.println("El numero de cuenta de José es más grande el numero de cuenta de Juana");
		else
			System.out.println("El numero de cuenta de José es más chico el numero de cuenta de Juana");
	}

}
