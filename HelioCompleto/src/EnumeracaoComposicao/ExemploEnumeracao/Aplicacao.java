package EnumeracaoComposicao.ExemploEnumeracao;

import EnumeracaoComposicao.ExemploEnumeracao.Enum.StatusOrder;
import ExemploEnumeracao.entities.Order;

import java.util.Date;

public class Aplicacao {
  public static void main(String[] args) {
	// Instanciando a nova Order
	Order order = new Order(1080, new Date(), StatusOrder.PENDING_PAYMENT);
	System.out.println(order);
	
	// Convertendo String Para Enum :
	StatusOrder os1 = StatusOrder.DELIVERED;
	StatusOrder os2 = StatusOrder.valueOf("DELIVERED");
	// >>  ValueOf() = Transformando Objeto em String;
  }
}
