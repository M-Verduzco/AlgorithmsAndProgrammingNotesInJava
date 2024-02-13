package Librerias;

public class Videos {
	private String tipo;
	private double duracion;
	private String titulo;
	private String genero;
	private boolean premio;
	private int vistas;
	
	
	public Videos(String tipo, double duracion, String titulo, String genero, boolean premio, int vistas) {
		
		this.tipo = tipo;
		this.duracion = duracion;
		this.titulo = titulo;
		this.genero = genero;
		this.premio = premio;
		this.vistas = vistas;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public double getDuracion() {
		return duracion;
	}


	public void setDuracion(double duracion) {
		this.duracion = duracion;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getGenero() {
		return genero;
	}


	public void setGenero(String genero) {
		this.genero = genero;
	}


	public int getVistas() {
		return vistas;
	}


	public void setVistas(int vistas) {
		this.vistas = vistas;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(duracion);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((genero == null) ? 0 : genero.hashCode());
		result = prime * result + (premio ? 1231 : 1237);
		result = prime * result + ((tipo == null) ? 0 : tipo.hashCode());
		result = prime * result + ((titulo == null) ? 0 : titulo.hashCode());
		result = prime * result + vistas;
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
		Videos other = (Videos) obj;
		if (Double.doubleToLongBits(duracion) != Double.doubleToLongBits(other.duracion))
			return false;
		if (genero == null) {
			if (other.genero != null)
				return false;
		} else if (!genero.equals(other.genero))
			return false;
		if (premio != other.premio)
			return false;
		if (tipo == null) {
			if (other.tipo != null)
				return false;
		} else if (!tipo.equals(other.tipo))
			return false;
		if (titulo == null) {
			if (other.titulo != null)
				return false;
		} else if (!titulo.equals(other.titulo))
			return false;
		if (vistas != other.vistas)
			return false;
		return true;
	}
	
	
	public int compareTo(Videos otro) {
		return titulo.compareTo(otro.titulo);
	}

	@Override
	public String toString() {
		return "Videos [tipo=" + tipo + ", duracion=" + duracion + ", titulo=" + titulo + ", genero=" + genero
				+ ", premio=" + premio + ", vistas=" + vistas + "]";
	}
	
	
	
	

}
