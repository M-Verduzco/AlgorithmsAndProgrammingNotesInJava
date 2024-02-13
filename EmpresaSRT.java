package Librerias;

import java.util.ArrayList;

public class EmpresaSRT {
	private String nombre;
	private int costo;
	private Videos [] vid;
	private final int MAX =1000;
	private  int np;
	
	public EmpresaSRT(String nombre, int costo) {
		
		this.nombre = nombre;
		this.costo = costo;
		vid = new Videos [MAX];
		np=0;
	}
	
	public boolean altaVideo(String tipo, double duracion, String titulo, String genero, boolean premio, int vistas) {
		boolean res = false;
		if(np<MAX) {
			Videos v;
			v= new Videos (tipo, duracion, titulo, genero, premio, vistas);

			vid[np]=v;
			np++;
			res=true;
		}
		return res;
	}
	
	public String videoFav() {
		int max =0;
		String maxtit = " ";
		for(int i=1; i<np; i++) {
			if(max<vid[i].getVistas()) {
				max = vid[i].getVistas();
				maxtit = vid[i].getTitulo();
			}	
		}
		return maxtit;
	}
	
	public ArrayList<String> consulta (String tipo, String genero){
		ArrayList <String> res = new ArrayList <String>();
		for(int i=0; i<np; i++) {
			if(vid[i].getTipo().equals(tipo) && vid[i].getGenero().equals(genero)); 
			res.add(vid[i].getTitulo());
		}	
		return res;
	}
	
	
	

}
