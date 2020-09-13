package br.com.fundamentos;

public class classe2 {
	
	 /* Java String: Manipulando métodos da classe String Vamos “destrinchar” os
	 * métodos com conceitos e exemplos de como utilizá-los. Espero que todas as
	 * dúvidas que havia em relação a essa classe possam ser sanadas. Antes de
	 * entender os metodos da classe é preciso entender que na verdade a classe
	 * "String" é uyma "wrapper" de um vetor de char, assim como Integer é para int
	 * (primitivo) esses tipos de classe abordaremos mais na frente do curso.
	 */
	public static void main(String[] args) {
		char data[] = { 'a', 'b', 'c' };
		String str = new String(data);
		System.out.println(str);

		/*
		 * -> charAt O nosso primeiro método é bem simples e consiste em retornar apenas
		 * um caractere em determinada posição de nossa String
		 */
		String valor = "Trabalhando com strings";
		System.out.println(valor.charAt(0));

		/*
		 * -> codePointAt Retorna o valor em UNICODE do caractere especificado no index
		 * do parâmetro
		 */
		System.out.println(valor.codePointAt(0));
		// A codificação da letra 'D' correspondente a posição 0 na nossa String é igual
		// a 68, considerando a codificação UNICODE

		/*
		 * -> compareTo e compareToIgnoreCase Fazer comparação de duas Strings compareTo
		 * = considera letras maiúsculas e minúsculas na comparação compareToIgnoreCase
		 * = ignora qualquer diferença de minúsculas ou maiúsculas O importante aqui é
		 * saber que o retorno for igual a zero significa que não há diferenças entre a
		 * String
		 */

		String treinamento = "Treinamento com String";
		System.out.println(treinamento.compareTo("Treinamento com String") == 0 ? true : false);
		System.out.println(treinamento.compareTo("TREINAMENTO COM STRING") == 0 ? true : false);
		System.out.println(treinamento.compareToIgnoreCase("TREINAMENTO COM STRING") == 0 ? true : false);

		/*
		 * -> endsWith e startsWith endsWith verifica se a String termina com o valor
		 * especificado startsWith verifica se a String começa com o valor especificado.
		 * Esse metodo tem uma variação com parâmetro int toffset” e outra sem, onde o
		 * método que contém o parâmetro “int toffset” serve para dizer de onde deve
		 * começar a verificação do inicio da String
		 */
		System.out.println(treinamento.endsWith("Treinamento"));
		System.out.println(treinamento.startsWith("Trei"));
		System.out.println(treinamento.startsWith("in", 3));

		/*
		 * -> toCharArray Converte uma String em um Array de char. Ex: Uma String de 10
		 * posições irá ser convertida em um vetor char[] de 10 posições
		 */

		for (char c : treinamento.toCharArray()) {
			System.out.println("Char: " + c);
		}

		/*
		 * -> getBytes Converte a String em um vetor de byte[] Este método é muito útil
		 * principalmente quando precisamos salvar caracteres no banco desconsiderando a
		 * codificação atual. No PostgreSQL, por exemplo, você pode utilizar o tipo
		 * “bytea” que é análogo ao “byte” em Java. Assim como você pode converter para
		 * byte, você também pode voltar para String ou char
		 */

		for (byte b : treinamento.getBytes()) {
			System.out.println("byte: " + b);
		}

		/*
		 * -> isEmpty método muito utilizado e comum que verifica se uma String está ou
		 * não vazia, mas tenha atenção neste método, pois a verificação baseia-se se
		 * sua String possui tamanho = 0, ou seja, o String.length() = 0. Isso significa
		 * que caso você tente utilizar o isEmpty() em uma String que possui valor NULL
		 * você receberá um NullPointerException. String nome = null;
		 * System.out.println(nome.isEmpty());
		 */

		/*
		 * -> split cria um array de Strings com base no “regex” passado via parâmetro,
		 * ou seja, ele divide a String em várias outras Strings com base no seu regex,
		 * o que é muito útil para separar tags em uma String completa, ex: “software,
		 * engenharia, computação”. Você pode transformar essa única String em um array
		 * com três Strings. Também possui uma variação, que é o parâmetro “int limit”,
		 * onde você identifica quantas vezes o regex será aplicado em toda String
		 */

		/*
		 * Uso do split sem o LIMIT
		 */
		String curso = "fundamento em java";
		String[] valorComSplit = curso.split("-");

		for (String s : valorComSplit) {
			System.out.println(s);
		}

		/*
		 * Uso do split com o LIMIT
		 */
		String usandoSplitELimit = "Fundameto - java - software, engenharia, computação";
		String[] valorComSplitComLimit = usandoSplitELimit.split("-", 2);

		for (String s : valorComSplitComLimit) {
			System.out.println(s);
		}

		/*
		 * no segundo bloco de código o split não divide “Java – Engenharia – Software”
		 * ? Simples, pois explicitamente dizemos quantas vezes o regex será aplicado, o
		 * que influência diretamente no tamanho final do nosso vetor, que será igual a
		 * dois.
		 */

		/*
		 * -> substring e subSequence Métodos retornam uma parte específica de uma
		 * determinada String, sendo que o método substring retorna uma nova String e o
		 * método subSequence retorna um CharSequence. É importante ressaltar que o
		 * CharSequence é uma interface e a String é a implementação dessa interface
		 */

		System.out.println(valor.subSequence(0, 5));
		System.out.println(valor.substring(0, 5));

		/*
		 * -> toLowerCase, toUpperCase e trim toLowerCase converte toda a String para
		 * caixa baixa toUpperCase converte toda a String para caixa alta trim remove
		 * espaços em branco no inicial e no final da String
		 */

		String maiusculoEMinusculo = " Treinamento em java - trabalhando  com classe string   ";
		System.out.println(maiusculoEMinusculo.toLowerCase());
		System.out.println(maiusculoEMinusculo.toUpperCase());
		System.out.println(maiusculoEMinusculo.trim());

		/*
		 * -> valueOf Método converte diversos tipos (booleano, inteiro, char, double,
		 * float, long, Object e etc) para String
		 */

		// boolean
		boolean myBoolean = true;
		System.out.println(String.valueOf(myBoolean));

		// float
		float myFloat = -10;
		System.out.println(String.valueOf(myFloat));

		// int
		int myInt = 9;
		System.out.println(String.valueOf(myInt));

		/// double
		double myDouble = 10.30;
		System.out.println(String.valueOf(myDouble));

		/*
		 * -> format Realiza a formatação de uma String de acordo com as especificações
		 * passadas
		 */

		String result = String.format("Hoje nós processamos %,d transações", 100000);
		System.out.println(result);

		result = String.format("10 / 3 = %.2f", 10.0 / 3.0);
		System.out.println(result);

	}

	
	
	

}
