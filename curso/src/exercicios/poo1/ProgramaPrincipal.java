package exercicios.poo1;

import java.util.Locale;
import java.util.Scanner;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Retangulo retangulo = new Retangulo();
		
		System.out.print("Insira a largura e altura do retângulo: ");
		retangulo.largura = sc.nextDouble();
		retangulo.altura = sc.nextDouble();
		
		System.out.println(retangulo);
		
		sc.close();
	}

}
