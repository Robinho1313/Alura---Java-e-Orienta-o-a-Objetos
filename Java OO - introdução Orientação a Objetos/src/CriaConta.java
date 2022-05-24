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
		System.out.println("Agência 02 -> " + segundaConta.agencia);
		
		segundaConta.agencia = 1606;
		System.out.println("Agência 02 Mudou de Número-> " + segundaConta.agencia);

		if(primeiraConta == segundaConta) {
			System.out.println("Primeira e Segunda contas São Iguais");
		} else {
			System.out.println("Primeira e Segunda contas São Diferentes");

		}

		System.out.println(primeiraConta);
		System.out.println(segundaConta);
	}
}
