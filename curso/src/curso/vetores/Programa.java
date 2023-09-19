package curso.vetores;

import java.util.Locale;
import java.util.Scanner;

import curso.vetores.entidades.Produto;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		Produto[] vet = new Produto[n];
		
		for(int i = 0; i<n; i++) {
			sc.nextLine();
			String nome = sc.nextLine();
			double preco = sc.nextDouble();
			vet[i] = new Produto(nome, preco);
		}
		double soma = 0.0;
		for(int i = 0; i<n; i++) {
			soma += vet[i].getPreco();
		}
		double media = soma/ n;
		
		System.out.println(media);
		sc.close();
	}

}
