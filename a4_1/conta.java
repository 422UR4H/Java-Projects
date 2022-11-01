class Conta {
	int numero;
	String titular;
	double saldo;
	
	boolean saca(double qtd) {
		if (qtd > this.saldo) {
			return false;
		} else {			
			double novoSaldo = this.saldo - qtd;
			this.saldo = novoSaldo;
			return true;
		}
	}
	void depot(double qtd) {
		this.saldo += qtd;
	}
	boolean transfere(double qtdPara, Conta destino) {
		if (!this.saca(this.saldo) ) {
			return false;
		}
		destino.depot(this.saldo);
		return true;
	}	
}
