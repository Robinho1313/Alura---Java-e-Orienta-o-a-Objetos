package primeirosCodigosEclipse;

public class TestaCondicional2 {

	int i = 0;
	
	public static void main(String[] args) {
		System.out.println("-----Testando Condicionais-----");
		int idade = 20;
		int quantidadePessos = 3;
		boolean acompanhado = (quantidadePessos >= 2);
		
		System.out.println("Valor de acompanhado é " + acompanhado);

		if (idade >= 18 && acompanhado) {
			System.out.println("Seja Bem Vindo");
		} else {
			System.out.println("Está Fora!");
		}
	}
}
