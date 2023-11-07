package curso.metodosabstratos;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import curso.metodosabstratos.entidades.Circulo;
import curso.metodosabstratos.entidades.Forma;
import curso.metodosabstratos.entidades.Retangulo;
import curso.metodosabstratos.entidades.enums.Cor;

public class ProgramaMetodosAbs {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Forma> list = new ArrayList<>();
		
		System.out.println("Insira o numero de formas: ");
		int n = sc.nextInt();
		for(int i = 1; i <= n; i++) {
			System.out.println("Dados da forma " + i + ": ");
			System.out.println("Circulo ou retangulo? ");
			char forma = sc.next().charAt(0);
			System.out.println("Cor: ");
			Cor cor = Cor.valueOf(sc.next());
			if(forma == 'r') {
				System.out.println("Largura: ");
				double largura = sc.nextDouble();
				System.out.println("Altura: ");
				double altura = sc.nextDouble();
				list.add(new Retangulo(cor, largura, altura));
			}
			else {
				System.out.println("Raio: ");
				double raio = sc.nextDouble();
				list.add(new Circulo(cor, raio));
			}
		}
		System.out.println("Areas das formas:");
		for(Forma forma : list) {
			System.out.printf("%.2f%n", forma.area());
		}
		sc.close();
	}
}
