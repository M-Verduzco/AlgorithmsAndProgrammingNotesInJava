package Librerias;

import java.util.Arrays;

public class Licoreria1 {
	private String nombre;
	private String gerente;
	private Licor l[];
	private int numLicores;
	private double [] precio;
	private final int MAX = 150;
	
	public Licoreria1(String nombre, String gerente) {
		this.nombre = nombre;
		this.gerente = gerente;
		l = new Licor [MAX];
		this.numLicores = 0;
		precio = new double [MAX];
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getGerente() {
		return gerente;
	}

	public void setGerente(String gerente) {
		this.gerente = gerente;
	}

	public boolean altaLicor(String tipo, String marca, int grados, boolean añejo, double price) {
		boolean res = false;
		Licor lic;
		if(numLicores<l.length) {
			lic = new Licor(tipo, marca, grados, añejo);
			l[numLicores]=lic;
			precio [numLicores]=price;
			numLicores++;
			res=true;
		}	
		return res;
	}
	
	public int gradosMayores(double gradosEva) {
		int res = 0;
		for(int i=0; i<numLicores; i++)
			if(l[i].getGrados()>gradosEva)
				res++;
		return res;
	}
	
	public String masCaro() {
		StringBuilder cad;
		cad = new StringBuilder();
		int indice = ManejadorArreglos1.indiceMayorD(precio, numLicores);
		cad.append (l[indice].getTipo());
		cad.append ("  -  " + l[indice].getMarca());
		return cad.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + MAX;
		result = prime * result + ((gerente == null) ? 0 : gerente.hashCode());
		result = prime * result + Arrays.hashCode(l);
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + numLicores;
		result = prime * result + Arrays.hashCode(precio);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Licoreria1 other = (Licoreria1) obj;
		if (MAX != other.MAX)
			return false;
		if (gerente == null) {
			if (other.gerente != null)
				return false;
		} else if (!gerente.equals(other.gerente))
			return false;
		if (!Arrays.equals(l, other.l))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (numLicores != other.numLicores)
			return false;
		if (!Arrays.equals(precio, other.precio))
			return false;
		return true;
	}
	
	public int compareTo(Licoreria1 otro) {
		return nombre.compareTo(otro.nombre);
	}

	@Override
	public String toString() {
		return "Licoreria [nombre=" + nombre + ", gerente=" + gerente + ", l=" + Arrays.toString(l) + ", numLicores="
				+ numLicores + ", precio=" + Arrays.toString(precio) + ", MAX=" + MAX + "]";
	}	

}

