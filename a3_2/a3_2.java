class a3_3 {
	public static void main(String[] args) {
		System.out.println("labeled	loops");
		System.out.println("divisao por 0");
		System.out.println("\nlabeled loops nao deve ser usado, mas por");
		System.out.println("curiosidade, funciona semelhantemente ao");
		System.out.println("goto. Mas pode-se escolher continue tambem");
		
		int divisaoPor0 = 1;
		//divisaoPor0 /= 0; // o codigo da erro aqui
		System.out.println(divisaoPor0);
		divisaoPor0 = 1;
		// o codigo roda, mas o int fica alterado
		divisaoPor0 /= 0.0;
		System.out.println(divisaoPor0);
	}
}
