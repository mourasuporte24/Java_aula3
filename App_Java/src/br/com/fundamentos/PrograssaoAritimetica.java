package br.com.fundamentos;

public class PrograssaoAritimetica {

	public static void main(String[] args) {
		int inicial = 1;
		int razao = 3;
		int an= inicial;
		int valor_max =20;
		
		System.out.printf ("Elementos da Pa, de valor incial %d e razao %d, menores que %d\n", inicial,razao,valor_max);
		while (an <= valor_max) {
		System.out.println(an);
	
		an += razao;		
	}
					

	}

}