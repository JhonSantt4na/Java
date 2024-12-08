package _11_1_ProgramacaoFuncional.Consumer.Ultil;

import _11_1_ProgramacaoFuncional.Consumer.Entites.Product;

import java.util.function.Consumer;

public class PriceUpdate implements Consumer<Product> {
	
	@Override
	public void accept(Product p) {
		p.setPrice(p.getPrice() * 1.1);
	}
}
