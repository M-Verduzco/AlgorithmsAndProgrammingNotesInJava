package Librerias;
/*
 * nomrbre: Mauricio Verduzco Ch.
 * versión: 1.0
 * fecha: 28-10-20
 */
public class ManejadorArreglosGenerico {
	
	//intercambia dos valores
	public static <T> void swap(int posX, int posY, T [] a){
		T aux;
		
		aux=a[posX];
		a[posX]=a[posY];
		a[posY]=aux;
	}
		
	// invierte el un arreglo
	public static <T> void invierte(T []a, int n){
		for(int i=0;i<n/2;i++)
			swap(i,n-1-i,a);
	}
	
	// regresa el indice del mínimo desde una posición dada
	public static <T extends Comparable<T>> int minimo1(T [] arreglo, int n, int inicio){
		int min=inicio;
		for(int i=inicio+1; i<n; i++)
			if(arreglo[min].compareTo(arreglo[i])>0)
				min=i;
		return min;
	}
	
	// regresa el índice el mínimo de todo el arreglo
	public static <T extends Comparable<T>> int posMinimo(T [] arreglo, int n){
		int min=0;
		
		for(int i=1; i<n; i++)
			if(arreglo[min].compareTo(arreglo[i])>0)
				min=i;
		return min;
	}

	//regresa el índice máximo de todo el arreglo
	public static <T extends Comparable<T>> int posMaximo(T [] arreglo, int n){
		int max=0;
		
		for(int i=1; i<n; i++)
			if(arreglo[max].compareTo(arreglo[i])<0)
				max=i;
		return max;
	}
	
	public static <T extends Comparable<T>> void seleccionDirecta(T [] a, int n){
		int min;
		
		for(int i=0; i<n-1; i++){
			min=minimo(a,n,i);
			swap(min,i,a);
		}
	}
	
	public static <T extends Comparable<T>> int busqSecuencialOrdenada(T [] a, int n, T x){
		int i=0;
		
		while (i<n && a[i].compareTo(x)<0)
			i++;
		if (i>=n || !a[i].equals(x))
			i=-i-1;
		return i;
	}
	
	public static <T> int busqSecuencialDesordenada(T [] a, int n, T x){
		int i=0;
		
		while (i<n && !a[i].equals(x))
			i++;
		if (i==n)
			i=-1;
		return i;
	}
			
	public static <T extends Comparable<T>> int busqBinaria(T [] a, int n, T x){
		int pos;
		int inicio = 0;
		int fin = n-1;
		int mitad = (inicio+fin)/2; 
		
		while ( inicio <= fin && !a[mitad].equals(x) ) {
			if ( x.compareTo(a[mitad])<0 )
				fin = mitad-1; 
			else 
				inicio = mitad+1;
			mitad = (inicio+fin)/2;
		}
		if ( inicio > fin )		// elemento no encontrado
			pos = -inicio-1;	
		else 					// vector[mitad].equals(buscado)
			pos = mitad;
		return pos;
	}
	
	public static <T> void corrimientosDer(T [] a, int n, int pos){
        for (int i = n; i>pos; i--)
            a[i] = a[i-1];
	}
	
	public static <T> void corrimientosIzq(T [] a, int n, int pos){
		for (int i=pos; i<n-1; i++)
				a[i]=a[i+1];
	}
	
	public static <T extends Comparable<T>> int inserta(T[] a, int n, T x) {
		int pos;	
		if(n<a.length) {
			pos=busqBinaria(a,n,x);
			if(pos<0) {
				pos=-pos-1;
				corrimientosDer(a, n, pos);
				a[pos]=x;
				n++;
			}
		}
		return n;
	}
	
	public static <T> int insertaDesordenado(T[]a, int n, T x){
		if(n<a.length) {
			a[n]=x;
			n++;
		}
		return n;
	}
	
	public static <T extends Comparable<T>> int elimina(T[] a, int n, T x) {
		int pos;
		pos=busqSecuencialDesordenada(a, n, x);
		if(pos>=0){
			corrimientosIzq(a, n, pos);
			n--;
			a[n]=null;
		}	
		return n;
	}
	
	public static <T extends Comparable<T>> int minimo(T [] arreglo, int n, int inicio){
		int min=inicio;
		
		for(int i=inicio+1; i<n; i++)
			if(arreglo[min].compareTo(arreglo[i])>0)
				min=i;
		return min;
	}
	
	
	
	
	
}

