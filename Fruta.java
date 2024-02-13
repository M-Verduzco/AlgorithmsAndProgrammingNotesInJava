package Librerias;

public class Fruta {
	private String nombre;
	private String ciudad;
	private String color;
	private int clave;
	public static int c=2000;
	private double precio;
	
	public Fruta () {
		clave = c;
		c++;
	}
	
	public Fruta( String nombre, String color, String ciudad,double precio ) {
		clave=c;
		c++;
		this.nombre=nombre;
		this.color=color;
		this.ciudad=ciudad;
		this.precio=precio;
	}
	
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public double calculaPorcentajeDescuento(double inversion) {
		double res;
		if(inversion<1500)
			res=0;
		else 
			if(inversion>1500&&inversion<10000)
				res= ((inversion -1500)/8500)*10;
				
			else 
				res=inversion*0.1;
		return res;
	}
	
	public double calculaCosto (double kilos) {
		double res;
		double monto1;
		monto1= (kilos*precio);
		res= monto1 - calculaPorcentajeDescuento(monto1);
		return res;
	}
	
	public int compareTo(Fruta f) {
		int res;
		if(clave==f.clave)
			res=0;
		else
			if(clave<f.clave)
				res=-1;
			else
				res=1;
		return res;
	}
	
	public boolean equals(Fruta f) {
		boolean res=false;
		if(clave==f.clave);
			res=true;
		return res;
	}
	
	public String toString() {
		String res;
		res= ("La clave es: " + clave + ", el nombre es: "+ nombre + ", el color es: " +  color + ", la ciudad es: " + "; el precio por kilo es: "+ precio);
		return res;
	}
}

