package Librerias;

public class Planta {
	private int clave;
	private String nombre;
	private String color;
	private int epoca;
	private int total;
	public static int cont =200;
	
	
	public Planta(String nombre, String color, int epoca, int total) {
		super();
		this.clave=cont;
		cont+=2;
		this.nombre = nombre;
		this.color = color;
		this.epoca = epoca;
		this.total = total;
	}
	
	public int getClave() {
		return clave;
	}

	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public int getEpoca() {
		return epoca;
	}


	public void setEpoca(int epoca) {
		this.epoca = epoca;
	}


	public int getTotal() {
		return total;
	}


	public void setTotal(int total) {
		this.total = total;
	}

	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + clave;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + epoca;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + total;
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
		Planta other = (Planta) obj;
		if (clave != other.clave)
			return false;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (epoca != other.epoca)
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (total != other.total)
			return false;
		return true;
	}
	
	public int compareTo(Planta otro) {
		return clave-(otro.clave);
	}

	@Override
	public String toString() {
		return "Planta [clave=" + clave + ", nombre=" + nombre + ", color=" + color + ", epoca=" + epoca + ", total="
				+ total + "]";
	}
	
	



	
	

}
