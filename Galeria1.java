package Librerias;


import java.util.ArrayList;

public class Galeria1 {
	private String nombre;
	private String tel;
	private final int MAX=100;
	private Pintura []p;
	private int np;
	
	public Galeria1(String nombre, String tel) {
		this.nombre = nombre;
		this.tel = tel;
		p= new Pintura[MAX];
		np=0;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}
			//String nombre, String pintor, String tecnica, int año, double precio
	public boolean altaPintura(String nombre, String pintor, String tecnica, int año, double precio) {
		boolean res=false;
		Pintura pin;
		if(np<p.length) {
			pin = new Pintura(nombre, pintor, tecnica,año, precio);
			p[np]=pin;
			np++;
			res=true;
		}
		return res;
	}
	public ArrayList<String> consultaTecnicaPintor(String pintor, String tecnica){
		ArrayList<String> lista = new ArrayList<String>();
		for(int i=0;i<np;i++)
			if(p[i].getPintor().equals(pintor)&&p[i].getTecnica().equals(tecnica))
				lista.add(p[i].toString());
		return lista;
	}
	
	public boolean precioMenor(double precio) {
		boolean res=false;
		int i=0;
		while(i<np && p[i].getPrecio()>precio)
			i++;
		if(i!=np)
			res=true;
		return res;
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
		Galeria1 other = (Galeria1) obj;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}
	
	public int compareTo(Galeria1 otro) {
		return nombre.compareTo(otro.nombre);
	}
	
	public String toString() {
		StringBuilder cad= new StringBuilder();
		cad.append("el nombre de la galeria es: " + nombre);
		cad.append("el teléfono de la galeria es: "+ tel);
		for(int i=0; i< np ;i++) {
			cad.append("\n la pintura " + i + "es :" + p[i].toString());
		}
		return cad.toString();
	}
	
	
	

}