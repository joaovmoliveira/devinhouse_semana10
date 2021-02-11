package teste;

import java.util.Scanner;

public class OlaMundo {

	public static void main(String[] args) {

		//String str1 = "João Victor";
		//String str2 = "joão victor";

		//boolean ehIgual = str1.equalsIgnoreCase(str2);
		//char char0 = str1.charAt(6);
		//int index = str1.indexOf('o');
		//int lastIndex = str1.lastIndexOf('o');
		
		//String strCorrigida = str1.replace('a', 'ã');
		
		//String substr = str1.substring(5, 8);
		
		//boolean vaziaOuEmBranco = str1.isBlank();
		//boolean vazia = str1.isEmpty();
		
		//int resto = 8 % 2;
		
		//double media = (8+7+8)/3;
		
		//int i = (3 + 4) * 2 / 2;
		
		//int idade = 18;
		/*
		 * idade++; idade -= 2; idade *= 2; idade++; idade /= 3; idade %= 2;
		 */
		//int id2 = ++idade;
		
		/*double resultPow = Math.pow(5, 2);
		double resultSqrt = Math.sqrt(9);
		double resultCbrt = Math.cbrt(27); 
		double resultAbs = Math.abs(-10);
		double floorRes = Math.floor(29.9);
		double ceilRes = Math.ceil(30.1);
		double roundRes = Math.round(30.1);
		int rand = (int) (Math.random() * (100-10) + 10);*/
		
		/*String str = "10";
		String strNew = new String("10");
		
		System.out.println(str);
		System.out.println(strNew);
		
		boolean ehIgual = str.equals(strNew);*/
		
		boolean ehIgual = 10 == 10 ^ 9 > 10;
		
		int idade = 70;
		
		//String voto = (idade >= 16 && idade < 18) || (idade >= 70) ? "Opcional" : "Obrigatório";
		
		String voto;
		if ((idade >= 16 && idade < 18) || (idade >= 70)) {
			voto = "Opcional";
		} else if (idade >= 18 && idade < 70) {
			voto = "Obrigatório";
		} else {
			voto = "Proibido";
		}
		
		
		System.out.println(voto);
		//System.out.println(idade);

		/*
		 * String str = "asdasdassd";
		 * 
		 * int inteiro = Integer.parseInt(str);
		 */

		/*
		 * double altura = 1.75; String strAltura; int intAltura;
		 */
		// String nome = "João Victor";

		// double media = (8+7+8)/3;

		// int rand = (int) (Math.random() * (100-10) + 10);
		// double dblRand = Math.random() * (100-10) + 10;
		// int idade = 18;
		// String status = (idade >= 18) ? "adulto" : "menor de idade";

		// boolean ehPar = idade > 10 ^ idade == 18;

		// System.out.println(ehPar);

		/*
		 * int lengthNome = nome.length(); String nomeCAPS = nome.toUpperCase(); String
		 * nomeMinuscula = nome.toLowerCase(); String nomePodado =
		 * "  João Victor  ".trim();
		 * 
		 * System.out.println("tam: "+ lengthNome); System.out.println("caps: "+
		 * nomeCAPS); System.out.println("minusc: "+ nomeMinuscula);
		 * System.out.println("trim: "+ nomePodado);
		 */

		/*
		 * Scanner teclado = new Scanner(System.in);
		 * 
		 * System.out.print("Digite sua altura: "); strAltura = teclado.nextLine();
		 * 
		 * altura = altura + Double.parseDouble(strAltura);
		 * 
		 * 
		 * System.out.print("Sr. Usuário, digite seu nome: "); nome =
		 * teclado.nextLine();
		 * 
		 * System.out.printf("%s, digite sua altura: ", nome); altura =
		 * teclado.nextDouble();
		 * 
		 * System.out.format("%s, digite sua idade: ", nome); idade = teclado.nextInt();
		 * 
		 * System.out.
		 * printf("O usuário chamado %s%nmede %.2fm de altura%ne tem %d anos de idade.",
		 * nome, altura, idade);
		 */
	}

}
