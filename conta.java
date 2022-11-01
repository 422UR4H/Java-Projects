/*
conta:
cliente associado a conta (pessoa)
saldo
numero
agencia
data de abertura


saca
deposita
transfere
calculaRencimento
*/

class Conta {
	Pessoa cliente;
	private int numero;
	private double saldo;
	private int agencia;
	private String dataInicio;
	private static int qtdContas;
	private int ident; // identificador dos objetos
	
	
	Conta(int numero, String dataInicio) {
		this.numero = numero;
		Conta.qtdContas++;
		this.ident = Conta.qtdContas;
	}
	
	int getIdent() {
		return this.ident;
	}
	
	void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	
	int getAgencia() {
		return this.agencia;
	}
	
	String getDataInicio() {
		return this.dataInicio;
	}
	
	double getSaldo() {
		return this.saldo;
	}
	
	public static int getQtdContas() {
		return Conta.qtdContas;
	}
	
	boolean saca(double valor) {
		if (valor > saldo) {
			return false;
		}
		this.saldo -= valor;
		return true;
	}
	
	boolean depot(double valor) {
		if (valor < 0) {
			return false;
		}
		this.saldo += valor;
		return true;
	}
	
	boolean transferePara(Conta destino, double valor) {
		if (!saca(valor) ) {
			return false;
		}
		if (!destino.depot(valor) ) {
			return false;
		}
		return true;
	}
	
	double getRendimento() {
		return this.saldo * 0.1;
	}
	
	void recuperaDadosParaImpressao() {
		String dados = "Titular: " + this.cliente.getNome(); // vai gerar um erro aqui
		dados += "\nNumero: " + this.numero;
		dados += "\nSaldo: " + this.saldo;
		dados += "\nRendimento: " + getRendimento();
		System.out.println(dados);
	}
}
