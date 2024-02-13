package Librerias;
//**********ATRIBUTOS DE LA CLASE***********
public class CuentaBancaria {
	private int cuenta;
	private String nombre;
	private double saldo;
	public static int c=1000;
	
	//**********CONSTRUCTORES**********
	public CuentaBancaria() {}
	public CuentaBancaria (String nombre, double saldo) {
		cuenta = c;
		c++;
		
		this.nombre=nombre;
		this.saldo=saldo;
	}
	
	//***********SET***********

	public void setNombre (String nombre) {
		this.nombre=nombre;
	}
	public void setSaldo (double saldo) {
		this.saldo=saldo;
	}
	
	//************GET***********
	public int getCuenta () {
		return cuenta;
	}
	public String getNombre() {
		return nombre;
	}
	public double getSaldo () {
		return saldo;
	}
	
	//***********FUNCIONES PROPIAS DE LA CLASE***********
	public void deposito (double cantidad) {
		saldo += cantidad;
	}
	public boolean retiro (double cantidad) {
		if (cantidad>saldo ) {
			return false;
		}
		else {
			saldo -=cantidad;
			return true;
			}
	}
	
	//************EQUALS, COMPARTE TO, TO STRING***********
	 public boolean equals (CuentaBancaria c) {
		 boolean res;
		 if(cuenta==c.cuenta)
			 res=true;
		 else
			 res=false;
		 return res;
	 }
	 
	 public String toString () {
		 String res;
		 res="La cuenta es: " + cuenta + ".  El nombre es: " + nombre + "El saldo es: " + saldo + ".";
		 return res;
	 }
	 
	 public int compareTo(CuentaBancaria c) {
		 int res;
		 if(cuenta==c.cuenta)
			 res=0;
		 else
			 if(cuenta>c.cuenta)
				 res=1;
			 else
				 res=-1;
	     return res;
	 }
}

