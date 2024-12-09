package _12_DataBase_JDBC.DAO;

public class DataAccessObject {
	// Ideia geral do padrão DAO:
	//
	//
	//
	//Para cada entidade, haverá um objeto responsável por fazer acesso a dados relacionado a esta
	//entidade. Por exemplo:
	//o Cliente: ClienteDao
	//o Produto: ProdutoDao
	//o Pedido: PedidoDao
	//Cada DAO será definido por uma interface. pq o acesso a dados podemos mudar de banco de dados
	//A injeção de dependência pode ser feita por meio do padrão de projeto Factory sendo ele responsavel por instanciar as implementações do DAO
}
