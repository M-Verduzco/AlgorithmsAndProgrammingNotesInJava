package Librerias;

public class Tablero {
	private String paciente;
	private int edad;
	private Medicamento [][] med;
	private final int MAXR = 3;
	private final int MAXC = 4;
	
	public Tablero() {
		med = new Medicamento[MAXR][MAXC];
	}

	public Tablero(String paciente, int edad) {
		this();
		this.paciente = paciente;
		this.edad = edad;
	}
	
	public boolean altaMedicamento(String nombre, int dosis, int horario, int tratamiento) {
		boolean res=false;
		if(horario-1<MAXR && tratamiento-1<MAXC && med[horario-1][tratamiento-1] == null) {
			med[horario-1][tratamiento-1] = new Medicamento (nombre, dosis);
			res=true;
		}
		return res;
	}
	
	public int cuentaPorDosis(int dos) {
		int res = 0, j;
		for(int i=0; i<MAXC; i++) {
			j=0;
			while(j<MAXR && med[j][i]!=null && med[j][i].getDosis()>=dos) {
				j++;
			}
			if(j==MAXR)
				res++;
		}
		return res;
	}
	
	public String toString() {
		StringBuilder cad = new StringBuilder();
		cad.append("El nombre del paciente es "+paciente);
		cad.append("\nLa edad del paciente es "+edad);
		for(int i = 0; i < MAXR; i++)
			for(int j = 0; j < MAXC; j++)
				if(med[i][j] != null)
					cad.append("\n("+i+", "+j+") = " + med[i][j].toString());
		return cad.toString();
	}
	
	
	
	

}
