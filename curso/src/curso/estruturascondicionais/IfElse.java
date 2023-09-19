package curso.estruturascondicionais;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Que horas são?");
		int hora = entrada.nextInt();
		
		if (hora < 12) {
			System.out.println("Bom dia");
		} else {
			if (hora > 12 && hora < 18) {
				System.out.println("Boa tarde");
			}
			else {
				System.out.println("Boa noite");
			}
		}
	}
}
