public class Main {
    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado();
        quadrado.lado = 2;
        quadrado.calulcarArea();
        double resultado1 = quadrado.calulcarArea();
        System.out.println(resultado1);
    
        Trapezio trapezio = new Trapezio();
        trapezio.altura=2;
        trapezio.B=2;
        trapezio.b=2;
        trapezio.calulcarArea();
        double resultado2 = trapezio.calulcarArea();
        System.out.println(resultado2);

        Cicunferencia cicunferencia = new Cicunferencia();
        cicunferencia.raio = 2;
        cicunferencia.calulcarArea();
        double resultado3 = cicunferencia.calulcarArea();
        System.out.println(resultado3);
        
        Triangulo triangulo = new Triangulo();
        triangulo.altura = 2;
        triangulo.base = 3;
        triangulo.calulcarArea();
        double resultado4 = triangulo.calulcarArea();
        System.out.println(resultado4);
    }
}
