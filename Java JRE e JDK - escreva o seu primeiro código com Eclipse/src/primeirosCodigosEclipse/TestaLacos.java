package primeirosCodigosEclipse;

public class TestaLacos {

	public static void main(String[] args) {
		
		int total;
		
		for(int tabuada = 1; tabuada <= 10; tabuada++) {			
			System.out.println("--->Tabuada do " + tabuada + "\n");
			
			for(int fator = 1; fator <= 10; fator++) {
				total = tabuada * fator;
				System.out.println(tabuada + "x" + fator + "= " + total );
			}
			System.out.println("");
		}
	}
}
