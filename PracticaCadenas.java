package Librerias;

public class PracticaCadenas {
	
	public static String eliminaEspacios (String cad) {
		return cad=cad.replace(" ", "");
	}
	
	public static String vocalesYConsonantes (String x) {
		int v=0;
		int c=0;
		for (int i=0; i<x.length();i++) {
			if (x.charAt(i)=='a'||x.charAt(i)=='e'||x.charAt(i)=='i'||x.charAt(i)=='o'||x.charAt(i)=='u')
				v++;
			if(x.charAt(i)=='b'||x.charAt(i)=='c'||x.charAt(i)=='d'||x.charAt(i)=='f'||x.charAt(i)=='g'||x.charAt(i)=='h'||x.charAt(i)=='j'||x.charAt(i)=='k'||x.charAt(i)=='l'||x.charAt(i)=='m'||x.charAt(i)=='n'||x.charAt(i)=='p'||x.charAt(i)=='q'||x.charAt(i)=='r'||x.charAt(i)=='s'||x.charAt(i)=='t'||x.charAt(i)=='v'||x.charAt(i)=='w'||x.charAt(i)=='x'||x.charAt(i)=='y'||x.charAt(i)=='z')
				c++;
		}
		String res=("vocales: "+ v +" consonantes: " + c);
		return res;
	}
	
	public static String corrijeTexto (String cad) {
				cad=cad.replace("1", "a");
				cad=cad.replace("2", "e");
				cad=cad.replace("3", "i");
				cad=cad.replace("4", "o");
				cad=cad.replace("5", "u");
		return cad;
	}
	
	public static int cuentaPalabra (String texto, String cad) {
		int res=0;
		while(texto.contains(cad)) {
			res++;
			texto=texto.replaceFirst(cad,"");
		}
		return res;
		}
	

} 
