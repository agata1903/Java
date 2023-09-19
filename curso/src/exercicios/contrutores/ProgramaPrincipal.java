package exercicios.contrutores;

import java.util.Locale;
import java.util.Scanner;

import exercicios.contrutores.entidades.Conta;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Conta c = new Conta();
		
		System.out.print("Insira o número da conta: ");
		int conta = sc.nextInt();
		System.out.print("Insira o nome do titular: ");
		sc.nextLine();
		String titular = sc.nextLine();
		System.out.println("Haverá deposito inicial? Digite s ou n: ");
		char resposta = sc.next().charAt(0);
		if (resposta == 's') {
			System.out.print("Insira o valor do depósito inicial:");
			double depInicial = sc.nextDouble();
			c = new Conta(conta, titular, depInicial);
		} else {
			c = new Conta(conta, titular);
		}
		
		System.out.println("Dados da conta: \n" + c);
		
		System.out.println("Insira um valor para depositar: ");
		double deposito = sc.nextDouble();
		c.deposito(deposito);
		System.out.println("Dados da conta atualizados: \n" + c);
		
		System.out.println("Insira um valor para sacar: ");
		double saque = sc.nextDouble();
		c.saque(saque);
		System.out.println("Dados da conta atualizados: \n" + c);
		sc.close();
	}

}
