package primeirosCodigosEclipse;

public class TestaPontoFlutuante {

	public static void main(String[] args) {
		double salario;
		salario = 3200.72;
		
		int pensao = 500;
		int total = (int) (salario - pensao);
		
		System.out.println("Salário...: " + (salario - pensao));
		System.out.println("Cast......: " + total);

		float f  = 3.14f;		
		double v1 = 0.2;
		double v2 = 0.1;
		
		System.out.println(v1 + v2);	
		System.out.println(f);		
	}
}
