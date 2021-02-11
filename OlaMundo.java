package teste;

import java.util.Scanner;
import java.util.Calendar;

public class OlaMundo {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		/*System.out.print("Adivinhe um número de 5 a 10: ");
		int numeroDoUsuario = Integer.parseInt(input.nextLine());
		
		int aleatorio = (int) (Math.random() * (10-5) + 5);
		
		System.out.println("número gerado = " + aleatorio);
		
		while (numeroDoUsuario != aleatorio) {
			System.out.print("Errou! Tente novamente: ");
			numeroDoUsuario = Integer.parseInt(input.nextLine());
		}*/
		
		/*
		 * int numeroDoUsuario; int aleatorio = (int) (Math.random() * (10-5) + 5);
		 * 
		 * do { System.out.print("Adivinhe um número de 5 a 10: "); numeroDoUsuario =
		 * Integer.parseInt(input.nextLine()); } while (numeroDoUsuario != aleatorio);
		 * 
		 * System.out.println("Parabéns! Você acertou!");
		 */
		
		String nome = "João Victor";
		for (int i = 0; i < nome.length(); i++) {
			System.out.println(nome.charAt(i));
		}
		
		
		
		
		/* Calendar cal = Calendar.getInstance();

		int mesAtual = cal.get(Calendar.MONTH) + 1;
		String strMes = "";

		switch (mesAtual) {
			case 1:
				strMes = "Janeiro";
				break;
			case 2:
				strMes = "Fevereiro";
				break;
			case 3:
				strMes = "Março";
				break;
			case 4, 5, 6:
				strMes = "Estamos no segundo trimestre do ano.";
				break;
			case 7, 8, 9, 10, 11, 12:
				strMes = "Estamos no segundo semestre do ano.";
				break;
			default:
				strMes = "Não foi possível identificar o mês corrente.";
		}

		System.out.println(strMes);*/

		/*
		 * final int MINHA_IDADE = 29;
		 * 
		 * MINHA_IDADE = 30;
		 * 
		 * System.out.println(MINHA_IDADE);
		 */

		// System.out.println(dataAtual);

		// int anoCorrente = dataAtual.get(Calendar.YEAR);

		// System.out.println(anoCorrente);

		/*
		 * Scanner entrada = new Scanner(System.in);
		 * 
		 * System.out.print("Digite seu ano de nascimento: ");
		 * 
		 * int anoNascimento = Integer.parseInt(entrada.nextLine());
		 * 
		 * int idade = anoCorrente - anoNascimento;
		 */

		/*
		 * if (idade == 18) System.out.println("Você deve se alistar!"); else if (idade
		 * > 18) System.out.println("Você já se alistou no passado."); else
		 * System.out.println("Aguarde sua vez.");
		 * 
		 * System.out.println("Obrigado por usar nosso serviço.");
		 */

		/*
		 * String str1 = "DEVinHouse"; String str2 = "Vazia";
		 * 
		 * if (str1 != null && !str1.isEmpty() && str1.length() > 8) { str2 =
		 * str1.substring(1,8); }
		 * 
		 * System.out.println(str2);
		 */

	}

}
