package exercicios.poo2;

import java.util.Locale;
import java.util.Scanner;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Funcionario func = new Funcionario();
		
		System.out.print("Nome: ");
		func.nome = sc.nextLine();
		System.out.print("Salário bruto: ");
		func.salarioBruto = sc.nextDouble();
		System.out.print("Imposto: ");
		func.imposto = sc.nextDouble();
		
		System.out.println("Funcionário(a): " + func);
		
		System.out.print("Qual a porcentagem deseja aumentar o salário? ");
		double porcentagem = sc.nextDouble();
		func.aumentoSalario(porcentagem);
		System.out.println("Dados do funcionário atualizados: " + func);
	}

}
