package primeirosCodigosEclipse;

public class TestaCondicional {

	public static void main(String[] args) {
		System.out.println("-----Testando Condicionais-----");
		int idade = 16;
		int quantidade = 3;

		if (idade >= 18) {
			System.out.println("Você tem mais de 18 anos!");
			System.out.println("Seja Bem Vindo");
		} else {
			if(quantidade >= 2) {
				System.out.println("Está acompanhado e mesmo sem 18 anos, "
						+ "você pode entrar!");
			} else {
				System.out.println("Você não pode entrar!");
			}
		}
	}
}
