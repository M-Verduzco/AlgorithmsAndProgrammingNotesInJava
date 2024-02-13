package Librerias;

public class Bicicleta {
	public static int idBici=200;
	private char tipo;
	private int numA;
	private char matF;
	private int precio;

	
public Bicicleta(char tipo, int numA, char matF) {
	
	this.idBici ++;
	this.tipo=tipo;
	this.numA=numA;
	this.matF=matF;
	switch (tipo) {
	case('U'):
		this.precio = 700;
	break;
	case('P'):
		this.precio=15000;
	break;
	case('M'):
		this.precio=27000;
	break;
	}

}

public Bicicleta(char tipo, char matF) {
	idBici ++;
	this.tipo=tipo;
	this.matF=matF;
	switch (tipo) {
	case('U'):
		this.precio = 700;
	break;
	case('P'):
		this.precio=15000;
	break;
	case('M'):
		this.precio=27000;
	break;
	}
}

public void setNumA(int numA) {
	this.numA=numA;
}
	
public int getNumA() {
	return numA;
}

public double calculaCosto() {
	double res=0;
	res = precio;
	if(numA==3 || numA==4) {
		res=res+600;
	}else {
		if(numA>4)
			res=res+1000;
	}
	
	if(matF=='A') 
		res=res+2000;	
	else 
		if(matF=='F') 
			res=res+5000;
	return res;
	}

	public int calculaTiempo() {
		int res = 0;
		if (tipo=='U')
			res=1;
		else
			if(tipo=='P' || tipo=='M')
				res=2;
		if(matF=='F')
				res=res+1;
		return res;
	}

	
	public String toString() {
		return "Bicicleta [id=" + idBici + ", tipo=" + tipo + ", numA=" + numA + ", matF=" + matF + ", precio= " + precio + " ]";
	}
	
	public boolean equals(Bicicleta otra) {
		boolean res =false;
		if(this.idBici==otra.idBici)
			res = true;
		return res;
	}
	
	public int compareTo(Bicicleta otra) {
		int res;
		if(this.idBici==otra.idBici) {
			res = 0;
		}else if (this.idBici>otra.idBici) {
			res = 1;
		}else {
			res = -1;
		}
		return res;
	}
	
	
	
}
			

