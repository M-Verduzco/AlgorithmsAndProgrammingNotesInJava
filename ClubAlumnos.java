package Librerias;
import Librerias.Alumno;
public class ClubAlumnos {
	private String nombre ;
	private final int MAX=200;
	private Alumno []a;
	private  int numA;
	public ClubAlumnos(String nombre) {
		super();
		this.nombre = nombre;
		a = new Alumno [MAX];
		numA=0;
	}
	
	public boolean altaAlumno(String carrera, int semestre, int edad, char genero) {
		boolean res = false;
		Alumno al;
		if (numA<MAX) {
			al = new Alumno(carrera,semestre,edad,genero);
			a[numA]=al;
			numA++;
			res=true;
		}
		return res;	
	}
	
	public String primerIndustrial() {
		String res;
		int i =0;
		while (i<numA){
			i++;
			if(a[i].getCarrera().equals("Industrial"))
				break;
		}
		if(i<numA &&a[i].getCarrera().equals("Industrial"))
			res= a[i].toString();
		else
			res = ("No hay");
		return res;
	}
	
	public double cuotas() {
		double res   =0;
		double montoi = 0;
		for(int i =0; i<numA; i++) {
			if(a[i].getCarrera().contentEquals("Computacion"))
				if(a[i].getSemestre()>6)
					montoi=10;
				else
					montoi=20;
			else
				montoi=30;
			if(a[i].getGenero()=='F')
				montoi*=0.9;
			res+=montoi;
			montoi=0;
		}
		return res;
	}
	
	
		
	
	
	
	
}
