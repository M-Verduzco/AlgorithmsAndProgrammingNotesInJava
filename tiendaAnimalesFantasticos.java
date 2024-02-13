package Librerias;

public class tiendaAnimalesFantasticos{
	private  AnimalFantastico [] ani;
	private String nombre;
	private final  int MAX = 50;
	private  int numA;
	
	public tiendaAnimalesFantasticos() {
		ani=new AnimalFantastico[MAX];
		numA=0;
	}
	
	public tiendaAnimalesFantasticos(String nombre) {
		this();
		this.nombre = nombre;
	}
	
	
	public  boolean altaAnimal(String nomEsp, String nomIng, String historia, int cuantos) {
		boolean res = false;
		int pos;
		AnimalFantastico x;
		if(numA<MAX) {
			x = new AnimalFantastico(nomEsp, nomIng, historia, cuantos);
			pos=ManejadorArreglosGenerico.inserta(ani, numA, x);
			if(pos>numA) {
				numA=pos;
				res = true;
			}
		}
		return res;
	}
	
	public  String nombreIngles(String nomEsp) {
		String res = "Algo salió mal";
		int i =0;
		while(i<numA && !ani[i].getNomEsp().equals(nomEsp.toUpperCase()))
			i++;
		if(ani[i]!= null && ani[i].getNomEsp().equals(nomEsp.toUpperCase()))
			res = ani[i].getNomIng();
		return res;
	}
	
	public  String historia (String nomEsp) {
		String res = "Algo salió mal";
		int i =0;
		while(i<numA && !ani[i].getNomEsp().equals(nomEsp.toUpperCase()))
			i++;
		if(ani[i]!= null && ani[i].getNomEsp().equals(nomEsp.toUpperCase()))
			res = ani[i].getHistoria();
		return res;
	}
	
	public String toString() {
		StringBuilder cad = new StringBuilder();
		cad.append("El nombre de la tienda es "+nombre);
		for(int i = 0; i < numA; i++)
				if(ani[i] != null)
					cad.append("\n("+i+" = " + ani[i].toString());
		return cad.toString();
	}
	
	
}
