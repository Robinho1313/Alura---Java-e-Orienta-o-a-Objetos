package test;
public class TestaMetodo {

	public static void main(String[] args) {

		Conta contaRob = new Conta();
		contaRob.depositar(500);
		contaRob.titular = "Robson Borges dos Santos";
		
		System.out.println(contaRob.titular);		
		System.out.println("Saldo..............: " + contaRob.saldo);		
		System.out.println("Saque de 300$ conta Rob: " + contaRob.saca(300));
		System.out.println("Saldo..............: " + contaRob.saldo);
		System.out.println("-----\n");		

		
		Conta contaFlavia = new Conta();
		contaFlavia.depositar(1000);
		contaFlavia.titular = "Flávia Marques";
		System.out.println(contaFlavia.titular);		
		System.out.println("Saldo............: " + contaFlavia.saldo);		
		System.out.println("Transfere 100$..: " + contaFlavia.transfere(100, contaRob));	

		System.out.println("-----\n");		

		System.out.println("Saldo Rob..............: " + contaRob.saldo);	
		System.out.println("Saldo Flávia...........: " + contaFlavia.saldo);		
	}
}
