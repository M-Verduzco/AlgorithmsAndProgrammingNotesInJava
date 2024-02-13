package Ejecutables;

public class Ejemplos {
	
	
	public int ejemploFuncion(int dato) {
		return dato * dato;
	}
	
	public void ejemploMetodo(int dato) {
		dato = dato/100;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ejemplos E = new Ejemplos();
		int x;
		x = 3;
		int y = 2;
		int z = x-y;
		int res;
		res = E.ejemploFuncion(x);
		
		E.ejemploMetodo(y);
		
		System.out.println("El resultado es: " + res + ", y el otro es: " + z);
		
		

	}

}
