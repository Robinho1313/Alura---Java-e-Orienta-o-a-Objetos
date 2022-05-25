/**
 * Autor Robson Borges dos Santos
 * Criação de conta bancária e testes relacionados 
 * a composição de objetos
 */
package byteBank;

public class TestaBanco {

	public static void main(String[] args) {

		ClienteBancario yago = new ClienteBancario();
		yago.nome = "Yago Borges Lima";
		yago.profissao = "Programador";
		yago.cpf = "222.222.222.22";
		
		ContaBancaria contaYago = new ContaBancaria();
		contaYago.depositar(800);
		contaYago.titular = yago;	
		
		System.out.println(contaYago.titular.nome);
		System.out.println(contaYago.titular.profissao);
		
		//outra forma de compor objetos
		ContaBancaria Marcela = new ContaBancaria();
		System.out.println(Marcela.saldo);
		
		Marcela.titular = new ClienteBancario();
		Marcela.titular.nome = "Marcelinha";

		System.out.println(Marcela.titular.nome);
	}
}
