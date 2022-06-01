package byteBanking;

public class TesteReferencias {

	public static void main(String[] args) {

		Gerente g1 = new Gerente();
		g1.setNome("Robson Borges");
		g1.setSalario(10000);
		
		Funcionario f = new Gerente();
		f.setSalario(2000);
		
		ControleBonificao controle = new ControleBonificao();
		controle.registra(g1);
		controle.registra(f);
		
		System.out.println(controle.getSoma());		
	}
}
