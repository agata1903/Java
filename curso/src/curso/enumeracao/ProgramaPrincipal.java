package curso.enumeracao;

import java.util.Date;

import curso.enumeracao.entidades.StatusPedido;
import curso.enumeracao.entidades.Pedido;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		
		Pedido pedido = new Pedido(1000, new Date(),StatusPedido.AGUARDANDO_PAGAMENTO);
		
		System.out.println(pedido);
		
		StatusPedido sp1 = StatusPedido.ENTREGUE;
		
		StatusPedido sp2 = StatusPedido.valueOf("ENTREGUE");
		
		System.out.println(sp1);
		System.out.println(sp2);
	}

}
