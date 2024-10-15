package HerancaPolimorfismo.herancaUpDownCasting;

public class BusinessAccount extends Account {
	// extende > Define que vai ter todos os dados e comportamentos da Account
	// Agr vamos acresentar os metodos que vao diferenciar as duas
	private Double loanLimit;
	
	public BusinessAccount(){
		// Podemos usar o super aqui. Caso tenha logica no construtor padrão
		// sera usado tambem na Subclasse
	}
	
	// Quando formos criar os Contrutores de uma classe lembre que elas tem os mesmo atributos
	// das outra classe;
	
	public BusinessAccount(Double loanLimit) {
		this.loanLimit = loanLimit;
	}
	
	public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance); // Super informa que estamos pegando dados da superClasse
		this.loanLimit = loanLimit;
	}
	
	public Double getLoanLimit() {
		return loanLimit;
	}
	
	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}
	
	public void loan(double amount) {
		if(amount <= loanLimit){ // so vamos acresentar se o valor for do tamanho do limite
			deposit(amount);
		}
	}
}
