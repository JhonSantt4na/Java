package TratamentoErro.Exercicio.VersionMid;

public class AccountMid {
    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;

    public AccountMid() {
    }

    public AccountMid(Integer number, String holder, Double balance, Double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(Double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }
    // Methods
    public void deposit(double amount){
        balance += amount;
    }

    public void withdraw(double amount){
        balance -= amount;
    }

    // Delegando a regra para a propria classe
    public String validateWithdraw(double amount){
        if( amount > getWithdrawLimit()){
            // A classe Acount não pode mexer com interface do usuario entao nao funciona o print
            return "Erro de Saque: A Quantia execede o limite de Saque";
        }
        if (amount > getBalance()) {
            return "Erro de Saque: Saldo insuficiente";
        }
        return null;
    }
}

