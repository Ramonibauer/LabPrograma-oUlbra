public class Livro {
    private String titulo;
    private String autor;
    private int preco;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    public Livro (String titulo, String autor, int preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;
    }
    public Livro (String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.preco = 100;
    }
}
