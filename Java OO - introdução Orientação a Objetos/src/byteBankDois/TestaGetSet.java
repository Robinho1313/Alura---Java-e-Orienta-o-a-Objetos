package byteBankDois;

public class TestaGetSet {

	public static void main(String[] args) {

		ContaBancariaDois conta = new ContaBancariaDois(1606, 121212);
		System.out.println(conta.getNumero());
		
		ClienteBancarioDois paulo = new ClienteBancarioDois();
		conta.setTitular(paulo);
		conta.getTitular().setNome("Paulo Borges");
		System.out.println(conta.getTitular().getNome());
		conta.getTitular().setProfissao("Programador");
		System.out.println(conta.getTitular().getProfissao());
	}
}
