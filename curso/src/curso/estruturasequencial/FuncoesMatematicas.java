package curso.estruturasequencial;

import java.util.Locale;
import java.util.Scanner;

public class FuncoesMatematicas {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite um valor: ");
		double x = entrada.nextDouble();
		
		double a = Math.sqrt(x);
		System.out.println("A raiz quadrada de x é " + a);
		
		a = Math.pow(x, 2);
		System.out.println(x + "² é igual a " + a);
		
		a = Math.abs(x);
		System.out.println("O valor absoluto de x é igual a " + a);
		entrada.close();
	}
}
