package TratamentoErro.versaoBoa.model.Exceptions;

import java.io.Serial;

public class DoMainException extends Exception{
	// Pode extender a classes
	// extends Exception: o compilador obriga a tratar igual a "parse"
	// extends RuntimeException: o compilador não obriga a tratar
	
	@Serial
	private static final long serialVersionUID = 1L;
	
	// construtor q recebe uma string e repassa para o contrutor da super
	// permetindo que possa instanciar a excecions personalizada passando uma msg pra ela
	// e com isso a msg fica armazenada dentro da minha exceção
	
	public DoMainException(String msg){
		super(msg);
	}
	
	
	
}
