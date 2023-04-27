public class Main {
    public static void main(String[] args) {
        Estudante e1 = new Estudante("Ramoni", 12345, "ADM");
        Estudante e2 = new Estudante("Kemeli", 54321);
        System.out.println("Nome:" +e1.getNome() + " Autor:"+ e1.getMatricula()+ " preço:"+e1.getCurso());
        System.out.println("Nome:" +e2.getNome() + " Autor:"+ e2.getMatricula()+ " preço:"+e2.getCurso());
    }
}