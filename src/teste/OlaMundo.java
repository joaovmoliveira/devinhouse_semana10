package teste;

import java.util.Arrays;
import java.util.Scanner;

import utils.Operacoes;

public class OlaMundo {

	public static void main(String[] args) {

		/*
		 * Scanner palindromo = new Scanner(System.in);
		 * 
		 * System.out.print("Digite uma frase ou palavra: "); String strInputUsuario =
		 * palindromo.nextLine(); String strTratada = strInputUsuario.replace(" ", "");
		 * strTratada = strTratada.replace("-", ""); String strInvertida = "";
		 * System.out.println(strTratada); for (int i = strTratada.length() - 1; i >= 0;
		 * i--) { strInvertida += strTratada.charAt(i); }
		 * System.out.println(strInvertida);
		 * 
		 * if (strTratada.equalsIgnoreCase(strInvertida)) {
		 * System.out.println("A frase/palavra \"" + strInputUsuario +
		 * "\" é um palíndromo!"); } else { System.out.println("A frase/palavra \"" +
		 * strInputUsuario + "\" não é um palíndromo."); }
		 */

		/*
		 * String[] meses = { "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
		 * "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro" }; int[]
		 * qtdDiasPorMes = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		 * 
		 * for (int i = 0; i < meses.length; i++) { System.out.println("O mês de " +
		 * meses[i] + " possui " + qtdDiasPorMes[i] + " dias."); }
		 * 
		 * for (String mes : meses) { System.out.print(mes + " "); }
		 */

		Scanner in = new Scanner(System.in);

		System.out.print("Favor inserir um número: ");

		int numUsuario = Integer.parseInt(in.nextLine());

		String strParOuImpar = Operacoes.parOuImpar(numUsuario);

		System.out.println("O número inserido é " + strParOuImpar);

		/*
		 * int anosDeCopa[] = { 2022, 2018, 2014, 2010, 2006, 2002 };
		 * 
		 * Arrays.sort(anosDeCopa);
		 * 
		 * for (int ano : anosDeCopa) { System.out.print(ano + " "); }
		 * 
		 * int pos = Arrays.binarySearch(anosDeCopa, 2018);
		 * 
		 * //int[] novoArray = new int[3];
		 * 
		 * //int item = anosDeCopa[anosDeCopa.length - 1];
		 * 
		 * System.out.println("\n" + pos); System.out.println(anosDeCopa[pos]);
		 * 
		 * Arrays.fill(anosDeCopa, 2002);
		 * 
		 * for (int ano : anosDeCopa) { System.out.print(ano + " "); }
		 */

		/*
		 * anosDeCopa = novoArray;
		 * 
		 * anosDeCopa[4] = 2002;
		 * 
		 * System.out.println(anosDeCopa[0]);
		 */

		/*
		 * String[] carros = new String[5];
		 * 
		 * //carros[5] = "teste";
		 * 
		 * String[] novosCarros = new String[6];
		 * 
		 * carros = novosCarros;
		 * 
		 * carros[5] = "teste";
		 * 
		 * System.out.println(carros.length);
		 * 
		 * anosDeCopa[0] = 2002;
		 */
	}

}
