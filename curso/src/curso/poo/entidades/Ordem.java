package curso.poo.entidades;

import java.util.Date;

public class Ordem {

	private Date date;
	private Produto produto;
	public Ordem(Date date, Produto produto) {
		this.date = date;
		this.produto = produto;
		this.produto.nome = "TV";
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
	
}
