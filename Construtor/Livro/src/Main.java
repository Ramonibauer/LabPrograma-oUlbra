public class Main {
    public static void main(String[] args) {
        Livro l1 = new Livro("Loney","Andrew Michael", 39);
        Livro l2 = new Livro("Emma", "Jane Austen");
        System.out.println("Titulo:" +l1.getTitulo() + " Autor:"+ l1.getAutor()+ " preço:"+l1.getPreco());
        System.out.println("Titulo:" +l2.getTitulo() + " Autor:"+ l2.getAutor()+ " preço:"+l2.getPreco());
    }
}