package br.com.fundamentos;

public class classe2 {
	
	 /* Java String: Manipulando m�todos da classe String Vamos �destrinchar� os
	 * m�todos com conceitos e exemplos de como utiliz�-los. Espero que todas as
	 * d�vidas que havia em rela��o a essa classe possam ser sanadas. Antes de
	 * entender os metodos da classe � preciso entender que na verdade a classe
	 * "String" � uyma "wrapper" de um vetor de char, assim como Integer � para int
	 * (primitivo) esses tipos de classe abordaremos mais na frente do curso.
	 */
	public static void main(String[] args) {
		char data[] = { 'a', 'b', 'c' };
		String str = new String(data);
		System.out.println(str);

		/*
		 * -> charAt O nosso primeiro m�todo � bem simples e consiste em retornar apenas
		 * um caractere em determinada posi��o de nossa String
		 */
		String valor = "Trabalhando com strings";
		System.out.println(valor.charAt(0));

		/*
		 * -> codePointAt Retorna o valor em UNICODE do caractere especificado no index
		 * do par�metro
		 */
		System.out.println(valor.codePointAt(0));
		// A codifica��o da letra 'D' correspondente a posi��o 0 na nossa String � igual
		// a 68, considerando a codifica��o UNICODE

		/*
		 * -> compareTo e compareToIgnoreCase Fazer compara��o de duas Strings compareTo
		 * = considera letras mai�sculas e min�sculas na compara��o compareToIgnoreCase
		 * = ignora qualquer diferen�a de min�sculas ou mai�sculas O importante aqui �
		 * saber que o retorno for igual a zero significa que n�o h� diferen�as entre a
		 * String
		 */

		String treinamento = "Treinamento com String";
		System.out.println(treinamento.compareTo("Treinamento com String") == 0 ? true : false);
		System.out.println(treinamento.compareTo("TREINAMENTO COM STRING") == 0 ? true : false);
		System.out.println(treinamento.compareToIgnoreCase("TREINAMENTO COM STRING") == 0 ? true : false);

		/*
		 * -> endsWith e startsWith endsWith verifica se a String termina com o valor
		 * especificado startsWith verifica se a String come�a com o valor especificado.
		 * Esse metodo tem uma varia��o com par�metro int toffset� e outra sem, onde o
		 * m�todo que cont�m o par�metro �int toffset� serve para dizer de onde deve
		 * come�ar a verifica��o do inicio da String
		 */
		System.out.println(treinamento.endsWith("Treinamento"));
		System.out.println(treinamento.startsWith("Trei"));
		System.out.println(treinamento.startsWith("in", 3));

		/*
		 * -> toCharArray Converte uma String em um Array de char. Ex: Uma String de 10
		 * posi��es ir� ser convertida em um vetor char[] de 10 posi��es
		 */

		for (char c : treinamento.toCharArray()) {
			System.out.println("Char: " + c);
		}

		/*
		 * -> getBytes Converte a String em um vetor de byte[] Este m�todo � muito �til
		 * principalmente quando precisamos salvar caracteres no banco desconsiderando a
		 * codifica��o atual. No PostgreSQL, por exemplo, voc� pode utilizar o tipo
		 * �bytea� que � an�logo ao �byte� em Java. Assim como voc� pode converter para
		 * byte, voc� tamb�m pode voltar para String ou char
		 */

		for (byte b : treinamento.getBytes()) {
			System.out.println("byte: " + b);
		}

		/*
		 * -> isEmpty m�todo muito utilizado e comum que verifica se uma String est� ou
		 * n�o vazia, mas tenha aten��o neste m�todo, pois a verifica��o baseia-se se
		 * sua String possui tamanho = 0, ou seja, o String.length() = 0. Isso significa
		 * que caso voc� tente utilizar o isEmpty() em uma String que possui valor NULL
		 * voc� receber� um NullPointerException. String nome = null;
		 * System.out.println(nome.isEmpty());
		 */

		/*
		 * -> split cria um array de Strings com base no �regex� passado via par�metro,
		 * ou seja, ele divide a String em v�rias outras Strings com base no seu regex,
		 * o que � muito �til para separar tags em uma String completa, ex: �software,
		 * engenharia, computa��o�. Voc� pode transformar essa �nica String em um array
		 * com tr�s Strings. Tamb�m possui uma varia��o, que � o par�metro �int limit�,
		 * onde voc� identifica quantas vezes o regex ser� aplicado em toda String
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
		String usandoSplitELimit = "Fundameto - java - software, engenharia, computa��o";
		String[] valorComSplitComLimit = usandoSplitELimit.split("-", 2);

		for (String s : valorComSplitComLimit) {
			System.out.println(s);
		}

		/*
		 * no segundo bloco de c�digo o split n�o divide �Java � Engenharia � Software�
		 * ? Simples, pois explicitamente dizemos quantas vezes o regex ser� aplicado, o
		 * que influ�ncia diretamente no tamanho final do nosso vetor, que ser� igual a
		 * dois.
		 */

		/*
		 * -> substring e subSequence M�todos retornam uma parte espec�fica de uma
		 * determinada String, sendo que o m�todo substring retorna uma nova String e o
		 * m�todo subSequence retorna um CharSequence. � importante ressaltar que o
		 * CharSequence � uma interface e a String � a implementa��o dessa interface
		 */

		System.out.println(valor.subSequence(0, 5));
		System.out.println(valor.substring(0, 5));

		/*
		 * -> toLowerCase, toUpperCase e trim toLowerCase converte toda a String para
		 * caixa baixa toUpperCase converte toda a String para caixa alta trim remove
		 * espa�os em branco no inicial e no final da String
		 */

		String maiusculoEMinusculo = " Treinamento em java - trabalhando  com classe string   ";
		System.out.println(maiusculoEMinusculo.toLowerCase());
		System.out.println(maiusculoEMinusculo.toUpperCase());
		System.out.println(maiusculoEMinusculo.trim());

		/*
		 * -> valueOf M�todo converte diversos tipos (booleano, inteiro, char, double,
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
		 * -> format Realiza a formata��o de uma String de acordo com as especifica��es
		 * passadas
		 */

		String result = String.format("Hoje n�s processamos %,d transa��es", 100000);
		System.out.println(result);

		result = String.format("10 / 3 = %.2f", 10.0 / 3.0);
		System.out.println(result);

	}

	
	
	

}
