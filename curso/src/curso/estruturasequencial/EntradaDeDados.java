package curso.estruturasequencial;

import java.util.Scanner;

public class EntradaDeDados {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		//Lendo uma string
		System.out.println("Qual o seu nome?");
		String nome = entrada.nextLine();
		
		System.out.println("Muito prazer " + nome);
		
		//Lendo um ponto flutuante
		System.out.println("Qual a sua altura?");
		double altura = entrada.nextDouble();
		System.out.printf("Sua altura é %.2fm %n ", altura);
		
		//Lendo um caractere
		System.out.println("Qual seu sexo? F para feminino e M para masculino");
		char sexo = entrada.next().charAt(0);
	
		System.out.println("Seu sexo é " + sexo);
		entrada.close();
	}
}
