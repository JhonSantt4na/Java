package _11_1_ProgramacaoFuncional.Predicate.Util;

import _11_1_ProgramacaoFuncional.Predicate.Entities.Product;

import java.util.function.Predicate;

public class ProductPredicate implements Predicate<Product> {
	
	@Override
	public boolean test(Product p) {
		return p.getPrice() >= 100.0;
	}
}
