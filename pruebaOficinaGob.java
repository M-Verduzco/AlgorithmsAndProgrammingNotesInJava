package Ejecutables;
import Librerias.OficinaGob;
import java.util.Scanner;
public class pruebaOficinaGob {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				OficinaGob ofi;
				ofi= new OficinaGob(4, "Camilo");
				Scanner lee;
				lee= new Scanner (System.in);
				for (int i=0; i<4; i++) {
					System.out.println("dame el nombre del estado ");
					ofi.setEleNomEdo(i, lee.next());
					System.out.println("dame la población: ");
					ofi.setElePob(i, lee.nextInt());
				}
				System.out.println("\n");
				System.out.println("El estado con mayor población: " + ofi.mayPobEdo());
				System.out.println("El promedio de habitantes: " + ofi.promPobEdo());
				System.out.println("el total de estados con población menor al promedio: " + ofi.totMenPromEdo());
				System.out.println("\n");
				System.out.println("la información de la oficina del gobierno es: " + ofi.toString());
			}
}
		
	


