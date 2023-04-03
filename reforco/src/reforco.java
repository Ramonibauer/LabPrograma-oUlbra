public class reforco {
    public static void main(String[] args) {
            Carro meuCarro = new Carro();
            meuCarro.marca = "Chevrolet";
            meuCarro.modelo = "Onix";
            meuCarro.ano = 2012;
            meuCarro.cor = "branco";
            meuCarro.acelerar();
            meuCarro.frear();

            Calculadora calculadora = new Calculadora();
            calculadora.numberOne= 10;
            calculadora.numberTwo= 2;
            System.out.println(calculadora.soma());
            System.out.println(calculadora.subtrair());
            System.out.println(calculadora.multiplicar());
            System.out.println(calculadora.dividir());

            Retangulo retangulo = new Retangulo();
            retangulo.base= 4;
            retangulo.altura= 5;
            System.out.println(retangulo.calcularArea());
            System.out.println(retangulo.calcularPerimetro());

            Banco minhaConta = new Banco();
            minhaConta.numeroDaConta = 12345;
            minhaConta.saldo = 1000.0;
            minhaConta.titular = "Cezar";

            Banco outraConta = new Banco();
            outraConta.numeroDaConta = 67890;
            outraConta.saldo = 500.0;
            outraConta.titular = "Anita";
    }
}
