package exercicios.estruturacondicional;

import java.util.Scanner;

public class MultiplosOuNao {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Insira o primeiro valor: ");
		int valor1 = entrada.nextInt();
		
		System.out.print("Insira o segundo valor: ");
		int valor2 = entrada.nextInt();
		
		if (valor1 % valor2 == 0 || valor2 % valor1 == 0) {
			System.out.println("São múltiplos");
		} else {
			System.out.println("Não são múltiplos");
		}
	}
}
