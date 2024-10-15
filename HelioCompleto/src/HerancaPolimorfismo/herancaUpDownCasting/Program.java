package HerancaPolimorfismo.herancaUpDownCasting;

public class Program {
	public static void main(String[] args) {
		
		Account acc = new Account(1001, "Alex", 0.0);
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);
		
		// UPCASTING
		Account acc1 = bacc; // Funciona corretamente com todos os parametros
		// Pois a businessAccount tambem é uma conta entao podemos atribuir o objeto pra Account ex:
		Account acc2 = new BusinessAccount(1003, "Maicon", 0.0, 1500.0);
		// Funciona normalmente tambem
		Account acc3 = new SavingsAccount(1004, "Julia", 0.0, 2500.0);
		// Ou seja podemos pegar qualquer objeto das subs classes e colocar na Super Classe pois qualquer sub classe
		// tmb é uma classe
		
		// DOWNCASTING
		//BusinessAccount acc4 = acc2; // return um erro. mesmo instanciando uma businessAccount o tipo da acc2 é Account
		BusinessAccount acc4 = (BusinessAccount) acc2; // Desta forma funciona normalmente;
		acc4.loan(100.0); // aqui sim temos acesso a operação loan coisa que a acc2 por ser Account não tem
	
		//BusinessAccount acc5 = (BusinessAccount) acc3; // Problema que ela foi instanciada como Savings, mais o
		// compilador não entende e so tem erro na hora da execução;
		
		// Para evitar o erro primeiro agente testa o acc3 para ver se é do tiṕ que vamoas converter;
		// sendo assim usamos o instanceof ex:
		// se acc3 for intancia de BusinessAccount podemos fazer o castings
		if (acc3 instanceof BusinessAccount){
			BusinessAccount acc5 = (BusinessAccount) acc3;
			acc5.loan(200.0);
			System.out.println("Loan!");
		}
		
		if (acc3 instanceof SavingsAccount){
			SavingsAccount acc5 = (SavingsAccount) acc3;
			acc5.updateBalance();
			System.out.println("Updated !");
		}
		
		// Como o primeiro if falha ele pula pra o segundo ele faz o downCastinf e executa o metodo updated
	}
}
