package primeirosCodigosEclipse;

public class TesteIR {

    public static void main(String[] args) {

        double salario = 3300.0;

        if (salario <= 2800.0) {
			System.out.println("Deduzir na declara��o o valor de R$ 142");
		}
        if (salario > 2800.1 && salario <= 3751.0) {
			System.out.println("Deduzir na declara��o o valor de R$ 350");
		}
        if (salario > 3751.1 && salario <= 4664.0) {
			System.out.println("Deduzir na declara��o o valor de R$ 636");
		}
    }
}