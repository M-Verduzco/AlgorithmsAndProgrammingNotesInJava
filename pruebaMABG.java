package Ejecutables;
import Librerias.MABG;
public class pruebaMABG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [][] a = 	{{"rojo","gris", null},
							{null, "violeta", "amarillo"},
				{			null, null, "anaranjado"}};
	boolean res =  MABG.esTriangularInf(a, a.length, a[0].length);
	if(res)
		System.out.println("La matriz es triangular inferior");
	else
		System.out.println("La matriz NO es triangular inferior");
	}

}
