public class CriaConta {

	public static void main(String[] args) {

		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;		
		System.out.println("Saldo Conta 01 -> " + primeiraConta.saldo);
		
		primeiraConta.saldo += 100;		
		System.out.println("Saldo Conta 01 -> " + primeiraConta.saldo);

		Conta segundaConta = new Conta();
		segundaConta.saldo = 50;
		
		System.out.println("Saldo Conta 02 -> " + segundaConta.saldo);
		
		System.out.println("Titular -> " + segundaConta.titular);
		System.out.println("Ag�ncia 02 -> " + segundaConta.agencia);
		
		segundaConta.agencia = 1606;
		System.out.println("Ag�ncia 02 Mudou de N�mero-> " + segundaConta.agencia);

		if(primeiraConta == segundaConta) {
			System.out.println("Primeira e Segunda contas S�o Iguais");
		} else {
			System.out.println("Primeira e Segunda contas S�o Diferentes");

		}

		System.out.println(primeiraConta);
		System.out.println(segundaConta);
	}
}
