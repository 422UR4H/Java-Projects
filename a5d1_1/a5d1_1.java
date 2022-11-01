class Teste {
	static int x = 42; // da erro se nao tiver static int
	public static void main(String[] args) {
		System.out.println(x); // por que estamos num metodo static aqui
		// e metodos static nao podem acessar variaveis da propria classe
		// que tambem nao sejam static
	}
}
