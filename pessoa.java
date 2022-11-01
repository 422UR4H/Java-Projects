class Pessoa {
	private String nome;
	private int idade;
	
	Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	String getNome() {
		return this.nome;
	}
	
	int getIdade() {
		return this.idade;
	}
}
