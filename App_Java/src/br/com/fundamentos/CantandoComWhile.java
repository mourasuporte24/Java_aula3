package br.com.fundamentos;

public class CantandoComWhile {

	public static void main(String[] args) {
		int patinhos = 5;
		while (patinhos != 0) {
			
			if (patinhos != 1) {
				System.out.printf("%d patinhos foram passear\n", patinhos);
				System.out.println("Al�m das montanhas");
				System.out.println("Para brincar");
				System.out.println("A mam�e gritou: Qu�, qu�, qu�, qu�");
				System.out.printf("Mas s� %d patinhos voltaram de l�.\n", --patinhos);
				System.out.println();
			} else {
				System.out.printf("%d patinho foi passear\n", patinhos);
				System.out.println("Al�m das montanhas");
				System.out.println("Para brincar");
				System.out.println("A mam�e gritou: Qu�, qu�, qu�, qu�");
				System.out.println("Mas nenhum patinho voltou de l� ");
				System.out.println();
				patinhos--;
			}

		}
		System.out.println("A mam�e patinha foi procurar");
		System.out.println("Al�m das montanhas");
		System.out.println("Na beira do mar");
		System.out.println("A mam�e gritou: Qu�, qu�, qu�, qu�");
		System.out.println("E os 5 patinhos voltaram de l�.");
	}

}