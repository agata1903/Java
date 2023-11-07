package curso.heranca;

import curso.heranca.entidades.Conta;
import curso.heranca.entidades.ContaComercial;
import curso.heranca.entidades.ContaPoupanca;

public class ProgramaHeranca {

	public static void main(String[] args) {
		
		Conta c = new Conta(123, "Ágata", 1000.0);
		c.saque(100.0);
		System.out.println(c.getSaldo());
		
		Conta c2 = new ContaPoupanca(345, "Ana", 1000.0, 0.01);
		c2.saque(200.0);
		System.out.println(c2.getSaldo());
		
		Conta c3 = new ContaComercial(867, "José", 1000.0, 500.0);
		c3.saque(300.0);
		System.out.println(c3.getSaldo());
	}
}
