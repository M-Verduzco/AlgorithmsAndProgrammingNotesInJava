package Librerias;

public class CientificoMatematico {
	private String nombre;
	private String areaEspecialidad;
	public CientificoMatematico() {}
	public CientificoMatematico(String nombre, String areaEspecialidad) {
		this.nombre=nombre;
		this.areaEspecialidad=areaEspecialidad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setAreaEspecialidad(String areaEspecialidad) {
		this.areaEspecialidad=areaEspecialidad;
	}
	public String getAreaEspecialidad() {
		return areaEspecialidad;
	}
	public String toString () {
		 String res;
		 res="El nombre es " + nombre + "y su área de especialidad es " + areaEspecialidad ;
		 return res;
	 }
	//funciones propias de la clase
	
	public boolean estaOrdenCreciente(int numero1, int numero2) {
		boolean res = false;
				if(numero2>numero1)
					res=true;
				return res;
	}
	public String ordenCreciente(int numero1, int numero2) {
		String res;
		if(numero1<numero2)
			res = numero1 + "-" + numero2;
		else 
			res= numero2 + "-" + numero1;
		return res;
		
	}
	
	public boolean esImpar(int num){
		boolean res;
		if(num%2==1)
			res= true;
		else
			res= false;
		return res;
		
	
	}
	public double calculaFuncion1(double x) {
		double res;
		if(x<=11)
			res=3*x+36;
		else
			if(x<=33)
				res=Math.pow(x, 2) - 10;
			else 
				if (x<=64)
					res=x+6;
				else 
					res=0;
		return res;
		
	}
	public double calculaFuncion2(int x) {
		double res;
		if(x%4==0)
			res=Math.pow(x,2);
		else
			if(x%4==1)
				res=x/6;
			else 
				if (x%4==2)
					res=Math.sqrt(x);
				else 
					res=Math.pow(x	, 3) + 5;
		return res;
		
	}
	public double calculaFuncion3(int num, int v) {
		double res;
		if(num==1)
			res=v*100;
		else
			if(num==2)
				res=Math.pow(100, v);
			else 
				if (num==3)
					res=100/v;
				else 
					res=0;
		return res;
	}
	
	
	public String calculaUllman(int num) {
		String res = " " + num;
		while(num>1) {
			if(num%2==0)
				num=num/2;
			else
				num=num*3+1;
			res = res +" "+num;
		}		
		return res;
	}
}

