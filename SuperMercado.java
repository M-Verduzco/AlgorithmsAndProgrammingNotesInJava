package Librerias;

public class SuperMercado {
	private String nombre;
	private Producto [][] pro;
	private final int MAXR=4;
	private final int MAXC=30;
	
	public SuperMercado() {
		pro = new Producto[MAXR][MAXC];
	}

	public SuperMercado(String nombre) {
		this();
		this.nombre = nombre;
	}
	
	public int tieneNull(Producto [][] p, int renglon) { //regresa la columna
		int res =-1;
		boolean f= true;
		int i=0;
		while(i<MAXC && f) {
			if(pro[renglon][i]== null) {
				res = i;
				f = false;
			}
			i++;
		}
		return res;
	}
	
	public boolean altaProducto(String nombre, double precio, int caja) {
		boolean res = false;
		if(caja-1<MAXR && tieneNull(pro, caja-1)!=-1) {
			pro[caja-1][tieneNull(pro, caja-1)] = new Producto (nombre, precio);
			res=true;
		}
		return res;
	}
	
	public boolean productoEnTodasCajas(String otro) {
		boolean res = false;
		boolean f1,f2;
		int i,j;
		i=0;
		f1=true;
		f2=true;
		while(i<MAXR && f1) {
			f2=true;
			j=0;
			while(j<MAXC && f2 && pro[i][j]!=null) {
				if(pro[i][j].getNombre().equals(otro))
					f2=false;
				j++;	
			}
			if(pro[i][j-1]==null || j==MAXC && f2)
				f1=false;
			i++;
		}
		if(f1 && !f2)
			res=true;
		return res;
	}
	
	public String productoMasBarato() {
		String res;
		double minPrecio = 10000;
		String nombreMin ="";
		int cajamin =-1;
		for(int i=0; i<MAXR; i++)
			for(int j=0; j<MAXC; j++)
				if(pro[i][j]!=null &&  pro[i][j].getPrecio()<minPrecio) {
					minPrecio=pro[i][j].getPrecio();
					nombreMin=pro[i][j].getNombre();
					cajamin=i+1;
				}
		
		res = ("El producto más barato es: " + nombreMin + ", su precio es: $" + minPrecio + " y la caja en la que se compró es la número: " + cajamin);
		return res;
	}
	
	public String toString() {
		StringBuilder cad = new StringBuilder();
		cad.append("El nombre del super mercado es "+nombre);
		for(int i = 0; i < MAXR; i++)
			for(int j = 0; j < MAXC; j++)
				if(pro[i][j] != null)
					cad.append("\n("+i+", "+j+") = " + pro[i][j].toString());
		return cad.toString();
	}
	
	
	
	
	
	
	
	

}
