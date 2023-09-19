package curso.estruturasrepetitivas;

import java.util.Scanner;

public class EstruturaWhile {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int x = entrada.nextInt();
		int soma = 0;
		
		while (x != 0) {
			soma += x;
			x = entrada.nextInt();
			
			if (x == 0) {
				System.out.println("Fim do programa!");
			}
		}
		System.out.println("Soma: "+ soma);
		entrada.close();
	}
}
