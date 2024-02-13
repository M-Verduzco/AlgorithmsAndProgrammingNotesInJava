package Ejecutables;
import Librerias.Fiesta;
import Librerias.ManejadorArreglos1;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class FiestaCumpleanios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean res;
		Fiesta f;
		Scanner archivo;
		int n;
		f = new Fiesta("30 de junio 2020", "Terraza El Madrigal");
		
		try {
			archivo = new Scanner(new File("fiesta.txt"));
			n=archivo.nextInt();
			for(int i=0;i<n;i++) {
				res=f.alta (archivo.next());
				if(res)
					System.out.println("Se agregó al invitado");
				else
					System.out.println("No se pudo agregar al invitado");	
			}
		}
		catch(FileNotFoundException fnfe) {
			System.out.println(fnfe);
			System.exit(-1);
		}
		System.out.println(f.toString());
		System.out.println("El primer invitado de tu lista es: " + f.primeroLista());
		System.out.println("El ultimo invitado de tu lista es: " + f.ultimoLista());
		System.out.println("Eliminar a Maria de la lista: " +f.eliminarInvitado("MARIA"));
		System.out.println("La información de la fiesta es: " + "\n" + f.toString());
		}
}