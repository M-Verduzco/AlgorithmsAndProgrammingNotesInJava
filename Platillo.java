package Librerias;

public class Platillo {
	private int claveUnica;
	private static int cont =200;
	private String  nombre;
	private double precio;
	private int numIngredientes;
	private boolean esVegetariano;
	
	public Platillo (String  nombre, double precio, int numIngredientes, boolean esVegetariano) {
		this.claveUnica=cont;
		cont+=10;
		this.nombre = nombre;
		this.precio = precio;
		this.numIngredientes = numIngredientes;
		this.esVegetariano = esVegetariano;
	}
	
	public int getClaveUnica() {
		return claveUnica;
	}

	public String getNombre() {
		return nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public int getNumIngredientes() {
		return numIngredientes;
	}

	public boolean isEsVegetariano() {
		return esVegetariano;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}	

	public void setNumIngredientes(int numIngredientes) {
		this.numIngredientes = numIngredientes;
	}

	public void setEsVegetariano(boolean esVegetariano) {
		this.esVegetariano = esVegetariano;
	}
	
	public int compareTo(Platillo p) {
		return claveUnica-p.claveUnica;
	}
	
	public String toString(){
		StringBuilder cad=new StringBuilder();
		cad.append("\nPlatillo de         clave unica: "+claveUnica);
		cad.append("\nPlatillo de         nombre: "+nombre);
		cad.append("\n                    precio: "+precio);
		cad.append("\n    número de ingredientes: "+numIngredientes);
		cad.append("\n            es vegetariano: "+esVegetariano);
		return cad.toString();
	}
}
