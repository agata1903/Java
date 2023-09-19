package exercicios.vetores;

import java.util.Locale;
import java.util.Scanner;

public class SomaMedia {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos números você vai digitar? ");
		int n = sc.nextInt();
		double vet[] = new double[n];
		
		for(int i = 0; i < n; i++) {
			sc.nextLine();
			System.out.print("Digite um número: ");
			vet[i] = sc.nextDouble();
		}
		
		double soma = 0;
		for(int i = 0; i < n; i++) {
			soma += vet[i];
		}
		
		double media = soma/ n;
		
		System.out.print("Valores: ");
		for(int i = 0; i < n; i++) {
			System.out.print(vet[i] + " ");
		}
		System.out.println();
		System.out.println("Soma: " + soma);
		System.out.println("Média: " + media);
	}
}
