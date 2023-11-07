package curso.poliformismo;

import curso.poliformismo.entidades.Conta;
import curso.poliformismo.entidades.ContaPoupanca;

public class ProgramaPolimorfismo {

	public static void main(String[] args) {
		
		Conta a = new Conta(346, "Ágata", 2000.0);
		Conta b = new ContaPoupanca(485, "Nuno", 2000.0, 0.01);
		
		a.saque(100.0);
		b.saque(100.0);
		
		System.out.println(a.getSaldo());
		System.out.println(b.getSaldo());
	}
}
