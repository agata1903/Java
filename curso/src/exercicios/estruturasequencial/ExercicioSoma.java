package exercicios.estruturasequencial;

import java.util.Scanner;

public class ExercicioSoma {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Insira o primeiro valor: ");
		int valor1 = entrada.nextInt();
		
		System.out.print("Insira o segundo valor: ");
		int valor2 = entrada.nextInt();
		
		int soma = valor1 + valor2;
		
		System.out.println("Soma = " + soma);
		
	}
}
