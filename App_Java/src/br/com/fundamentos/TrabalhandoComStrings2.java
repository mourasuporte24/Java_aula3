package br.com.fundamentos;

public class TrabalhandoComStrings2 {
	public static void main(String[]args) {
		/*char data[]= {'a','b','c'};
		String str=new String(data);
		System.out.println(str);*/
		/*String valor = "Trabalhando com strings";
		
		System.out.println(valor.codePointAt(0));
	
		System.out.println(treinamento.compareTo("Treinamento com String")==0 ? true: false);
		System.out.println(treinamento.compareTo("TREINAMENTO COM STRING")==0 ? true: false);
		System.out.println(treinamento.compareToIgnoreCase("TREINAMENTO COM STRING")==0 ? true: false);*/
		
		String treinamento = "Treinamento com String";
		
		/*System.out.println(treinamento.endsWith("Treinamento"));
	    System.out.println(treinamento.startsWith("Trei"));
	    System.out.println(treinamento.startsWith("",3));*/
		//System.out.println("Tamabho da string -->" + treinamento.length());	
	
		   //foreach exclusivo para um objeto.
		//for (char c : treinamento.toCharArray()) {			
		//	System.out.println("char: " + c );		
			
		   //  }
		//Outra maneira
		/*for (int i= 0; i < treinamento.length(); i++) {
			char c = treinamento.toCharArray()[i];
			System.out.println(c);
		   }*/
		
		//for (byte b: treinamento.getBytes()) {
			
			//System.out.println("byte:" + b);
			
		  
	//String nome= "";
	//System.out.println(nome.isEmpty());
	 
		//String usandoSplitELimit = "Fundamento-em-Java-Engenharia-Computação ";
		//String[] valorCompSplitComLimit = usandoSplitELimit.split("-",);
			
		//for (String s : valorCompSplitComLimit) {
		//	System.out.println(s);
		
		
		String valor = "Treinamento com Strings";  
		
		//System.out.println(valor.subSequence(0,5));
		//System.out.println(valor.substring(0,5));
		
		//String maiusculoEMinusculo ="   Treinamento em Java -Trabalhando Com Classe String ";
		//System.out.println(maiusculoEMinusculo.toLowerCase());
	//	System.out.println(maiusculoEMinusculo.toUpperCase());
		//System.out.println(maiusculoEMinusculo.trim());
		
		
		// myBoolean = true;
		////System.out.println(String.valueOf(myBoolean));
		//10
		
		//float
		//float myfloat= -10;
		//System.out.println(String.valueOf(myfloat));
		
		//int		
		//int myInt = 9;
		//
		//double
	//	double myDouble = 10.30;
		//System.out.println(String.valueOf(myDouble));
		
		String result = String.format("Hoje nós processamos %,d transações", 10000);
		System.out.println(result);
		
		result= String.format("10 / 3 = %.4f", 10.0 / 3.0);
		System.out.println(result);
		   
	         }
		
	
		}	


