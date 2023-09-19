package exercicios.estruturacondicional;

import java.util.Scanner;

public class NegativoOuNao {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		int num = entrada.nextInt();
		
		if (num > 0) {
			System.out.println("Não negativo");
		} else {
			System.out.println("Negativo");
		}
	}
}
