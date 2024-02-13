package Ejecutables;
import Librerias.ManejadorMatrices;
public class PruebaManejadorMatrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nra =3;
		int nrb =2;
		int nca =2;
		int ncb =3;
		int nrc;
		int ncc;
		int [][]a=new int [nra][nca];
		int [][]b=new int [nrb][ncb];
		int [][]c;
		int [][]d;
		System.out.println("Matriz A");
		ManejadorMatrices.leeMatriz(a, nra, nca);
		System.out.println("Matriz B");
		ManejadorMatrices.leeMatriz(b, nrb, ncb);
		System.out.println("Matriz A");
		ManejadorMatrices.imprimeMatriz(a, nra, nca);
		System.out.println("Matriz B");
		ManejadorMatrices.imprimeMatriz(b, nrb, ncb);
		System.out.println("Ahora vamos a sumar matrices");
		c=ManejadorMatrices.sumaMatrices(a, b, nra, ncb);
		System.out.println("Matriz C");
		ManejadorMatrices.imprimeMatriz(c, nrb, ncb);
		System.out.println("Ahora vamos a multiplicar matrices");
		d=ManejadorMatrices.multiplicacionMatrices(a, b);
		System.out.println("Matriz D");
		ManejadorMatrices.imprimeMatriz(d, d.length, d[0].length);
	}

}
