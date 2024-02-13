package Librerias;

public class Pago {
	//************ATRIBUTOS***********
	private static int claveUnica = 1;
	private double monto;
	private String tipoPago;
	private double descuento;
	private int claseCliente;
	private boolean status;
	
	//************CONSTRUCTOR***********
	public Pago (double monto, String tp, double d, int cc, boolean s) {
		claveUnica ++;
		this.monto=monto;
		tipoPago=tp;
		descuento=d;
		claseCliente=cc;
		status=s;
	}
	
	//***********GETS & SETS**********
	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public double getMonto() {
		return monto;
	}

	public void setMoento (double m) {
		monto = m;
	}
	
	//***********FUNCIONES DE LA CLASE************
	public double calculaDescuento(boolean bandera) {
		double res;
		if (bandera) 
			if (monto>200&&monto<500)
				res=monto*.02;
			else 
				if(monto>=500 && monto < 1000)
					res=0.025;
				else
					res=monto*.03;
		else
			res=0;
			return res;
	}
	
	public double calculaComision() {
		double res = 0;
		switch(tipoPago) {
			case "PP": res=monto*0.034;
				break;
			case "TC": res=monto*0.36;
				break;
			case "TD": res=monto*0.25;
				break;
		}
		return res;
	}
	
	public double calculaIva() {
		double res;
		res=(monto-calculaDescuento(true)+calculaComision())*.16;
		return res;
	}
	
	public double montoTotal() {
		double res;
		res=(monto-calculaDescuento(true)+calculaComision()+calculaIva());
		return res;
	}
	
	//************FUNCIONES GENERALES*************
	public boolean equals(Pago p) {
		boolean res=false;
		if (claveUnica==p.claveUnica);
			res = true;
		return res;
	}
	
	public int comparteTo(Pago p) {
		int res=-1;
		if (claveUnica==p.claveUnica)
			res = 0;
			else
				if(claveUnica>p.claveUnica)
					res=1;
		return res;
	}

	public String toString() {
		return "Pago [monto=" + monto + ", tipoPago=" + tipoPago + ", descuento=" + descuento + ", claseCliente="
				+ claseCliente + ", status=" + status + "]";
	}
}

