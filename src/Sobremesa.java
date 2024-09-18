public class Sobremesa implements Produto {
    private String sobremesa;
    private double preco;

    public Sobremesa(String sobremesa, double preco) {
        this.sobremesa = sobremesa;
        this.preco = preco;
    }

    @Override
    public void descricao() {
        System.out.println("Sobremesa: " + sobremesa);
    }

    @Override
    public double preco() {
        return preco;
    }

    public String getSobremesa() {
        return sobremesa;
    }
}
