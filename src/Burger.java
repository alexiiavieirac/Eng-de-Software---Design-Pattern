public class Burger implements Produto {
    private String burger;
    private double preco;

    public Burger(String burger, double preco) {
        this.burger = burger;
        this.preco = preco;
    }

    @Override
    public void descricao() {
        System.out.println("Burger: " + burger);
    }

    @Override
    public double preco() {
        return preco;
    }

    public String getBurger() {
        return burger;
    }
}
