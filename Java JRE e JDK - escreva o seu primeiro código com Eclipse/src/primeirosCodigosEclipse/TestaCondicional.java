package primeirosCodigosEclipse;

public class TestaCondicional {

	public static void main(String[] args) {
		System.out.println("-----Testando Condicionais-----");
		int idade = 16;
		int quantidade = 3;

		if (idade >= 18) {
			System.out.println("Voc� tem mais de 18 anos!");
			System.out.println("Seja Bem Vindo");
		} else {
			if(quantidade >= 2) {
				System.out.println("Est� acompanhado e mesmo sem 18 anos, "
						+ "voc� pode entrar!");
			} else {
				System.out.println("Voc� n�o pode entrar!");
			}
		}
	}
}
