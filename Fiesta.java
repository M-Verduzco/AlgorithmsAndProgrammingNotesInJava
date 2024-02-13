package Librerias;

public class Fiesta {
	private String fecha;
	private String lugar;
	private String [] nombresInvitados;
	private final int MAX=10;
	private int numeroInvitados;
	
	public Fiesta() {
		numeroInvitados=0;
		nombresInvitados=new String[MAX];
	}
	
	public Fiesta( String fecha, String lugar) {
		this();
		this.fecha=fecha;
		this.lugar=lugar;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public String getEleNombresInvitados(int i) {
		String res;
		if(numeroInvitados>0)
			res=nombresInvitados[i];
		else
			res="No hay invitados";
		return res;
	}
	
	public boolean alta(String nombre) {
		boolean res=false;
		int num=-1;
		if(numeroInvitados<MAX) {
			num=ManejadorArreglos1.insertaDatoOrdS(nombresInvitados, numeroInvitados, nombre.toUpperCase());
			if(num>numeroInvitados) {
				numeroInvitados=num;
				res=true;
			}
		}
		return res;
	}
	
	public boolean eliminarInvitado(String nombre) {
		boolean res=false;
		int num;
		num=ManejadorArreglos1.eliminarDatoOrdS(nombresInvitados, numeroInvitados, nombre);
		if(num<numeroInvitados) {
			res=true;
			numeroInvitados=num;
		}
		return res;
	
	}
	
	
	public String primeroLista() {
		String res="";	
		if(numeroInvitados>=0)
			res=nombresInvitados[0];
		return res;
		
	}
	
	public String ultimoLista() {
		String res="";
		if(numeroInvitados>0)
			res=nombresInvitados[numeroInvitados-1];
		return res;
		
	}
	
	public String toString() {
		StringBuilder cad;
		cad= new StringBuilder();
		cad.append("\n La fecha de la fiesta es: " + fecha);
		cad.append("\n El lugar de la fiesta es: " + lugar);
		for (int i=0; i<numeroInvitados;i++) {
			cad.append("\n El nombre del invitado " + i + " es: " + nombresInvitados[i]);
			cad.append("\n");
		}
		return cad.toString();
		}
	
}