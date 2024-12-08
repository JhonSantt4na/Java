package _08_Arquivos.Exercicio;

public class Produto {
    private String name;
    private Double price;
    private Integer qty;

    // Constructors
    public Produto(String name, Double price, Integer qty) {
        this.name = name;
        this.price = price;
        this.qty = qty;
    }
    // Getters && Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getQty() {
        return qty;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }
    // Methods
    public double total(){
        return price * qty;
    }
}
