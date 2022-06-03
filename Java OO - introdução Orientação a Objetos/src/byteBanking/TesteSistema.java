package byteBanking;

public class TesteSistema {

	public static void main(String[] args) {

		Gerente g = new Gerente();
		g.setSenha(222);
		
		Administrador adm = new Administrador();
		adm.setSenha(223);
		
		Cliente cliente = new Cliente();
		cliente.setSenha(333);
		
		SistemaInterno si = new SistemaInterno();
		si.autentica(g);
		si.autentica(adm);
		si.autentica(cliente);		
	}
}
