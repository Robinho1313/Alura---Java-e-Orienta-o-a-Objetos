package byteBanking;

public class EditorVideo extends Funcionario{

	public double getBonificacao() {
		System.out.println("Editor");
		return super.getBonificacao() + 100;
	}
}
		
	
