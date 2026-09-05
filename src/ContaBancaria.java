/*2. Classe ContaBancaria:
Atributos: numero, titular, saldo, agencia, tipoConta.
Métodos: depositar(valor), sacar(valor).
*/

public class ContaBancaria {

    String numero;
    String titular;
    double saldo;
    String agencia;
    String tipoConta;

    public void depositar(double valor) {
        saldo = saldo + valor;
        System.out.println("Depósito feito");
        System.out.println("Saldo atual: R$ " + saldo);
    }

    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo = saldo - valor;
            System.out.println("Saque realizado");
            System.out.println("Saldo atual: R$ " + saldo);
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    public static void main(String[] args) {

        ContaBancaria conta1 = new ContaBancaria();
        conta1.numero = "001";
        conta1.titular = "Juliana";
        conta1.saldo = 100000;
        conta1.agencia = "123";
        conta1.tipoConta = "Corrente";

        ContaBancaria conta2 = new ContaBancaria();
        conta2.numero = "002";
        conta2.titular = "Georgia";
        conta2.saldo = 2500;
        conta2.agencia = "456";
        conta2.tipoConta = "Poupança";

        conta1.depositar(500);
        conta1.sacar(200);

        conta2.depositar(1000);
        conta2.sacar(500);
    }
}
