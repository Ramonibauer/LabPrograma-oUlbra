public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto ("01"+"Camiseta"+"30,00");
        Produto produto2 = new Produto ("02"+"Calça"+"90,00");
        Produto produto3 = new Produto ("03"+"Casaco"+"70,00");

        Loja minhaloja = new Loja ("minha loja!");

        minhaloja.adicionarProduto(produto1);
        minhaloja.adicionarProduto(produto2);
        minhaloja.adicionarProduto(produto3);
        System.out.println("Lista dos produtos da " + minhaloja.produto1.getNome());
        minhaloja.listarProdutos();

        System.out.println("Total da venda do "+ minhaloja.produto1.getNome() + "R$: " + minhaloja.getClass());
    }
}