package curso.classeabstrata;

import java.util.ArrayList;
import java.util.List;

import curso.classeabstrata.entidades.Conta;
import curso.classeabstrata.entidades.ContaComercial;
import curso.classeabstrata.entidades.ContaPoupanca;

public class ProgramaAbstrata {

	public static void main(String[] args) {
		
		List<Conta> list = new ArrayList<>();
		list.add(new ContaPoupanca(1001, "Ágata", 500.00, 0.01));
		list.add(new ContaComercial(3495, "Nuno", 500.00, 500.0));
		
		double soma = 0.0;
		for (Conta c : list) {
			soma += c.getSaldo();
		}
		System.out.printf("Saldo total: %.2f%n", soma);
		
		for (Conta c : list) {
			c.deposito(10.0);
		}
		for (Conta c : list) {
			System.out.printf("Saldo atualizado para conta %d: %.2f%n", c.getNumero(), c.getSaldo());
		}
	}

}
