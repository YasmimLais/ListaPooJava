/*
3. Classe Funcionario:
Atributos: nome, cpf, cargo, salarioMensal, departamento.
Métodos: calcularSalarioAnual(), aplicarAumento(percentual).
 */

public class Funcionario {

    String nome;
    String cpf;
    String cargo;
    double salarioMensal;
    String departamento;

    public void calcularSalarioAnual() {
        double salarioAnual = salarioMensal * 12;
        System.out.println("Salário anual: R$ " + salarioAnual);
    }

    public void aplicarAumento(double percentual) {
        salarioMensal = salarioMensal + (salarioMensal * percentual / 100);
        System.out.println("Novo salário: R$ " + salarioMensal);
    }

    public static void main(String[] args) {

        Funcionario funcionario1 = new Funcionario();
        funcionario1.nome = "Lenin";
        funcionario1.cpf = "111.111.111-11";
        funcionario1.cargo = "Desenvolvedor";
        funcionario1.salarioMensal = 10000;
        funcionario1.departamento = "Tecnologia";

        Funcionario funcionario2 = new Funcionario();
        funcionario2.nome = "Fred";
        funcionario2.cpf = "222.222.222-22";
        funcionario2.cargo = "DBA";
        funcionario2.salarioMensal = 15000;
        funcionario2.departamento = "Dados";

        funcionario1.calcularSalarioAnual();
        funcionario1.aplicarAumento(10);

        funcionario2.calcularSalarioAnual();
        funcionario2.aplicarAumento(5);
    }
}