/*
 * Autor Robson Borges dos Santos
 * Resultado dos números fatoriais entre 2 e 9
 */
package primeirosCodigosEclipse;

public class ImprimeFatorial {

	public static void main(String[] args) {

	for(int numFatorial = 2; numFatorial < 10; numFatorial++) {			
		int result = numFatorial;
		int numAnterior = (numFatorial - 1);
		
		for (int fatorIterador = numAnterior; fatorIterador > 0; fatorIterador--) {
			result = result * fatorIterador;
		}
			System.out.println(numFatorial + "! = " + result);			
		}	
	}
}
