/**
 * Autor: Robson Borges dos Santos
 * Somar os números de 0 a 10 sequencialmente
 */
package primeirosCodigosEclipse;

public class TestaSomatoria {

	public static void main(String[] args) {
		
		int contador = 0;
		int total = 0;
		
		while(contador <= 10) {
			total += contador;
			contador++;
		}
		System.out.println(total);
	}
}
