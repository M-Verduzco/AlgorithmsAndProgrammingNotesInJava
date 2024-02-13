package Librerias;

public class Serpentario {
	private String nombre;
	private int tel;
	private final int MAXR=25;
	private final int MAXC=25;
	private Serpiente [][]ser;
	
	public Serpentario() {
		ser=new Serpiente[MAXR][MAXC];
	}
	
	public Serpentario(String nombre, int tel) {
		this();
		this.nombre = nombre;
		this.tel = tel;
	}
	
	public <T> int   buscarTipo(Serpiente[][]x, String tipo) {
		int res = -1;
		int i=0;
		while(i<MAXR && x[i][0]!=null && !(x[i][0]).getTipo().equals(tipo))
			i++;
		if(x[i][0]==null || x[i][0].getTipo().equals(tipo))
			res=i;
		return res;
	}
	
	public int tieneNull(Serpiente [][] y, int renglon) { //regresa una columna
		int res =-1;
		boolean f= true;
		int i=0;
		while(i<MAXC && f) {
			if(y[renglon][i] == null) {
				res = i;
				f = false;
			}
			i++;
		}
		return res;
	}
	
	
	
	public boolean altaSerpiente(String nombre, String alimentacion, String tipo) {
		boolean res=false;
		int columna;
		int renglon;
		renglon=buscarTipo(ser, tipo);
		if(renglon!= -1) {
			columna = tieneNull (ser, renglon);
			if(columna!=-1) {
				Serpiente s = new Serpiente(nombre, alimentacion, tipo);
				ser[renglon][columna]=s;
				res=true;
			}
		}
		return res;
	}
	
	public String consulta(int cla) {
		StringBuilder cad=new StringBuilder();
		for(int i=0; i<MAXR; i++)
			for(int j=0; j<MAXC; j++)
				if(ser[i][j]!= null && ser[i][j].getClave()==cla)
					cad.append(ser[i][j].toString());
		return cad.toString();
	}
	
	public int alimentacion(String ali) {
		int contador=0;
		for(int i=0; i<MAXR; i++)
			for(int j=0; j<MAXC; j++)
				if(ser[i][j]!= null && ser[i][j].getAlimentacion().equals(ali))
					contador++;
		return contador;
	}
	
	public String ejemplares() {
		int max=0;
		int ren;
		ren=tieneNull(ser,0);
		for(int i=0; i<ren; i++)
			if(tieneNullRegRes(ser, i)>max)
				max=i;
		return ser[0][max].getTipo();
		
			
	}
	
	public int tieneNullRegRes(Serpiente [][] y, int columna) { //regresa un renglon
		int res =-1;
		boolean f= true;
		int i=0;
		while(i<MAXR && f) {
			if(y[i][columna] == null) {
				res = i;
				f = false;
			}
			i++;
		}
		return res;
	}
	
	
	public void eliminaObjeto(Serpiente [][]x, int renglon, int columna) {
		int i = renglon;
		while (i<MAXC && x[i+1][columna]!=null) {
			x[i][columna]=x[i+1][columna];
			i++;
		}
	}
	
	public boolean bajaSerpiente(int cla) {
		boolean res=false;
		int j;
		int i =0;
		while(i<MAXR && !res) {
			j=0;
			while(j<MAXC && !res ) {
				if(ser[i][j]!= null && ser[i][j].getClave()==cla) {
					eliminaObjeto(ser, i , j);
					res=true;
				}
			j++;
			}
		i++;
		}
		return res;
	}
	
	public String toString() {
		StringBuilder cad = new StringBuilder();
		cad.append("El nombre del serpentario es "+nombre);
		cad.append("\nEl telefono del serpentario es  "+tel);
		for(int i = 0; i < MAXR; i++)
			for(int j = 0; j < MAXC; j++)
				if(ser[i][j] != null)
					cad.append("\n("+i+", "+j+") = " + ser[i][j].toString());
		return cad.toString();
	}
}
