package Librerias;

public class Rectangulo {
	private double base;
	private double altura;
	public Rectangulo (double base,double altura) {
		 this.base=base;
		 this.altura=altura;
	 }
	 public double getBase() {
		 return base;
	 }
	 public double getAltura() {
		 return altura;
	 }
	 public void setBase(double base) {
		 this.base=base;
	 }
	 public void setAltura(double altura) {
		 this.altura=altura;
	 }
	 public double calculaPerimetro() {
		 double p;
		 p=2*base+2*altura;
		 return p;
	 }
	 public double calculaArea() {
		 double area;
		 area=base*altura;
		 return area;
	 }
	 public boolean equals (Rectangulo r) {
		 boolean res;
		 if(base==r.base && altura==r.altura)
			 res=true;
		 else
			 res=false;
		 return res;
	 }
	 public String toString () {
		 String res;
		 res="La base es" + base + "La altura es" + altura;
		 return res;
	 }
	 public int compareTo(Rectangulo r) {
		 int res;
		 if(base==r.base && altura==r.altura)
			 res=0;
		 else
			 if(base>r.base && altura>r.altura)
				 res=1;
			 else
				 res=-1;
	     return res;
	 }
	}