package curso.funcoes;

import java.util.Scanner;

public class MaiorNumero {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Insira os números: ");
		int a = entrada.nextInt();
		int b = entrada.nextInt();
		int c = entrada.nextInt();
		
		int maior = max(a, b, c);
		
		showResult(maior);
		entrada.close();
	}
	
	public static int max(int x, int y, int z) {
		int aux;
		if(x > y && x > z) {
			aux = x;
		}
		else if (y > z) {
			aux = y;
		}
		else {
			aux = z;
		}
		return aux;
	}
	public static void showResult(int value) {
		System.out.println("Maior:" + value);
		
	}
}
