package byteBanking;

public class TesteGerente {

	public static void main(String[] args) {
		Gerente gerente = new Gerente();
		gerente.setNome("Yago Borges");
		gerente.setCpf("87654321324");
		gerente.setSalario(7000);
		gerente.setSenha(456);

		System.out.println(gerente.getNome());
		System.out.println(gerente.getCpf());
		System.out.println(gerente.getSalario());
		System.out.println(gerente.getBonificacao());
	
		boolean b = gerente.autentica(456);
		System.out.println(b);
	}
}
