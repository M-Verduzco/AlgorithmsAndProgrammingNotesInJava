package Librerias;

public class Vegetal  implements Comparable <Vegetal>{
	
	public String nombre;
	public double precio;
	public char categoria;

	
	
	public Vegetal (String nombre, double precio, char categoria) {
		this.nombre = nombre;
		this.precio = precio;
		this.categoria = categoria;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}

	public char getCategoria() {
		return categoria;
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
		Vegetal other = (Vegetal) obj;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}
	
	public int compareTo(Vegetal otro) {
		return nombre.compareTo(otro.getNombre());
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Vegetal \n");
		sb.append(" nombre:       "+nombre+"\n");
		sb.append(" precio:       "+precio+"\n");
		sb.append(" categoria:    "+categoria+"\n");
		return sb.toString();
	}

}