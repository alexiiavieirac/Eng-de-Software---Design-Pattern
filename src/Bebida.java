public class Bebida implements Produto {
    private String bebida;
    private double preco;

    public Bebida(String bebida, double preco) {
        this.bebida = bebida;
        this.preco = preco;
    }

    @Override
    public void descricao() {
        System.out.println("Bebida: " + bebida);
    }

    @Override
    public double preco() {
        return preco;
    }

    public String getBebida() {
        return bebida;
    }
}
