package Ejecutables;
import Librerias.ClubAlumnos1;
public class EjecutableClub {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClubAlumnos1 a;
		boolean res;
		a= new ClubAlumnos1("Programadores Entusiastas");
		
		res = a.altaAlumno("Computacion", 7, 20, 'H');
		if (res)
			System.out.println("Alta exitosa");
		
		res = a.altaAlumno("Industrial", 2, 19, 'F');
		if (res)
			System.out.println("Alta exitosa");
		
		res = a.altaAlumno("Mecatronica", 4, 21, 'F');
		if (res)
			System.out.println("Alta exitosa");
		
		
		System.out.println("\n");
		
		System.out.println("La info del primer Industrial es: \n");
		System.out.println(a.primerIndustrial());
		
		System.out.println("\n");
		
		System.out.println("El precio a pagar de cuotas res: \n");
		System.out.println(a.cuotas());

	}
	
	

}
