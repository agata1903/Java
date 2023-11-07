package curso.enumeracao.entidades;

import java.util.Date;

public class Pedido {

	private Integer Id;
	private Date instante;
	private StatusPedido status;
	
	public Pedido() {
		
	}

	public Pedido(Integer id, Date instante, StatusPedido status) {
		Id = id;
		this.instante = instante;
		this.status = status;
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public Date getInstante() {
		return instante;
	}

	public void setInstante(Date instante) {
		this.instante = instante;
	}

	public StatusPedido getStatus() {
		return status;
	}

	public void setStatus(StatusPedido status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Pedido [Id=" + Id + ", instante=" + instante + ", status=" + status + "]";
	}
	
}
