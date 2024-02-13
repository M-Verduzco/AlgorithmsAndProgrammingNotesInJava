package Librerias;

import Librerias.Vegetal;

public class Rancho {
	private String nombre;
	private String estado;
	private Vegetal [][] veg;
	private final int MAXR=4;
	private final int MAXC=10;
	
	public Rancho () {
		veg= new Vegetal [MAXR][MAXC];
	}
	
	public Rancho (String nombre, String estado) {
		this();
		this.nombre = nombre;
		this.estado = estado;
	}
	
	public  boolean altaVegetal(String nombre, double precio, char categoria, int nc, int nr) {
		boolean res=false;
		if (nc<MAXC && nr<MAXR && veg[nr][nc] == null) {
				veg[nr][nc] = new Vegetal(nombre, precio, categoria);
				res=true;
			}
		return res;
	}
	
	public  int lotesJito () {
		int res = 0;
		int j;
		boolean f;
		for(int i = 0; i< MAXR; i++) {
			f = true;
			j=0;
			while(j<MAXC && f) {
				if(veg[i][j]!=null && veg[i][j].getNombre().equals("jitomate")) {
					res++;
					f = false;
				}
			j++;
			}	
		}
		return res;
	}
	
	public String vecesPorLote(String nom) {
		StringBuilder resul = new StringBuilder();
		int [] res = new int [MAXR];
		for (int i=0; i<MAXR; i++) {
			for (int j=0; j<MAXC; j++) {
				if(veg[i][j]!=null && veg[i][j].getNombre().equals(nom))
					res[i]++;
			}
			resul.append("En la parecela "+ (i+1) + ", hay: " + res[i]);
			resul.append("\n");
		}
		return resul.toString();
	}
	
	public boolean hayEjotes() {
		boolean res= false;
		boolean bandera = true;
		int j;
		int i=0;
		while (i<MAXR && bandera){
			j=0;
			while(j<MAXC && bandera) {
				if(veg[i][j]!=null)
					if(veg[i][j].getNombre().equals("ejote"))
						bandera=false;
				j++;
				}
			i++;
		}
		res = !bandera;
		return res;	
	}
	
	public boolean hayEjoteIneficiente() {
		boolean res=false;
		for(int i=0; i<MAXR; i++)
			for(int j=0; j<MAXC; j++)
				if(veg[i][j]!=null)
					if(veg[i][j].getNombre().equals("ejote"))
						res=true;
		return res;
	}
	
	
	public String toString() {
		StringBuilder cad = new StringBuilder();
		cad.append("El nombre del rancho es "+nombre);
		cad.append("\nEl nombre del estado del rancho es "+estado);
		for(int i = 0; i < MAXR; i++)
			for(int j = 0; j < MAXC; j++)
				if(veg[i][j] != null)
					cad.append("\n("+i+", "+j+") = " + veg[i][j].toString());
		return cad.toString();
	}
	
	
}