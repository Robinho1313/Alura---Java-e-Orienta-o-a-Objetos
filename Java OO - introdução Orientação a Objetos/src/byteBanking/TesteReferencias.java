package byteBanking;

public class TesteReferencias {

	public static void main(String[] args) {

		Gerente g1 = new Gerente();
		g1.setNome("Robson Borges");
		g1.setSalario(10000);
		
		Funcionario f = new Funcionario();
		f.setSalario(2000);
		
		EditorVideo ev = new EditorVideo();
		ev.setSalario(2500);
		
		ControleBonificao controle = new ControleBonificao();
		controle.registra(g1);
		controle.registra(f);
		controle.registra(ev);
		
		System.out.println(controle.getSoma());		
	}
}
