package Librerias;

public class Medicamento implements Comparable <Medicamento> {
	private String nombre;
	private int dosis;
	
	public Medicamento(String nombre, int dosis) {
		this.nombre = nombre;
		this.dosis = dosis;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDosis() {
		return dosis;
	}

	public void setDosis(int dosis) {
		this.dosis = dosis;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + dosis;
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
		Medicamento other = (Medicamento) obj;
		if (dosis != other.dosis)
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}
	
	public int compareTo(Medicamento otro) {
		return nombre.compareTo(otro.getNombre());
	}

	@Override
	public String toString() {
		return "Medicamento [nombre=" + nombre + ", dosis=" + dosis + "]";
	}
	
	
	
	
	
	
	

}
