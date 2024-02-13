package Librerias;

public class Compañia {
	private String nombre;
	private String direccion;
	private String ciudad;
	private String director;
	private double [] ventas;
	private double totalVentas;
	int mes;
	
	public Compañia(int n) { 
		mes=n;
	}
	
	public Compañia(int n, String nombre, String direccion, String ciudad, String director) {
		this.nombre=nombre;
		this.direccion=direccion;
		this.ciudad=ciudad;
		this.director=director;
		mes=n;
		ventas= new double [mes];
		totalVentas=ManejadorArreglos1.sumaElementosD(ventas, mes);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public double[] getVentas() {
		return ventas;
	}

	public void setVentas(int i, double v) {
		ventas[i]=v;
	}

	public double getTotalVentas() {
		return totalVentas;
	}

	public void setTotalVentas(double totalVentas) {
		this.totalVentas = totalVentas;
	}
	
	public double promedioVentas() {
		return ManejadorArreglos1.promElementosD(ventas, mes);
	}
	
	public double mesMayor() {
		return ventas[ManejadorArreglos1.indiceMayorD(ventas, mes)];
	}

	public double  mesMenor() {
		return ventas[ManejadorArreglos1.indiceMenorD(ventas, mes)];
	}
	
	public int cantArribaProm() {
		return ManejadorArreglos1.cantElementosMayoresD(ventas, mes, ManejadorArreglos1.promElementosD(ventas, mes));
	}
	
	public boolean equals (Compañia O) {
		return nombre.contentEquals(O.nombre);
			
	}
	public int compareTo (Compañia o) {
		return nombre.compareTo(o.nombre);
	}
	public String toString() {
		StringBuilder cad;
		cad= new StringBuilder();
		cad.append("\n El nombre de la compañia es: " + nombre);
		cad.append("\n El nombre de la dirección es: " + direccion);
		cad.append("\n El nombre de la ciudad es: " + ciudad);
		cad.append("\n El nombre del director es: " + director);
		cad.append("\n El numero de meses es: " + mes);
		cad.append("\n El total de las ventas fue: " + totalVentas);
		cad.append("\n");
		for (int i=0; i<mes;i++) {
			cad.append("\n El mes: " + (i+1));
			cad.append("\n Las ventas fueron: " +  ventas [i]);
			cad.append("\n");
		}
		return cad.toString();


		}
	
	
}
