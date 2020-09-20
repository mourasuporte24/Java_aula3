package br.com.fundamentos;

import java.util.Scanner;

public class SwitchMeses {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int teste;
		System.out.println("Digite o mes em numero inteiro");
		teste = entrada.nextInt();
		switch (teste) {
		case 1:
			System.out.println("Janeiro");
			break;
		case 2:
			System.out.println("Fevereiro");
			break;

		case 3:
			System.out.println("Março");
			break;

		case 4:
			System.out.println("Abril");
			break;
		default:
			System.out.println("Somente numeris entre 1 e 4");

		}

	}

}
