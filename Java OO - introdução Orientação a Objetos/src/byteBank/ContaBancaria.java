package byteBank;
public class ContaBancaria {

	private double saldo;
	private int agencia;
	private int numero;
	ClienteBancario titular;

	public void depositar(double valor) {
		this.saldo += valor;
	}

	public boolean saca(double valor) {
		if (valor > this.saldo) {
			return false;
		} else {
			this.saldo = (this.saldo - valor);
			return true;
		}
	}

	public double getSaldo() {
		return saldo;
	}

	public boolean transfere(double valor, ContaBancaria destino) {
		if (valor <= this.saldo) {
			this.saldo -= valor;
			destino.depositar(valor);
			return true;
		}
		return false;
	}
}
