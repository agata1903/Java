package curso.poliformismo.entidades;

public class ContaComercial extends Conta{

private Double limiteEmprestimo;
	
	public ContaComercial() {
		super();
	}

	public ContaComercial(Integer numero, String titular, Double saldo, Double limiteEmprestimo) {
		super(numero, titular, saldo);
		this.limiteEmprestimo = limiteEmprestimo;
	}

	public Double getLimiteEmprestimo() {
		return limiteEmprestimo;
	}

	public void setLimiteEmprestimo(Double limiteEmprestimo) {
		this.limiteEmprestimo = limiteEmprestimo;
	}
	
	public void emprestimo(double quantia) {
		if (quantia <= limiteEmprestimo) {
			saldo += quantia - 10.0;
		}
	}
	@Override
	public void saque(double quantia) {
		super.saque(quantia);
		saldo -= 2.0;
	}
}

