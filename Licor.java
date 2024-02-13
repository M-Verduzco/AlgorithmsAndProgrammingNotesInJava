package Librerias;

public class Licor {
	private String tipo;
	private String marca;
	private int grados;
	private boolean a�ejo;
	public Licor(String tipo, String marca, int grados, boolean a�ejo) {
		super();
		this.tipo = tipo;
		this.marca = marca;
		this.grados = grados;
		this.a�ejo = a�ejo;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getGrados() {
		return grados;
	}
	public void setGrados(int grados) {
		this.grados = grados;
	}
	public boolean isA�ejo() {
		return a�ejo;
	}
	public void setA�ejo(boolean a�ejo) {
		this.a�ejo = a�ejo;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (a�ejo ? 1231 : 1237);
		result = prime * result + grados;
		result = prime * result + ((marca == null) ? 0 : marca.hashCode());
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
		Licor other = (Licor) obj;
		if (a�ejo != other.a�ejo)
			return false;
		if (grados != other.grados)
			return false;
		if (marca == null) {
			if (other.marca != null)
				return false;
		} else if (!marca.equals(other.marca))
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
		return "Licor [tipo=" + tipo + ", marca=" + marca + ", grados=" + grados + ", a�ejo=" + a�ejo + "]";
	}
	
}
