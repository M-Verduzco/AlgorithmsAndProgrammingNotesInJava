package Librerias;

public class EmpresaAutomotriz {
	private String name;
	private String tel;
	private double[][] m;
	private final int agencias=5;
	private final int mes=12;
	
	public EmpresaAutomotriz(String name, String tel) {
		this.name = name;
		this.tel = tel;
		m= new double[mes][agencias];
	}

	public String getName() {
		return name;
	}

	public String getTel() {
		return tel;
	}
	
	public double totalVentasAgencia(int a) {
		return ManejadorMatrices.sumaColumna(m, mes, a);
	}
	
	public double promedioVentasMes(int a) {
		return ManejadorMatrices.sumaFila(m, a, agencias)/agencias;
	}
	
	public double masVentasMes(int a) {
		return ManejadorMatrices.mayorFila(m, a, agencias);
	}
	
	public int menosVentasAnual() {
		return ManejadorMatrices.menorSumaFilas(m, mes, agencias);
	}
}
