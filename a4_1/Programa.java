class Programa {
	public static void main(String[] args) {
		Conta minhaConta, novaConta;
		minhaConta = new Conta();
		novaConta = new Conta();
		
		minhaConta.titular = "Sr. K";
		minhaConta.saldo = 20000000;
		
		novaConta.titular = "Jovem Nerd";
		
		
		System.out.print("Titular: " + minhaConta.titular + " ");
		System.out.println("- Saldo: " + minhaConta.saldo);
		
		if (!minhaConta.saca(1000000) ) {
			System.out.println("Saldo insuficiente");
		} else {
			System.out.println(minhaConta.saldo);
		}
		
		minhaConta.depot(2000000);
		System.out.println(minhaConta.saldo);
		
		if (!minhaConta.transfere(3000000, novaConta) ) {
			System.out.println("Erro. Verifique seu saldo");
		} else {
			System.out.println(3000000 + " transferido de " +
							   minhaConta.titular + " para " +
							   novaConta.titular);
		}
	}
}
