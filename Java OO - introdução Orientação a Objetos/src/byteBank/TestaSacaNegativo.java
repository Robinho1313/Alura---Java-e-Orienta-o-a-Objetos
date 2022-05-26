package byteBank;

public class TestaSacaNegativo {

	public static void main(String[] args) {

		ContaBancaria conta = new ContaBancaria();
		conta.depositar(100);
		System.out.println(conta.saca(200));
		System.out.println(conta.getSaldo());

	}

}
