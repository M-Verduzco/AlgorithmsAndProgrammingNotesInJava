package Librerias;
//Cada alumno se identifica por la clave única, carrera que estudia y semestre que está cursando, su edad y genero
public class Alumno {
	private int claveU = 1;
	private String carrera;
	private int semestre;
	private int edad;
	private char genero;
	public static int c = 0;
	
	public Alumno(String carrera, int semestre, int edad, char genero) {
		super();
		this.carrera = carrera;
		this.semestre = semestre;
		this.edad = edad;
		this.genero = genero;
		this.claveU+=c;
		c++;
	}

	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}

	public int getSemestre() {
		return semestre;
	}

	public void setSemestre(int semestre) {
		this.semestre = semestre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public char getGenero() {
		return genero;
	}

	public void setGenero(char genero) {
		this.genero = genero;
	}

	public int getClaveU() {
		return claveU;
	}

	@Override
	public String toString() {
		return "Alumno [claveU=" + claveU + ", carrera=" + carrera + ", semestre=" + semestre + ", edad=" + edad
				+ ", genero=" + genero + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((carrera == null) ? 0 : carrera.hashCode());
		result = prime * result + claveU;
		result = prime * result + edad;
		result = prime * result + genero;
		result = prime * result + semestre;
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
		Alumno other = (Alumno) obj;
		if (carrera == null) {
			if (other.carrera != null)
				return false;
		} else if (!carrera.equals(other.carrera))
			return false;
		if (claveU != other.claveU)
			return false;
		if (edad != other.edad)
			return false;
		if (genero != other.genero)
			return false;
		if (semestre != other.semestre)
			return false;
		return true;
	}

	
	
	
}
