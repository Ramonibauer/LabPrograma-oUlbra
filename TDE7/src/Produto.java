public class Produto {
    String nome;
    Double preco;
    int quantidade;
    String getNome (){
        return this.nome;
    }
    Double getPreco (){
        return this.preco;
    }
    int getQuantidade (){
        return this.quantidade;
    }
    public void setNome(String nome) {
       this.nome = nome;
    }
    public void setPreco (double preco) {
        this.preco = preco;
    }
    public void setQuantidade (int quantidade){
        this.quantidade = quantidade;
    }
}
