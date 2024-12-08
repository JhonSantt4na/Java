package _12_DataBase_JDBC.AlgebraRelacional;

public class OperacoesBasicas {
	
	//Produto Cartesiano = Resultado da combinação de cada registro de categoria com cada registro de produto e o resultado e uma tabela
	// Sendo todos com todos
	
	//ex 01 : ( junta tudos os produtos com todas as categorias)
			// SELECT * FROM    -> Restrição
			// PRODUCT, CATEGORY -> Produto Cartesiano
	
	//Junção (produto Cartesiano + Restrição de chaves correspondentes) =
	// Somente os que teria a categoria correta
	
	//ex 01 : (Quando uma chave extrangeira == a chave primaria)
			//SELECT *
			//FROM PRODUCT, CATEGORY -> Pega a tabela especifica
			//WHERE
			//PRODUCT.CATEGORY_ID = CATEGORY.ID
	// return = uma tabela com somentes os dados que tem as chaves iguais

	// ex 02 : ( cria uma tabela juntando a cat com os produtos, porem somente os que as chaves são iguais)
		// SELECT *
		// FROM PRODUCT
		// INNER JOIN CATEGORY cat  -> Junta as tabelas
		// ON PRODUCT.CATEGORY_ID = cat.ID
	
	// Restrição = Somente os produtos especificos
	
	// Ex 01 :(Cria uma tabela restrigindo os produtos com a categoria especifica )
		// SELECT *
		//FROM PRODUCT
		//INNER JOIN CATEGORY cat ON PRODUCT.CATEGORY_ID = cat.ID
		//WHERE CATEGORY.NAME = 'Computers'      -> where faz a restrição
	
	// Projeção = Quando so queremos um produto porem com alguma colunas
	
	// ex 01: (Pojetamos somente o nome de uma categoria)
		// SELECT PRODUCT.*, CATEGORY.NAME -> Projeção de somente tals colunas
		//FROM PRODUCT
		//INNER JOIN CATEGORY cat ON PRODUCT.CATEGORY_ID = cat.ID
		//WHERE CATEGORY.NAME = 'Computers'
	// 5%aw&qDDd?V-     // DBSantt4na
}

