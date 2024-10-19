package HerancaPolimofismo.Herancaex;

public class BusinessAccount extends Account{
	// extends => a Clase BusinessAccount herda todos os dados e atributos da Account
	//Ex: Se instanciamos um obj BusinessAccount podemos usar os metodos da conta Account;
	//public static void main(String[] args) {
		//BusinessAccount account = new BusinessAccount();
		//account.deposit(); // Sendo o deposit metodo da classe Account;
		
	//}
	// Criando os atributos e metodos que vamos diferenciar uma classe da outra;
	private Double loanLimit;
	public BusinessAccount(){
		super(); //Bom usar, para se resguardar caso tenha logica no construtor padrão da SuperClasse
	}
	
	// Quando criamos o construtor mostra todos os contrutores da classe account
	// e ai podemos escolher o construtor que temos os atributos;
	// sendo assim criando um construtor com os atributos de ambas as classes
	public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance); // O super indica que esta pegando os atributo da classe base
		this.loanLimit = loanLimit;
	}
	
	public Double getLoanLimit() {
		return loanLimit;
	}
	
	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}
	
	public void loan(double amount){
		if (amount <= loanLimit) { // Ou seja so vamos emprestar caso tenha limite
			balance += amount - 10.0; // Para o balance ser visivel em outra classe mais não publico usamos o protected
		}
		// Relação é um
		// Generalização / Especialização
		// SuperClasse (ClasseBase) / Subclasse (ClaseDerivada)
		// heranca / extensão
		// heranca é uma associação entre classe e não objetos
	}
	
	@Override
	public void withdraw(double amount){
		super.withdraw(amount);
		balance -= 2.0 ;
	}
	
}
