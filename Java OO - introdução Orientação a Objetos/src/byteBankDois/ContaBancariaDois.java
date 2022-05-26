package byteBankDois;
public class ContaBancariaDois {

	private double saldo;
	private int agencia;
	private int numero;
	private ClienteBancarioDois titular;

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public ClienteBancarioDois getTitular() {
		return titular;
	}

	public void setTitular(ClienteBancarioDois titular) {
		this.titular = titular;
	}

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

	public boolean transfere(double valor, ContaBancariaDois destino) {
		if (valor <= this.saldo) {
			this.saldo -= valor;
			destino.depositar(valor);
			return true;
		}
		return false;
	}
}
