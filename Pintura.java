package Librerias;

public class Pintura {
	private String nombre;
	private String pintor;
	private String tecnica;
	private int a�o;
	private double precio;
	
	public Pintura(String nombre, String pintor, String tecnica, int a�o, double precio) {
		this.nombre = nombre;
		this.pintor = pintor;
		this.tecnica = tecnica;
		this.a�o = a�o;
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getPintor() {
		return pintor;
	}

	public String getTecnica() {
		return tecnica;
	}

	public int getA�o() {
		return a�o;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
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
		Pintura other = (Pintura) obj;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}

	@Override
	
	public String toString() {
		return "Pintura [nombre=" + nombre + ", pintor=" + pintor + ", tecnica=" + tecnica + ", a�o=" + a�o
				+ ", precio=" + precio + "]";
	}
	
	public int compareTo(Pintura p) {
		return nombre.compareTo(p.nombre);
	}
	
	
	
	

}
