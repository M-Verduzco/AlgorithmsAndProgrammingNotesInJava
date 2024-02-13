package Librerias;

import java.util.ArrayList;

/*
 * Mauricio Verduzco
 * Version 1.0
 * 301020
 */
public class TiendaAnimales {
	private String nombre;
    private String dir;
    private Animal []a;
    private int na;
    private final int MAX=1000;
    
    public TiendaAnimales() {
        a = new Animal[MAX];
        na=0;
    }

    public TiendaAnimales(String nombre, String dir) {
        this();
        this.nombre = nombre;
        this.dir = dir;
    }
    
    public boolean altaAnimal(String nombre, String raza, String color) {
        boolean res=false;
        int nres;
        Animal x = new Animal(nombre,raza,color);
        nres=ManejadorArreglosGenerico.inserta(a, na, x);
        if(nres>na) {
            na=nres;
            res=true;
        }
        return res;
    }
    
    public boolean eliminaAnimal(int id) {
        boolean res=false;
        int nres;
        Animal x = new Animal(id);
        nres=ManejadorArreglosGenerico.elimina(a, na, x);
        if(nres<na) {
            na=nres;
            res=true;
        }
        return res;
    }
    
    public int cuantosRaza(String raza) {
    	int res=0;
    	for(int i=0; i<na; i++)
    		if(a[i].getRaza().equals(raza))
    			res++;
    	return res;
    }
    
    public ArrayList<String> nombressRaza(String raza) {
    	ArrayList<String> l = new ArrayList<String>();
    	for(int i=0; i<na; i++)
    		if(a[i].getRaza().equals(raza))
    			l.add(a[i].getNombre());
    	return l;
    }
    
    public String toString() {
        StringBuilder cad = new StringBuilder();
        cad.append("\n el nombre de la tienda es: " + nombre);
        cad.append("\n el dirección de la tienda es: " + dir);
        cad.append("\n los animales que tiene la tienda son: " );
        for(int i=0;i<na;i++)
            cad.append("\n" + a[i].toString());
        return cad.toString();
    }
}
