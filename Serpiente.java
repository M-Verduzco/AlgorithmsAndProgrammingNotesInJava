package Librerias;

public class Serpiente {
	public String nombre;
	public static int contador=101;
	public int clave;
	public String alimentacion;
	public String tipo;
	
	public Serpiente(String nombre, String tipo, String alimentacion) {
		clave=contador;
		contador++;
		this.nombre=nombre;
		this.alimentacion = alimentacion;
		this.tipo = tipo;
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

	public String getAlimentacion() {
		return alimentacion;
	}

	public void setAlimentacion(String alimentacion) {
		this.alimentacion = alimentacion;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((alimentacion == null) ? 0 : alimentacion.hashCode());
		result = prime * result + clave;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + ((tipo == null) ? 0 : tipo.hashCode());
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
		Serpiente other = (Serpiente) obj;
		if (alimentacion == null) {
			if (other.alimentacion != null)
				return false;
		} else if (!alimentacion.equals(other.alimentacion))
			return false;
		if (clave != other.clave)
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (tipo == null) {
			if (other.tipo != null)
				return false;
		} else if (!tipo.equals(other.tipo))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Serpiente [nombre=" + nombre + ", clave=" + clave + ", alimentacion=" + alimentacion + ", tipo=" + tipo
				+ "]";
	}

	public int compareTo(Serpiente s) {
		return s.clave-clave;
	}
}

