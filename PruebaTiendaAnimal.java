package Ejecutables;
/*
 * Mauricio Verduzco
 * Version 1.0
 * 301020
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import Librerias.TiendaAnimales;

public class PruebaTiendaAnimal {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner archivo;
        TiendaAnimales t;
        ArrayList <String> lres = new ArrayList <String> ();
        int n;
        int resul;
        String nombre;
        String raza; 
        String color;
        boolean res;
        t=new TiendaAnimales("x","y");
        try {
            archivo = new Scanner(new File ("datosAnimales.txt"));
        n=archivo.nextInt();
            for(int i=0;i<n;i++) {
            nombre=archivo.next().toUpperCase();
            raza=archivo.next();
            color=archivo.next();
            t.altaAnimal(nombre, raza, color);
            }
    }catch(FileNotFoundException fnfe) {
        System.out.println(fnfe);
            System.exit(-1);
        }
    System.out.println(t.toString());
    
    res=t.eliminaAnimal(103);
    if(res)
    	System.out.println("Se eliminó correctamente");
    else
    	System.out.println("No se pudo eliminar");
    
    System.out.println(t.toString());
    
    resul = t.cuantosRaza("Maltes");
    System.out.println("De la raza Maltes hay: " + resul);
    lres= t.nombressRaza("Maltes");
    System.out.println(lres.toString());
}
}