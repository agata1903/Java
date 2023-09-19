package exercicios.estruturasrepetitivas;

import java.util.Scanner;

public class ForDivisao {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			
			int a = sc.nextInt();
			int b = sc.nextInt();
			if (a != 0 && b != 0) {
				double divisao = (double)a / b;
				System.out.printf("%.1f",divisao);
			} else {
				System.out.println("Divisão impossível");
			}
			
		}
	}
}
