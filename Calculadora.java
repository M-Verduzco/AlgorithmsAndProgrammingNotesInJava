package Librerias;

public class Calculadora {
	
	
	public static String calculaUllman(int num) {
		String res = " " + num;
		while(num>1) {
			if(num%2==0)
				num=num/2;
			else
				num=num*3+1;
			res = res +" "+num;
		}		
		return res;
	}
	
	public static int multiplicar(int a, int b) {
		int res = 0, i;
		for(i=1; i<=b; i++) {
			res+=a;
		}
		return res;
	}
	
	public static int potencia(int a, int b) {
		int res = a, i;
		for (i=1; i<=b; i++) {
			res*=a;
		}
		return res;
	}
	
	public static int generaCubosNicomano(int n) {
		int impar = -1;
		int res = 0;
		for (int i = 1; i <= n; i++) {
		impar = impar + 2;
		res = impar;
		for (int j = 2; j <= i; j++) {
		impar = impar + 2;
		}
		res = (res + impar)/2;
		}
		return res;
	}
	
	public static int calculaFactorial(int n) {
		int res = 1;
		int i =1;
		for (i=1; i<=n; i++) {
			res*=i;
		}
		return res;
	}
	
	public static int calculaMaximoComunDivisor(int m , int n) {
		while (m!=n) {
			if(m>n)
				m-=n;
			else
				n-=m;
		}
		return m;
	}
	
	public static String generaSerieFibionacci(int num) {
		String res  = " " + 0 + ", " + 1 ;
		int sum1 = 0;
		int sum2 = 1, i;
		for(i=1;((num-2)/num)>=i;i++) {
			sum1=sum1+sum2;
			sum2=sum2+sum1;
		res = res +", "+sum1 + ", " + sum2;
		}
		return res;
	}
	
	public static String generaSerieFibionacci_2(int n) {
		int v1, v2, v3;
		StringBuilder cad = new StringBuilder();
		v1=0;
		v2=1;
		cad.append(v1 + " " + v2);
		for(int i=3; i<=n; i++) {
			v3=v1+v2; 
			cad.append(" " + v3);
				v1=v2;
				v2=v3;
			}
			return cad.toString();
		}
	
	public static int calculaSerie1(int n) {
		int res=-1;
		if(n >=0) {
			res = 0;
			for(i=1; i<=n;i++ ){			
				res+=Math.pow(i,i);
			}
		}
		return res;
	}
	
	public static int calculaSerie2(int n, int num) {
		int res;
		StringBuilder sb = new StringBuilder();
		int sum=-1;
		int i, j;
		if (n>=0) {
			sum=0;
			for (int j=1, i=3; j<=n; j++) {
				sum+=(num)/(i);
				sb.append(" " + num +"/" + i + " ")
				i=i+2;	
				if(i>7)
					i=3;
			}
			res=Math.round(sum);
		}
		System.out.println(sb.toString(););
		return res;
	}
	
	public static int calculaSerie2_2(int n, int num){
		int denominador=3;
		int suma=0;
		for(int i = 1; i<=n; i++) {
			if(denominador>7)
				denominador=3;
			suma+=num/denominador;
			denominador+=2;
		}
		return suma;
	}

	public static int calculaSerie3(int n) {
		int res = 0; 
		for(int i=0;i<=n;i++) {
			res+=(Calculadora.calculaFactorial(n-i)/Calculadora.calculaFactorial(i));
		}	
		return res;
	}
	
	public static int calculaSerie3_2(int n) {
		int suma=0;
		for (int i=n; i<=0; i--)
			suma+=Calculadora.calculaFactorial(i)/Calculadora.calculaFactorial(n-i);
		return suma;
	}
}