package Librerias;
import Librerias.Platillo;

public class Fonda {
	private String nombre;
	private String tel;
	private int numPlatillos;
	private Platillo [] p;
	private final int MAX=20;

	public Fonda(String nombre, String tel) {
		numPlatillos=0;
		p= new Platillo[MAX];
		this.nombre=nombre;
		this.tel=tel;
	}
	
	public boolean altaPlatillo(String  nombre, double precio, int numIngredientes, boolean esVegetariano) {
		boolean res=false;
		Platillo a;
		if(numPlatillos<MAX) {
			a = new Platillo (nombre, precio, numIngredientes, esVegetariano);
			p[numPlatillos]=a;
			numPlatillos++;
			res=true;
		}
		return res;
	}
	
	public String masCaro() {
		String res=" ";
		int max =0;
		for(int i =0; i<numPlatillos;i++) 
			if(p[max].getPrecio()<p[i].getPrecio())
			max=i;
		res=p[max].toString();
		return res;
	}
	
	public String datos(int clave) {
		String res = " ";
		int i=0;
		while (i<numPlatillos && p[i].getClaveUnica()!=clave)
			i++;
		if(i<numPlatillos &&p[i].getClaveUnica()==clave)
			res=p[i].toString();
		return res;
	}
	
	
}
