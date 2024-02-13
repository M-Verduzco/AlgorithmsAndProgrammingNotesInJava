package Librerias;

import java.util.ArrayList;

/*
 * nombre : Mauricio
 * version: 1.0
 * fecha: 26/10/2020
 */

public class Compañia1 {
	private String nombre;
	private String tel;
	private double [][]ventas;
	private final int MAXR = 12;
	private final int MAXC = 4;
	
	public Compañia1() {
		ventas = new double [MAXR][MAXC];
	}
	
	public Compañia1(String nombre, String tel) {
		this();
		this.nombre=nombre;
		this.tel=tel;
	}
	
	//a) Obtener, para un departamento, el mes con el mayor monto de ventas del año
	public int mayorMes(int columnadepto) {
		return ManejadorMatrices.mayorColumna(ventas, MAXR, columnadepto-1) +1;
	}
	
	//b) Obtener, para un mes, el promedio de ventas, considerando todos los departamentos
	public double promMes(int filames) {
		return ManejadorMatrices.sumaFila(ventas,  filames-1,  MAXC)/MAXC;
	}
	
	//c) Obtener, para un departamento, el promedio de ventas del año
	public double promDepto(int columnadepto) {
		return ManejadorMatrices.sumaColumna(ventas, MAXR, columnadepto-1)/MAXR;
	}
	
	//d) Obtener, si es posible, el mes en el cual no hubo ventas en ninguno de los departamentos
	public int mesSinVentas() {
		int mes=-1;
		int i=0;
		boolean band=true;
		while (i<MAXR && band) {
			if(ManejadorMatrices.sumaFila(ventas, i, MAXC)==0) {
				band = false;
				mes=1;
			}
			i++;
		}
		return mes;
	}
	
	//Todos los que tienen cero ventas
	public ArrayList <Integer> todos(){
		ArrayList<Integer>lista = new ArrayList <Integer>();
		for(int i=0; i<MAXR; i++) {
			if((ManejadorMatrices.sumaFila(ventas, i, MAXC)==0))
				lista.add(i+1);
		}
		return lista;				
	}
}
