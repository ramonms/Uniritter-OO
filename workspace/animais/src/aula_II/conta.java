package aula_II;

public class conta {
	private Float saldo;
	private int numero;
	
	public conta( ) {
				
	}

	public Float getSaldo() {
		return saldo;
	}

	public void setSaldo(Float saldo) {
		this.saldo = saldo;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public void sacar( Float valor) throws Exception{
		if( valor <= saldo) {
			saldo -= valor;
		} else {
			throw new Exception("Saldo Insuficiente");
		}
	}
	
	

}
