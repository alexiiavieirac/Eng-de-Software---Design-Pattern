public class Combo {
    private Burger burger;
    private Sobremesa sobremesa;
    private Bebida bebida;

    public void criarCombo(int tipo) {
        switch (tipo) {
            case 1: // Combo Master
                this.burger = new Burger("Master Burger", 25.0);
                this.bebida = new Bebida("Coca-Cola", 5.0);
                this.sobremesa = new Sobremesa("Brownie", 7.0);
                break;
            case 2: // Super Combo
                this.burger = new Burger("Super Burger", 30.0);
                this.bebida = new Bebida("Sprite", 5.0);
                this.sobremesa = new Sobremesa("Cheesecake", 8.0);
                break;
            default:
                System.out.println("Combo inválido!");
                break;
        }
    }

    private double calcularPrecoTotal() {
        double total = 0;
        if (burger != null) total += burger.preco();
        if (bebida != null) total += bebida.preco();
        if (sobremesa != null) total += sobremesa.preco();
        return total;
    }

    public void mostrarCombo() {
        System.out.println("Combo Selecionado:");
        if (burger != null) {
            burger.descricao();
            System.out.println("Preço do Burger: R$ " + burger.preco());
        }
        if (bebida != null) {
            bebida.descricao();
            System.out.println("Preço da Bebida: R$ " + bebida.preco());
        }
        if (sobremesa != null) {
            sobremesa.descricao();
            System.out.println("Preço da Sobremesa: R$ " + sobremesa.preco());
        }
        System.out.println("Total do Combo: R$ " + calcularPrecoTotal());
    }
}
