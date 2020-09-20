package br.com.fundamentos;

public class ProgressaoGeometrica {

	public static void main(String[] args) {
		int inicial=1;
		int quociente=2;
		int gn=inicial;
		int valor_max =90;
		 System.out.printf("Elementos da PG, de valro inicial %d e razao %d, menores que %d\n", inicial,quociente,valor_max);
		 while (gn <= valor_max){
			 System.out.println(gn);
			 gn *= quociente;
		  }

	}

}
