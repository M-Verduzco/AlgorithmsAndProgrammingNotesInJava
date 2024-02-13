package Librerias;

public class Servicio {
	private int conductor;
	private int vehiculo;
	private int pasajero;
	public static int cont=1;
	private int claveUnica;
	private char turno;
	private int zona;
	private double distancia;
	private boolean pool;
	
	public Servicio (int conductor, int pasajero, int vehiculo, char turno, int zona, double distancia, boolean pool ) {
		claveUnica=cont;
		cont++;
		this.conductor=conductor;
		this.vehiculo=vehiculo;
		this.pasajero=pasajero;
		this.turno=turno;
		this.zona=zona;
		this.distancia=distancia;
		this.pool=pool;
	}

	public int getConductor() {
		return conductor;
	}

	public void setConductor(int conductor) {
		this.conductor = conductor;
	}

	public int getVehiculo() {
		return vehiculo;
	}

	public void setVehiculo(int vehiculo) {
		this.vehiculo = vehiculo;
	}

	public int getPasajero() {
		return pasajero;
	}

	public void setPasajero(int pasajero) {
		this.pasajero = pasajero;
	}

	public int getClaveUnica() {
		return claveUnica;
	}

	

	public char getTurno() {
		return turno;
	}

	public void setTurno(char turno) {
		this.turno = turno;
	}

	public int getZona() {
		return zona;
	}

	public void setZona(int zona) {
		this.zona = zona;
	}

	public double getDistancia() {
		return distancia;
	}

	public void setDistancia(double distancia) {
		this.distancia = distancia;
	}

	public boolean getPool() {
		return pool;
	}

	public void setPool(boolean pool) {
		this.pool = pool;
	}
	
	public double calculaMonto() {
		double res = 20;
		if(pool)
			res+=6*distancia;
		else
			res+=12*distancia;
		
		if(turno=='N'&&zona>3&&zona<9)
			res=80;
		
		if(turno=='M'&&zona>0&&zona<5&&distancia>15)	
			res=30;			
		return res;	
	}
	
	public boolean extenso() {
		boolean res=true;
		if(distancia>30&&pool==true)
			res=false;
		return res;
	}

	public int compareTo(Servicio s) {
		int res = 0;
		if (claveUnica==s.claveUnica)
			res=0;
			if(claveUnica>s.claveUnica)
				res=1;
			else 
				res= -1;	
		return res;
	}
	
	
	public boolean equals(Servicio s) {
		boolean res;
		if (claveUnica==s.claveUnica)
			res =true;
		else
			res=false;
		return res;
	}
	
	public String toString() {
		return "Servicio \n clave unica=" + claveUnica + ", conductor=" + conductor + ", vehiculo=" + vehiculo + ", pasajero=" + pasajero + ", turno="
				+ turno + ", zona=" + zona + ", distancia=" + distancia + ", pool=" + pool  ;
	}
	
	
	
	

}
