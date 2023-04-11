public class Loja {
    Produto produto1;
    Produto produto2;
    Produto produto3;
    public void adicionarProduto(Produto produto) {
        if (produto1 == null) {
            produto1 = produto;
        } else if (produto2 == null) {
            produto2 = produto;
        } else if (produto3 == null) {
            produto3 = produto;
        }
    }
    public void removerProduto(Produto produto) {
        if (produto1 == produto) {
            produto = null;
        } else if (produto2 == produto) {
            produto = null;
        } else if (produto3 == produto) {
            produto = null;
        }
    }
    public void listarProdutos(){
            System.out.println(produto1.getNome()+produto1.getPreco()+produto1.getQuantidade());
            System.out.println(produto2.getNome()+produto2.getPreco()+produto2.getQuantidade());
            System.out.println(produto3.getNome()+produto3.getPreco()+produto3.getQuantidade());
    }
    public void venderProduto(Produto produto, int quantidade){
        if  (produto1.getQuantidade() < quantidade && produto1 !=null){
            produto1.setQuantidade(produto1.getQuantidade() - quantidade);
        } else if (produto2.getQuantidade() < quantidade && produto2 !=null){
                produto2.setQuantidade(produto2.getQuantidade() - quantidade);
        } else if (produto3.getQuantidade() < quantidade && produto3 !=null) {
                produto3.setQuantidade(produto1.getQuantidade() - quantidade);
        } else {
            System.out.println("Sem estoque.");
        }
    }
    public void adicionarEstoque(Produto produto, int quantidade){
        if  (produto1.getQuantidade() < quantidade && produto1 !=null){
            produto1.setQuantidade(produto1.getQuantidade() + quantidade);
        } else if (produto2.getQuantidade() < quantidade && produto2 !=null){
            produto2.setQuantidade(produto2.getQuantidade() + quantidade);
        } else if (produto3.getQuantidade() < quantidade && produto3 !=null) {
            produto3.setQuantidade(produto1.getQuantidade() + quantidade);
        } else {
            System.out.println("Incluido no estoque.");
        }
    }
}



