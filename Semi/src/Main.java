public class Main {
    public static void main(String[] args) {
        Circulo circulo = new Circulo();
        circulo.raio = 8;
        System.out.println(circulo.calcularArea());
        System.out.println(circulo.calcularPerimetro());

        Livro meuLivro = new Livro();
        meuLivro.titulo = "É assim que acaba";
        meuLivro.autor = "Colleen Hoover";
        meuLivro.editora = "Galera Record";
        meuLivro.numeroPag = 351;
        meuLivro.exibirDetalhes();

        Animal meuAnimal = new Animal();
        meuAnimal.nome= "Papagaio";
        meuAnimal.idade = 2;
        meuAnimal.especie = "Verdadeiro";
        meuAnimal.emitir();
        meuAnimal.dormir();
    }
}