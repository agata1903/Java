package exercicios.estruturasequencial;

import java.util.Scanner;

public class AreaPreco {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double base = entrada.nextDouble();
		double altura = entrada.nextDouble();
		
		double area = base * altura;
		
		double precoMetro = entrada.nextDouble();
		double precoFinal = area * precoMetro;
		
		System.out.printf("Área: %.2f m²%n", area);
		System.out.printf("Total: R$%.2f", precoFinal);
	}
}
