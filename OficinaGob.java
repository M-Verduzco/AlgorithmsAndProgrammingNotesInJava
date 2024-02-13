package Librerias;
public class OficinaGob {
	
	private int [] pob;
	private String [] nomEdo;
	private String nombre;
	int numEdo;
	
	public OficinaGob(int n) {
		numEdo=n;
		pob= new int[numEdo];
		nomEdo=new String[numEdo];
		
	}
	public OficinaGob(int n, String nombre) {
		numEdo=n;
		pob= new int[numEdo];
		nomEdo=new String[numEdo];
		this.nombre=nombre;
	}
	public String getNombre() {
		return nombre;
		
	}
	public void setNombre (String n) {
		nombre=n;
	}
	
	public int getElePob(int i) {
		return pob[i];
		
	}
	
	public void setElePob (int i, int v) {
		pob[i]=v;
		
	}
	public String getEleNombEdo (int i) {
		return nomEdo[i];
		
	}
	public void setEleNomEdo (int i, String v) {
		nomEdo[i]=v;
	}
	
	public String mayPobEdo() {
		return nomEdo[ManejadorArreglos1.indiceMayorI(pob, numEdo)];
		
	}
	public double promPobEdo() {
		return ManejadorArreglos1.promElementosI(pob, numEdo);
		
	}
	public int totMenPromEdo() {
		return ManejadorArreglos1.cantElementosMenoresI(pob,numEdo,  promPobEdo());
	}
	public boolean equals (OficinaGob O) {
		return nombre.contentEquals(O.nombre);
		
		
	}
	public int compareTo (OficinaGob o) {
		return nombre.compareTo(o.nombre);
	}
	public String toString() {
		StringBuilder cad;
		cad= new StringBuilder();
		cad.append("\n el nombre del director es: " + nombre);
		cad.append("\n el numero de estados es: " + numEdo);
		for (int i=0; i<numEdo;i++) {
			cad.append("\n");
			cad.append("\n el edo: " + nomEdo[i]);
			cad.append("\n la población: " +  pob[i]);
			cad.append("\n");
		}
		return cad.toString();


		}
	}

