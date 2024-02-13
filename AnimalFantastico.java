package Librerias;

public class AnimalFantastico implements Comparable <AnimalFantastico>{
	private String nomEsp;
	private String nomIng;
	private String historia;
	private int cuantos;
	
	
	public AnimalFantastico(String nomEsp, String nomIng, String historia, int cuantos) {
		this.nomEsp = nomEsp;
		this.nomIng = nomIng;
		this.historia = historia;
		if(cuantos>50)
			this.cuantos = 50;
		else
			this.cuantos=cuantos;
	}
	
	public AnimalFantastico(String nombreEsp) {
		this.nomEsp = nombreEsp;
	}


	public String getNomEsp() {
		return nomEsp;
	}

	public void setNomEsp(String nomEsp) {
		this.nomEsp = nomEsp;
	}

	public String getNomIng() {
		return nomIng;
	}

	public void setNomIng(String nomIng) {
		this.nomIng = nomIng;
	}

	public String getHistoria() {
		return historia;
	}

	public void setHistoria(String historia) {
		this.historia = historia;
	}

	public int getTotal() {
		return cuantos;
	}

	public void setTotal(int cuantos) {
		this.cuantos = cuantos;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((historia == null) ? 0 : historia.hashCode());
		result = prime * result + ((nomEsp == null) ? 0 : nomEsp.hashCode());
		result = prime * result + ((nomIng == null) ? 0 : nomIng.hashCode());
		result = prime * result + cuantos;
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
		AnimalFantastico other = (AnimalFantastico) obj;
		if (historia == null) {
			if (other.historia != null)
				return false;
		} else if (!historia.equals(other.historia))
			return false;
		if (nomEsp == null) {
			if (other.nomEsp != null)
				return false;
		} else if (!nomEsp.equals(other.nomEsp))
			return false;
		if (nomIng == null) {
			if (other.nomIng != null)
				return false;
		} else if (!nomIng.equals(other.nomIng))
			return false;
		if (cuantos != other.cuantos)
			return false;
		return true;
	}
	
	public int compareTo(AnimalFantastico otro) {
		return nomEsp.compareTo(otro.nomEsp);
	}
	
	@Override
	public String toString() {
		return "AnimalFantastico [nomEsp=" + nomEsp + ", nomIng=" + nomIng + ", historia=" + historia + ", cuantos="
				+ cuantos + "]";
	}
	
}
