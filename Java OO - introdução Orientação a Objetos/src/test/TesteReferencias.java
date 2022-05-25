package test;
public class TesteReferencias {

	//referência dos objetos
	public static void main(String[] args) {

		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;
		
		System.out.println("Primeira Conta...: " + primeiraConta.saldo);
		
		Conta segundaConta = primeiraConta;
		
		System.out.println("Segunda Conta...: " + segundaConta.saldo);

		segundaConta.saldo += 100;
		
		System.out.println("Segunda Conta...: " + segundaConta.saldo);
		System.out.println("Primeira Conta...: " + primeiraConta.saldo);

		if(primeiraConta == segundaConta) {
			System.out.println("Primeira e Segunda contas São Iguais");
		}
		
		System.out.println(primeiraConta);
		System.out.println(segundaConta);	
	}
}
