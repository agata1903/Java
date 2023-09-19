package exercicios.vetores;

import java.util.Locale;
import java.util.Scanner;

public class Negativos {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos números quer digitar? ");
		int a = sc.nextInt();
		int vet[] = new int[a];
		
		for(int i = 0; i<a; i++) {
			System.out.print("Digite um número: ");
			vet[i] = sc.nextInt();
		}
		
		int negativo = 0;
		System.out.println("Números negativos: ");
		for(int i = 0; i < a; i++) {
			if(vet[i] < 0) {
				System.out.println(vet[i]);
			}
		}
	}
}
