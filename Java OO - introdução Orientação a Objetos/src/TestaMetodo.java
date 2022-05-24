public class TestaMetodo {

	public static void main(String[] args) {

		Conta contaRob = new Conta();
		contaRob.depositar(500);
		
		System.out.println("Saldo Rob..............: " + contaRob.saldo);		
		System.out.println("Saque de 300$ conta Rob: " + contaRob.saca(300));
		System.out.println("Saldo Rob..............: " + contaRob.saldo);
		
		Conta contaFlavia = new Conta();
		contaFlavia.depositar(1000);
		System.out.println("Saldo Fávia............: " + contaFlavia.saldo);
		
		System.out.println("Flavia Transfere 100$..: " + contaFlavia.transfere(100, contaRob));	

		System.out.println("Saldo Rob..............: " + contaRob.saldo);	
		System.out.println("Saldo Flávia...........: " + contaFlavia.saldo);		
	}
}
