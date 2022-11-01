class Programa {
	public static void main(String[] args) {
		System.out.println(Conta.getQtdContas());
		
		Pessoa people = new Pessoa("Anton", 42);
		Pessoa peopla = new Pessoa("Higor", 24);
		
		Conta conta1 = new Conta(753429861, "10/10/10");
		Conta conta2 = new Conta(753861429, "20/20/20");
		
		conta1.cliente = people;
		conta2.cliente = peopla;
		
		System.out.println("Conta 1: " + conta1.cliente.getNome() );
		System.out.println("Conta 2: " + conta2.cliente.getNome() );
		System.out.println("Saldo 1: " + conta1.getSaldo() );
		
		conta1.depot(1000.0);
		conta2.depot(2000.0);
		
		System.out.println("Saldo 1: " + conta1.getSaldo() );
		System.out.println("Saldo 2: " + conta2.getSaldo() );
		
		conta2.saca(200.0);
		conta1.transferePara(conta2, 200.0);
		
		System.out.println("Saldo 1: " + conta1.getSaldo() );
		System.out.println("Saldo 2: " + conta2.getSaldo() );
		
		System.out.print("\n");
		conta1.recuperaDadosParaImpressao();
		System.out.print("\n");
		conta2.recuperaDadosParaImpressao();
		
		System.out.println(conta1.getIdent() );
		System.out.println(conta2.getIdent() );
	}
}
