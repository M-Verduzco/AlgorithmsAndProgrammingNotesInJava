package Librerias;
/*
 * Mauricio Verduzco
 * Version 1.0
 * 301020
 */
public class Animal implements Comparable<Animal>{
	private int id;
	private String nombre;
	private String raza;
	private String color;
	private static int c=101;
	
	
	
	public Animal(int id) {
		this.id=id;
	}


	public Animal(String nombre, String raza, String color) {
		id=c;
		c++;
		this.nombre = nombre;
		this.raza = raza;
		this.color = color;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getRaza() {
		return raza;
	}



	public void setRaza(String raza) {
		this.raza = raza;
	}



	public String getColor() {
		return color;
	}



	public void setColor(String color) {
		this.color = color;
	}



	public int getId() {
		return id;
	}



	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
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
		Animal other = (Animal) obj;
		if (id != other.id)
			return false;
		return true;
	}



	public int compareTo(Animal a) {
		return id-a.id;
	}



	@Override
	public String toString() {
		return "Animal [id=" + id + ", nombre=" + nombre + ", raza=" + raza + ", color=" + color + "]";
	}
	
	
	

}
