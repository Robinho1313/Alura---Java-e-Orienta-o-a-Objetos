public class Conta {

	double saldo;
	int agencia = 42;
	int numero;
	String titular;

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

	public boolean transfere(double valor, Conta destino) {
		if (valor <= this.saldo) {
			this.saldo -= valor;
			destino.depositar(valor);
			return true;
		}
		return false;
	}
}
