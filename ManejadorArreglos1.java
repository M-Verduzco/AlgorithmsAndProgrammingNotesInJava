package Librerias;
import java.util.Scanner;
public class ManejadorArreglos1 {

		
		//*****LLENAR ARREGLO INT*****	
			public static void llenaArregloI(int []arreglo, int n) {
				Scanner lee= new Scanner (System.in);
				for(int i = 0; i<n;i++){
					System.out.println("Dame el dato que estará en la posición " + i);
					arreglo[i]=lee.nextInt();
				}
			}
			
		//*****LLENAR ARREGLO DOUBLE*****	
			public static void llenaArregloD(double []arreglo, int n) {
				Scanner lee= new Scanner (System.in);
				for(int i = 0; i<n;i++){
					System.out.println("Dame el dato que estará en la posición " + i);
					arreglo[i]=lee.nextInt();
				}
			}	

		//*****IMPRIMIR ARREGLO INT****
			public static void imprimeArregloI(int [] c, int n) {
				for(int i = 0; i<n; i++)
					System.out.println(i + ".- " + c[i]);	
			}		
			
		//*****IMPRIMIR ARREGLO DOUBLE****
			public static void imprimeArregloD(double [] c, int n) {
				for(int i = 0; i<n; i++)
					System.out.println(i + ".- " + c[i]);	
			}	
			
		//*****SUMAR ELEMENTOS DE UN ARREGLO INT*****
			public static int sumaElementosI(int[]c, int num) {
				int suma=0;
				for(int i=0;i<num;i++) 
					suma+=c[i];
				return suma;
				}	
				
		//*****SUMAR ELEMENTOS DE UN ARREGLO DOUBLE*****
			public static double sumaElementosD(double[]c, int num) {
				double suma=0;
				for(int i=0;i<num;i++) 
					suma+=c[i];
				return suma;
			}
			
		//*****PROMEDIO DE ELEMENTOS EN UN ARREGLO INT****
			public static double promElementosI(int[]c, int num) {
				return sumaElementosI(c,num)/num;	
			}
			
		//*****PROMEDIO DE ELEMENTOS EN UN ARREGLO DOUBLE****
			public static double promElementosD(double[]c, int num) {
				return sumaElementosD(c,num)/num;	
			}

		//*****REGRESA EL INDICE DEL OBJETO MAYOR DEL ARREGLO INT*****
			public static int indiceMayorI(int[]c, int num) {
				int maxInd=0;
				int maximo=c[0];
				for(int i=1;i<num;i++)
					if (maximo<c[i]) {
						maximo=c[i];
						maxInd=i;
					}
				return maxInd;
			}

		//*****REGRESA EL INDICE DEL OBJETO MAYOR DEL ARREGLO DOUBLE*****
			public static int indiceMayorD(double[]c, int num) {
				int maxInd=0;
				double maximo=c[0];
				for(int i=1;i<num;i++)
					if (maximo<c[i]) {
						maximo=c[i];
						maxInd=i;
					}
				return maxInd;
			}	

		//****REGRESA EL INDICE DEL OBJETO MENOR DEL ARREGLO INT****
			public static int indiceMenorI(int[]c, int num) {
				int minInd=0;
				int minimo=c[0];
				for(int i=1;i<=num;i++)
					if (minimo>c[i]) {
						minimo=c[i];
						minInd=i;
					}
				return minInd;
			}
			
		//****REGRESA EL INDICE DEL OBJETO MENOR DEL ARREGLO DOUBLE****
			public static int indiceMenorD(double[]c, int num) {
				int minInd=0;
				double  minimo=c[0];
				for(int i=1;i<num;i++)
					if (minimo>c[i]) {
						minimo=c[i];
						minInd=i;
					}
				return minInd;
			}	

		//****CUENTA LA CANTIDAD DE VALORES MAYORES A 'X' NUMERO INT*****
			public static int cantElementosMayoresI(int[]c, int num, int valor) {
				int contador=0;
				for(int i=0;i<=num;i++)
					if(c[i]>valor)
						contador ++;
				return contador;
			}
			
		//****CUENTA LA CANTIDAD DE VALORES MAYORES A 'X' NUMERO DOUBLE*****
			public static int cantElementosMayoresD(double[]c, int num, double valor) {
				int contador=0;
				for(int i=0;i<num;i++)
					if(c[i]>valor)
						contador ++;
				return contador;
			}	

		//****CUENTA LA CANTIDAD DE ELEMENTOS MENORES A 'X' NUMERO INT*****
			public static int cantElementosMenoresI(int[]c, int num, double valor) {	
				int contador=0;
				for(int i=0;i<num;i++)
					if(c[i]<valor)
						contador ++;
				return contador;
			}
			
		//****CUENTA LA CANTIDAD DE VALORES MENORES A 'X' NUMERO DOUBLE*****
			public static int cantElementosMenoresD(double[]c, int num, double valor) {
				int contador=0;
				for(int i=0;i<=num;i++)
					if(c[i]<valor)
						contador ++;
				return contador;
			}	

		//*****SUMA TODOS LOS ELEMENTOS PARES DE UN ARREGLO INT******
			public static int sumElementosParesI(int[]c, int num) {
				int suma=0;
				for(int i=0;i<=num;i++) 
					if(i%2==0)
					suma+=c[i];
				return suma;
			}
			
		//*****SUMA TODOS LOS ELEMENTOS PARES DE UN ARREGLO DOUBLE******
			public static double sumElementosParesD(double[]c, int num) {
				double suma=0;
				for(int i=0;i<=num;i++) 
					if(i%2==0)
						suma+=c[i];
				return suma;
			}	

		//****SUMA TODOS LOS ELEMENTOS IMPARES DE UN ARREGLO INT****
			public static int sumElementosImparesI(int[]c, int num) {
				int suma=0;
				for(int i=1;i<=num;i++) 
					if(i%2==0)
					suma+=c[i];
				return suma;
			}
			
		//****SUMA TODOS LOS ELEMENTOS IMPARES DE UN ARREGLO DOUBLE****
			public static double sumElementosImparesD(double[]c, int num) {
				double suma=0;
				for(int i=1;i<=num;i++) 
					if(i%2==0)
					suma+=c[i];
				return suma;
			}	

		//****SUMA TODOS LOS ELEMENTOS GUARDADOS EN LOS INDICES PARES DE UN ARREGLO INT****
			public static int sumIndicesParesI(int[]c, int num) {
				int suma=0;
				for(int i=0;i<=num;i++) 
					if(i%2==0)	
					suma+=i;
				return suma;
			}	
			
		//****SUMA TODOS LOS ELEMENTOS GUARDADOS EN LOS INDICES PARES DE UN ARREGLO DOUBLE****
			public static double sumIndicesParesD(double[]c, int num) {
				double suma=0;
				for(int i=0;i<=num;i++) 
					if(i%2==0)	
					suma+=i;
				return suma;
			}		
			
		//****SUMA TODOS LOS ELEMENTOS GUARDADOS EN LOS INDICES IMPARRES DE UN ARREGLO INT****
			public static int sumIndicesImparesI(int[]c, int num) {
				int suma=0;
				for(int i=0;i<=num;i++) 
					if(i%2!=0)	
					suma+=i;
				return suma;
			}
			
		//****SUMA TODOS LOS ELEMENTOS GUARDADOS EN LOS INDICES IMPARRES DE UN ARREGLO DOUBLE****
			public static double sumIndicesImparesD(double[]c, int num) {
				double suma=0;
				for(int i=0;i<=num;i++) 
					if(i%2!=0)	
					suma+=i;
				return suma;
			}	

		//****IMPRIME TODOS LOS ELEMENTOS PARES DE UN ARREGLO INT****
			public static String cadenaStringParesI(int []c, int n) {
				StringBuilder cad = new StringBuilder();
				for (int i=0; i<=n; i++) {
					if(c[i]%2==0)
					cad.append(" \n" + i + ".- " + c[i]);
				}
				return cad.toString();	
			}
			
		//****IMPRIME TODOS LOS ELEMENTOS PARES DE UN ARREGLO DOUBLE****
			public static String cadenaStringParesD(double []c, int n) {
				StringBuilder cad = new StringBuilder();
				for (int i=0; i<=n; i++) {
					if(c[i]%2==0)
					cad.append(" \n" + i + ".- " + c[i]);
				}
				return cad.toString();	
			}	
			
		//****IMPRIME TODOS LOS ELEMENTOS IMPARES DE UN ARREGLO INT****
			public static String cadenaStringImparesI(int []c, int n) {
				StringBuilder cad = new StringBuilder();
				for (int i=0; i<=n; i++) {
					if(c[i]%2!=0)
					cad.append(" \n" + i + ".- " + c[i]);
				}
				return cad.toString();	
			}

		//****IMPRIME TODOS LOS ELEMENTOS IMPARES DE UN ARREGLO DOUBLE****
			public static String cadenaStringImparesD(double []c, int n) {
				StringBuilder cad = new StringBuilder();
				for (int i=0; i<=n; i++) {
					if(c[i]%2!=0)
					cad.append(" \n" + i + ".- " + c[i]);
				}
				return cad.toString();	
			}	
			
		//****CORRIMIENTO A LA IZQUIERDA INT*****
			public static void corrimientosIzquierdaI(int [] a, int n, int k){
				for (int j=1; j<=k; j++){
					for (int i=0; i<n-1; i++)
						a[i]=a[i+1];
					a[n-1]=0;
				}
			}
			
		//****CORRIMIENTO A LA IZQUIERDA DOUBLE*****
			public static void corrimientosIzquierdaD(double [] a, int n, int k){
				for (int j=1; j<=k; j++){
					for (int i=0; i<n-1; i++)
						a[i]=a[i+1];
					a[n-1]=0;
				}
			}	
			
		//*****CORRIMIENTO A LA DERECHA INT*****
			public static void corrimientosDererchaI(int [] a, int n, int k){
				for (int j=1; j<=k; j++){
					for (int i = n-1; i>0; i--)
						a[i] = a[i-1];
						a[0]=0;
					}
			}
			
		//*****CORRIMIENTO A LA DERECHA DOUBLE*****
			public static void corrimientosDererchaD(double [] a, int n, int k){
				for (int j=1; j<=k; j++){
					for (int i = n-1; i>0; i--)
						a[i] = a[i-1];
						a[0]=0;
					}
			}	
			
		//******MUEVE UN ARREGLO LLENO A LA IZQUIERDA INT****	
			public static void moverIzquierdaI(int [] c, int n, int k) {
				for (int j = 1; j<=k; j++) {	
					int aux = c[0];
					for (int i = 0; i<(n-1); i++) {
						c[i]=c[i+1];
					}
					c[n-1]=aux;
				}
			}
			
		//******MUEVE UN ARREGLO LLENO A LA IZQUIERDA DOUBLE****	
			public static void moverIzquierdaD(double [] c, int n, int k) {
				for (int j = 1; j<=k; j++) {	
					double aux = c[0];
					for (int i = 0; i<(n-1); i++) {
						c[i]=c[i+1];
					}
					c[n-1]=aux;
				}
			}	

		//******MUEVE UN ARREGLO LLENO A LA DERECHA INT ******
			public static void moverDerechaI(int [] c, int n, int k) {
				for (int j = 1; j<=k; j++) {
					int aux =c[(n-1)];
					for (int i = (n-1); i>0; i--) {
						c[i]=c[(i-1)];
					}
				c[0]=aux;
				}
			}
			
		//******MUEVE UN ARREGLO LLENO A LA DERECHA DOUBLE ******
			public static void moverDerechaD(double [] c, int n, int k) {
				for (int j = 1; j<=k; j++) {
					double aux =c[(n-1)];
					for (int i = (n-1); i>0; i--) {
						c[i]=c[(i-1)];
					}
				c[0]=aux;
				}
			}	
			
		//*****BUSQUEDA BINARIA INT*****
			public static int buscaBinariaI(int [] a, int n, int x){
				 int pos;
				 int inicio = 0;
				 int fin = n-1;
				 int mitad = (inicio+fin)/2;
				 while ( inicio <= fin && a[mitad]!=x ) {
					 if ( x < a[mitad] )
						 fin = mitad-1;
					 else
						 inicio = mitad+1;
					 mitad = (inicio+fin)/2;
				 }
				 if ( inicio > fin )
					 pos = -inicio-1;
				 else
					 pos = mitad;
				 return pos;
			}
			
		//*****BUSQUEDA BINARIA DOUBLE*****
			public static int buscaBinariaD(double [] a, int n, int x){
				 int pos;
				 int inicio = 0;
				 int fin = n-1;
				 int mitad = (inicio+fin)/2;
				 while ( inicio <= fin && a[mitad]!=x ) {
					 if ( x < a[mitad] )
						 fin = mitad-1;
					 else
						 inicio = mitad+1;
					 mitad = (inicio+fin)/2;
					}
				 if ( inicio > fin )
					 pos = -inicio-1;
				 else
					 pos = mitad;
					return pos;
			}	
			
		//*****INVIERTE EL ARREGLO INT CON AYUDA DE OTRO ******
			public static void invertirArreOtroI(int[]c, int []b, int n) {
				for (int i= n; i>=0; i--)
					b[((n-1)-i)]=c[i];
			}
			
		//*****INVIERTE EL ARREGLO DOUBLE CON AYUDA DE OTRO ******
			public static void invertirArreOtroD(double[]c, double []b, int n) {
				for (int i= n; i>=0; i--)
					b[((n-1)-i)]=c[i];
			}	
			
		//****INVIERTE EL ARREGLO INT SOBRE SI MISMO****
			public static void invertirArreMismoI(int []a, int numA){
				for (int i = 0; i<numA/2; i++)
					intercambioI(i, numA - 1 - i, a);
			}
			
		//****INVIERTE EL ARREGLO DOUBLE SOBRE SI MISMO****
			public static void invertirArreMismoD(double []a, int numA){
				for (int i = 0; i<numA/2; i++)
					intercambioD(i, numA - 1 - i, a);
			}	
			
		//*****INTERCAMBIA EL VALOR  'A' Y EL 'B' INT****
			public static void intercambioI (int posX, int posY, int []a) {
				int aux;
				aux =a[posX];
				a[posX]=a[posY];
				a[posY]=aux;
			}
			
		//*****INTERCAMBIA EL VALOR  'A' Y EL 'B' DOUBLE****
			public static void intercambioD (int posX, int posY, double []a) {
				double aux;
				aux =a[posX];
				a[posX]=a[posY];
				a[posY]=aux;
			}	
			
		//*****INTERCAMBIA EL VALOR  'A' Y EL 'B' DOUBLE****
			public static void intercambioS (int posX, int posY, String []a) {
				String aux;
				aux =a[posX];
				a[posX]=a[posY];
				a[posY]=aux;
			}		

		//*****INDICE MINIMO POSICION INT****
			public static int indiceMinPosI(int []a, int numA, int pos) {
				int min=pos;
				for(int i=pos+1;i<numA;i++)
					if(a[min]>a[i])
						min=i;
				return min;
			}
			
		//*****INDICE MINIMO POSICION DOUBLE****
			public static int indiceMinPosD(double []a, int numA, int pos) {
				int min=pos;
				for(int i=pos+1;i<numA;i++)
					if(a[min]>a[i])
						min=i;
				return min;
			}
			
		//*****INDICE MINIMO POSICION STRING****
			public static int indiceMinPosS(String []a, int numA, int pos) {
				int min=pos, evaluation;
				for(int i=pos+1;i<(numA-1);i++) {
					evaluation=(a[min].compareTo(a[i]));
					if(evaluation>0) {
						min=i;
					}
				}
				return min;
			}	

		//******ORDENAR INT******
			public static void ordenarArreI(int []a, int numA) {
				int min;
				for(int i=0;i<numA-1;i++) {
					min=indiceMinPosI(a,numA,i);
				    intercambioI(min, i, a);
				}
			}
			
		//******ORDENAR DOUBLE******
			public static void ordenarArreD(double []a, int numA) {
				int min;
				for(int i=0;i<numA-1;i++) {
					min=indiceMinPosD(a,numA,i);
					   intercambioD(min, i, a);
				}
			}
			
		//******ORDENAR STRING******
			public static void ordenarArreS(String []a, int numA) {
				int min;
				for(int i=0;i<numA-1;i++) {
					min=indiceMinPosS(a,numA,i);
					   intercambioS(min, i, a);
				}
			}	
			
		//*****PARTE NUMERO INT******
			public static int parteNumeroI(int []a, int x, double [] b) {
				int pos;
				int res;
				int j=0; 
				pos = buscaSecuencialDesI(a, a.length, x);
				pos+=1;
				for (int i =pos; i<=a.length;i++) {
					if (a[pos]%2==0)
						res=a[i-1]/4;
					else
						res=a[i-1]/3;
					b[j]=res;
					j++;	
				}
				return j-1;
			}
			
		//*****PARTE NUMERO DOUBLE******
			public static int parteNumeroD(double []a, int x, double [] b) {
				int pos;
				double res;
				int j=0; 
				pos = buscaSecuencialDesD(a, a.length, x);
				pos+=1;
				for (int i =pos; i<=a.length;i++) {
					if (a[pos]%2==0)
						res=a[i-1]/4;
					else
						res=a[i-1]/3;
					b[j]=res;
					j++;	
				}
				return j-1;
			}	

		//*****ENCUENTRA EL MENOR MULTIPLO DE 'X' EN UN ARREGLO INT E IMPRIME TODOS SUS MULTIPLOS EN UN SEGUNDO ARREGLO INT*****
			public static int ecuentraMenorMultipleI(int [] a, int x, int []c) {
				int min=(int) Math.pow(x, x);
					for(int i=0, k=0; i<a.length; i++) {
						if(a[i]%x==0) {
							if(min>a[i]&&a[i]!=0) {
								min=a[i];
							}
							c[k]=a[i];
							k++;
						}
					}
					return min;
			}
			
		//*****ENCUENTRA EL MENOR MULTIPLO DE 'X' EN UN ARREGLO DOUBLE E IMPRIME TODOS SUS MULTIPLOS EN UN SEGUNDO ARREGLO DOUBLE*****
			public static double ecuentraMenorMultipleD(double [] a, int x, double []c) {
				double min=(int) Math.pow(x, x);
					for(int i=0, k=0; i<a.length; i++) {
						if(a[i]%x==0) {
							if(min>a[i]&&a[i]!=0) {
								min=a[i];
							}
							c[k]=a[i];
							k++;
						}
					}
					return min;
			}	
			
		//*****BUSCA UN DATO INT EN UN ARREGLO DESORDENADO******
			public static int buscaSecuencialDesI(int []a, int numA, int valor) {
				int i = 0;
				while (i<numA && a[i]!=valor)
					i++;
				if(i==numA || a[i]!=valor)
					i= -i-1;
				return i;
			}
			
		//*****BUSCA UN DATO DOUBLE EN UN ARREGLO DESORDENADO******
			public static int buscaSecuencialDesD(double []a, int numA, double valor) {
				int i = 0;
				while (i<numA && a[i]!=valor)
					i++;
				if(i==numA || a[i]!=valor)
					i= -i-1;
				return i;
			}	

		//*****BUSCA UN DATO INT EN UN ARREGLO ORDENADO****
			public static int buscaSecuencialOrdI(int []a, int numA, int valor) {
				int i = 0;
				while (i<numA && a[i]<valor)
					i++;
				if(i>numA || a[i]>valor)
					i= -i-1;
				return i;
			}
			
		//*****BUSCA UN DATO DOUBLE EN UN ARREGLO ORDENADO****
			public static int buscaSecuencialOrdD(double []a, int numA, double valor) {
				int i = 0;
				while (i<numA && a[i]<valor)
					i++;
				if(i>numA || a[i]>valor)
					i= -i-1;
				return i;
			}	
			
		//*****BUSCA UN DATO STRING EN UN ARREGLO ORDENADO****
			public static int buscaSecuencialOrdS(String []a, int na, String valor) {
			int i = 0;
					while (i<na&&a[i].compareTo(valor)!=0)
						i++;
					if(i>=na || (a[i].compareTo(valor)!=0))
						i= -i-1;
					return i;
			}			
			
			
			
		//*****BUSCA UN DATO STRING EN UN ARREGLO DESORDENADO****
			public static int buscaSecuencialDesS(String []a, int na, String valor) {
			int i = 0;
					while (i<na&&a[i].compareTo(valor)!=0)
						i++;
					if(i>=na || (a[i].compareTo(valor)!=0))
						i= -i-1;
					return i;
			}	


			
			
			
			
			
			
			
		//--------------------------------------------------------------------------//

			
			
			
			
			

		//-------------------------------------------------------------------------//	
			
			
			
			
			
			
			
			
			
			
			
		///////////////////////////////////////////////////////////////////
		/////////////////////F R A N Z O N I///////////////////////////////
		///////////////////////////////////////////////////////////////////

		//****CORRIMIENTOS INSERTAR DATO INT*******//
			public static void corrimientosInsertarDatosI(int []a, int pos, int n) {
				for (int i=n;i>pos;i--)
					a[i]=a[i-1];
			}	
			
			
		//*****CORRIMIENTOS INSERTAR DATO DOUBLE*****//
			public static void corrimientosInsertarDatosD(double []a, int pos, int n) {
				for (int i=n;i>pos;i--)
					a[i]=a[i-1];
			}

		//*****CORRIMIENTOS INSERTAR DATO STRING*****//
			public static void corrimientosInsertarDatosS (String []a, int pos, int n) {
				for (int i=n;i>pos;i--)
					a[i]=a[i-1];
			}


		//*****INSERTAR DATO INT EN ARREGLO ORDENADO****//
			public static int insertaDatoOrdI(int []a, int na, int dato) {
				int pos;
				if(na<a.length) {
					pos=buscaSecuencialOrdI(a, na, dato);
					if(pos<0) {
						pos=-(pos+1);
						corrimientosInsertarDatosI(a, pos, na);
						a[pos]=dato;
						na++;
					}
				}	
				return na;
			}
			
		//****INSERTAR DATO DOUBLE EN UN ARREGLO ORDENADO*****//
			public static int insertaDatoOrdD(double []a, int na, double dato) {
				int pos;
				if(na<a.length) {
					pos=buscaSecuencialOrdD(a, na, dato);
					if(pos<0) {
						pos=-(pos+1);
						corrimientosInsertarDatosD(a, pos, na);
						a[pos]=dato;
						na++;
					}
				}	
				return na;
			}
			
		//****CORRIMIENTOS ELIMINAR DATO INT*******//
			public static void corrimientosEliminarDatosI(int []a, int pos, int n) {
				for (int i=pos;i<n-1;i++)
					a[i]=a[i+1];
			}		
				
		//*****CORRIMIENTOS ELIMINAR DATO DOUBLE*****//
			public static void corrimientosEliminarDatosD(double []a, int pos, int n) {
				for (int i=pos;i<n-1;i++)
					a[i]=a[i+1];
			}

		//*****CORRIMIENTOS ELIMINAR DATO STRING*****//
			public static void corrimientosEliminarDatosS(String []a, int pos, int n) {
				if(n==a.length) {
					for (int i=pos;i<n-1;i++)
						a[i]=a[i+1];
						a[n-1]=null;
				}
			}	

			
			
		//****ELIMINAR DATO INT EN ARREGLO ORDENADO****
			public static int eliminarDatoOrdI(int []a, int na, int dato) {
				int pos;
				pos= buscaSecuencialOrdI(a, na, dato);
				if(pos>=0) {
					corrimientosEliminarDatosI(a, pos, na);
					na--;
				}
				return na;
			}
			
		//*****ELIMINAR DATO DOUBLE EN ARREGLO ORDENADO*****
			public static int eliminarDatoOrdD(double []a, int na, double dato) {
				int pos;
				pos= buscaSecuencialOrdD(a, na, dato);
				if(pos>=0) {
					corrimientosEliminarDatosD(a, pos, na);
					na--;
				}
				return na;
			}

		//******INSERTA UN DATO INT EN UN ARREGLO DESORDENADO****
			public static int insertarDatoDesI(int [] a, int na, int dato) {
				int pos;
				if(na<a.length) {
					pos=buscaSecuencialDesI(a, na, dato);
					if(pos<0) {
						pos=-(pos+1);
						corrimientosInsertarDatosI(a, pos, na);
						a[pos]=dato;
						na++;
					}
				}	
				return na;
			}
				
		//******INSERTA UN DATO DOUBLE EN UN ARREGLO DESORDENADO****
			public static int insertarDatoDesD(double [] a, int na, double dato) {
				int pos;
				if(na<a.length) {
					pos=buscaSecuencialDesD(a, na, dato);
					if(pos<0) {
						pos=-(pos+1);
						corrimientosInsertarDatosD(a, pos, na);
						a[pos]=dato;
						na++;
					}
				}	
				return na;
			}		

		//******ELIMINA UN DATO INT EN UN ARREGLO DESORDENADO****
			public static int eliminarDatoDesI(int [] a, int na, int dato) {
				int pos;
				pos= buscaSecuencialDesI(a, na, dato);
				if(pos>=0) {
					corrimientosEliminarDatosI(a, pos, na);
					na--;
				}
				return na;
			}
				
		//******ELIMINA UN DATO DOUBLE EN UN ARREGLO DESORDENADO****
			public static int eliminarDatoDesD(double [] a, int na, double dato) {
				int pos;
				pos= buscaSecuencialDesD(a, na, dato);
				if(pos>=0) {
					corrimientosEliminarDatosD(a, pos, na);
					na--;
				}
				return na;
			}


			
			
			
			
			
			
			
			
		//****INSERTA UN DATO STRING EN UN ARREGLO ORDENADO****
			public static int insertaDatoOrdS(String []a, int na, String dato) {
				int pos;
				if(na<a.length) {
					pos=buscaSecuencialOrdS(a, na, dato);
					if(pos<0) {
						pos=-(pos+1);
						corrimientosInsertarDatosS(a, pos, na);
						a[pos]=dato;
						na++;
				}
			}	
			ordenarArreS(a, na);
			return na;
			}

		//***INSERTA UN DATO STRING EN UN ARREGLO DESORDENADO*****

			public static int insertaDatoDesS(String []a, int na, String dato) {
				int pos;
				if(na<a.length) {
					pos=buscaSecuencialDesS(a, na, dato);
					if(pos<0) {
						pos=-(pos+1);
						corrimientosInsertarDatosS(a, pos, na);
						a[pos]=dato;
						na++;
				}
			}	
			return na;
			}
			
		//****ELIMINA UN DATO STRING EN UN ARREGLO ORDENADO****
			public static int eliminarDatoOrdS(String []a, int na, String dato) {
				int pos;
				pos= buscaSecuencialOrdS(a, na, dato);
				if(pos>=0) {
					corrimientosEliminarDatosS(a, pos, na);
					na--;
				}
				return na;
			}
			
			
			
		//****ELIMINA UN DATO STRING DE UN ARREGLO DESORDENADO*****
			public static int eliminarDatoDesS(String []a, int na, String dato) {
				int pos;
				pos= buscaSecuencialDesS(a, na, dato);
				if(pos>=0) {
					corrimientosEliminarDatosS(a, pos, na);
					na--;
				}
				return na;
			}
			
			//*****IMPRIMIR ARREGLO STRING****
				public static void imprimeArregloS(String [] c, int n) {
					for(int i = 0; i<n; i++)
						System.out.println(i + ".- " + c[i]);	
				}	
			
		}
