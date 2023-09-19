package curso.estruturascondicionais;

import java.util.Scanner;

public class OperadorTernario {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double preco = 30.0;
		double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;
	
		System.out.println(desconto);
		
		entrada.close();
	}
}
