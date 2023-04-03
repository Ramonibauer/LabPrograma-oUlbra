public class Banco {
        public int numeroDaConta;
        public double saldo;
        public String titular;

        public void depositar(double valor){
            saldo += valor;
            System.out.println("Depósito de R$: " + valor+ " realizado na conta: " + numeroDaConta);
        }
        public void sacar(double valor){
            if (saldo < valor){
                System.out.println("Saldo insuficiente para realizar o saque!");
            }else {
                System.out.println("Saque de R$: " + valor+ " realizado da conta: " + numeroDaConta);

            }
        }
        public void trasnferir(double valor, Banco contaDestino){
            if (saldo < valor){
                System.out.println("Saldo insuficiente para realizar a tranferência! ");

            }else {
                saldo -= valor;
                contaDestino.saldo += valor;
                System.out.println("Transferencia de R$: " + valor + " realizada da conta: " + numeroDaConta + " para conta: " + contaDestino.numeroDaConta);
            }
        }
}
