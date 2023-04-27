public class Main {
    public static void main(String[] args) {
        Cachorro c1 = new Cachorro ("bob","vira lata",19);
        Cachorro c2 = new Cachorro ("Mel", "caramelo");
        System.out.println("Nome:" +c1.getNome() + " Raça:"+ c1.getRaca()+ " idade:"+c1.getIdade());
        System.out.println("Nome:" +c2.getNome() + " Raça:"+ c2.getRaca()+ " idade:"+c2.getIdade());
    }
}
