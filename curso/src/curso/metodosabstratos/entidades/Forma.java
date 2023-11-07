package curso.metodosabstratos.entidades;

import curso.metodosabstratos.entidades.enums.Cor;

public abstract class Forma {

	private Cor cor;
	
	public Forma() {
		
	}

	public Forma(Cor cor) {
		super();
		this.cor = cor;
	}

	public Cor getCor() {
		return cor;
	}

	public void setCor(Cor cor) {
		this.cor = cor;
	}
	
	public abstract double area();
}
