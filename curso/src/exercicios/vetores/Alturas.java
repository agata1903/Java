package exercicios.vetores;

import java.util.Locale;
import java.util.Scanner;

import exercicios.vetores.entidades.Pessoa;

public class Alturas {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serão digitadas? ");
		int n = sc.nextInt();
		Pessoa[] vet = new Pessoa[n];
		
		for(int i = 0; i < n; i++) {
			System.out.println("Dados da " + (i+1) + "ª pessoa: ");
			sc.nextLine();
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			System.out.print("Altura: ");
			double altura = sc.nextDouble();
			vet[i] = new Pessoa(nome, idade, altura);
		
		}
		double soma = 0;
		for(int i = 0; i < n; i ++) {
			soma += vet[i].getAltura();
		}
		
		double media = soma / n;
		
		System.out.printf("Média das alturas: %.2f%n", media);
		
		int c = 0;
		for(int i = 0; i < n; i++) {
			if(vet[i].getIdade() < 16) {
				c++;			
			}
		}
		double porc = c * 100/n;
		System.out.println("Porcentagem das pessoas com menos de 16 anos: " + porc + "%");
		
		sc.close();
	}

}
