package exercicios.listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import exercicios.listas.entidades.Funcionario;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Funcionario> list = new ArrayList<>();
		System.out.println("Quantos funcionários serão registrados? ");
		int n = sc.nextInt();
		
		for( int i = 0; i < n; i++) {
			System.out.println("Funcionário " +(i +1) + ": ");
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			System.out.println("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.println("Salario: ");
			Double salario = sc.nextDouble();
			
			Funcionario func = new Funcionario(id, nome, salario);
			list.add(func);
			
		}
		System.out.println("Insira o id do funcionario que vai receber aumento:");
		int idsalario = sc.nextInt();
		Integer pos = posicao(list, idsalario);
		if(pos == null) {
			System.out.println("Id não existe!");
		} else {
			System.out.println("Insira a porcentagem: ");
			double porcentagem = sc.nextDouble();
			list.get(pos).aumentarSalario(porcentagem);
		}
		
		System.out.println("Lista de funcionarios: ");
		for(Funcionario func : list) {
			System.out.println(func);
		}
		
		sc.close();
	}
	
	public static Integer posicao(List<Funcionario> list, int id) {
		for(int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}
}
