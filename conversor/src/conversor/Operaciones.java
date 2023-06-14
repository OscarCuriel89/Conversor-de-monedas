package conversor;

import javax.swing.JOptionPane;

public class Operaciones {

	private double valor;
	private  int divisa1, divisa2;
	private double resultado;
	
	public double getResultado() {
		return resultado;
	}
	public void setResultado(double resultado) {
		this.resultado = resultado;
	}
	public int getDivisa2() {
		return divisa2;
	}
	public void setDivisa2(int divisa2) {
		this.divisa2 = divisa2;
	}
	public int getDivisa1() {
		return divisa1;
	}
	public void setDivisa1(int divisa1) {
		this.divisa1 = divisa1;
	}

		
		
		
		public double getValor() {
			return valor;
		}
		public void setValor(double valor) {
			this.valor = valor;
		}

	public double Operaciones() {
		if(divisa1==0 && divisa2 == 0) {
			resultado= valor;
		}else if(divisa1==0 && divisa2 == 1) {
			resultado= valor*0.054;	
		}else if(divisa1==0 && divisa2 == 2) {
			resultado = valor*0.050;
		
		}else if(divisa1==0 && divisa2 == 3) {
				resultado = valor*0.046;
			
		}else if(divisa1==0 && divisa2 == 4) {
			resultado = valor*8.14;
		}
		else if(divisa1==0 && divisa2 == 5) {
			resultado = valor*73.62;
		}
		else if(divisa1==1 && divisa2 == 0) {
			resultado= valor*18.44;		
		}else if(divisa1==1 && divisa2 == 1) {
			resultado= valor;	
		}else if(divisa1==1 && divisa2 == 2) {
			resultado = valor*0.93;
		}
		
		else if(divisa1==1 && divisa2 == 3) {
			resultado = valor*0.79;
		}else if(divisa1==1 && divisa2 == 4) {
			resultado = valor*140.21;
		}else if(divisa1==1 && divisa2 == 5) {
			resultado = valor*1267.95;
		}
		
		
		else if(divisa1==2 && divisa2 == 0) {
			resultado= valor*19.82;		
		}else if(divisa1==2 && divisa2 == 1) {
			resultado= valor*1.08;	
		}else if(divisa1==2 && divisa2 == 2) {
			resultado = valor;
		}	else if(divisa1==2 && divisa2 == 3) {
			resultado= valor*0.86;		
		}else if(divisa1==2 && divisa2 == 4) {
			resultado= valor*151.34;	
		}else if(divisa1==2 && divisa2 == 5) {
			resultado = valor*1370.06;
		}
		
		else if(divisa1==3 && divisa2 == 0) {
			resultado= valor*21.72;		
		}else if(divisa1==3 && divisa2 == 1) {
			resultado= valor*1.26;	
		}else if(divisa1==3 && divisa2 == 2) {
			resultado = valor*1.17;
		}else if(divisa1==3 && divisa2 == 3) {
			resultado= valor;		
		}else if(divisa1==3 && divisa2 == 4) {
			resultado= valor*176.83;	
		}else if(divisa1==3 && divisa2 == 5) {
			resultado = valor*1599.14;
		}
		else if(divisa1==4 && divisa2 == 0) {
			resultado= valor*0.12;		
		}else if(divisa1==4 && divisa2 == 1) {
			resultado= valor*0.0071;	
		}else if(divisa1==4 && divisa2 == 2) {
			resultado = valor*0.0066;
		}else if(divisa1==4 && divisa2 == 3) {
			resultado= valor*0.0057;		
		}else if(divisa1==4 && divisa2 == 4) {
			resultado= valor;	
		}else if(divisa1==4 && divisa2 == 5) {
			resultado = valor*0.0057;
		}
		
		else if(divisa1==5 && divisa2 == 0) {
			resultado= valor*0.014;		
		}else if(divisa1==5 && divisa2 == 1) {
			resultado= valor*0.00079;	
		}else if(divisa1==5 && divisa2 == 2) {
			resultado = valor*0.00073;
		}else if(divisa1==5 && divisa2 == 3) {
			resultado= valor*0.0000063;		
		}else if(divisa1==5 && divisa2 == 4) {
			resultado= valor*0.11;	
		}else if(divisa1==5 && divisa2 == 5) {
			resultado = valor;
		}
		
	
		
	
		
		
		return resultado;
		
		
	}
}
