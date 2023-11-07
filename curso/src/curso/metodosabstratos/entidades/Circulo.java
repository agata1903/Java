package curso.metodosabstratos.entidades;

import curso.metodosabstratos.entidades.enums.Cor;

public class Circulo extends Forma{

	private Double raio;
	
	public Circulo() {
		super();
	}
	
	public Circulo(Cor cor, Double radio) {
		super(cor);
		this.raio = radio;
	}
	
	public Double getRadio() {
		return raio;
	}

	public void setRadio(Double radio) {
		this.raio = radio;
	}

	@Override
	public double area() {
		return Math.PI * raio * raio;
	}

	
}
