package Librerias;


public class Circulo {
 private double radio;
 public Circulo (double r) {
	 radio=r;
 }
 public double getRadio() {
	 return radio;
 }

 public void setRadio(double radio) {
	 this.radio=radio;
 }
 public double calculaPerimetro(double pi) {
	 double res;
	 res=pi*2*radio;
	 return res;
 }
 public double calculaArea(double pi) {
	 double res;
	 res=pi*radio*radio;
	 return res;
 }
 public String toString () {
	 String res;
	 res="El radio es" + radio;
	 return res;
 }
 public boolean equals (Circulo r) {
	 boolean res;
	 if(radio==r.radio)
		 res=true;
	 else
		 res=false;
	 return res;
 }
 public int compareTo(Circulo r) {
	 int res;
	 if(r.radio==radio)
		 res=0;
	 else
		 if(radio>r.radio)
			 res=1;
		 else
			 res=-1;
     return res;
 }
}

