package _05_EnumeracaoComposicao.ExemploEnums;

import java.util.Date;

public class Principal {
	public static void main(String[] args) {
		
		Integer id = 10890;
		Date dat = new Date();
		EnumsExemplo stts = EnumsExemplo.PENDING_PAYMENT;
		
		EntitiesPedido pedido = new EntitiesPedido(id, dat, stts);
		System.out.println(pedido);
	}
}

// Convertendo String para Enum;
// OrderStatus.DELIVERED  >> Para String
// OrderStatus.valueOf("DELIVERED") >> Para Objeto

// Desenho é o mesmo da classe divido em 3,
// Porem com uma especificação < enum >