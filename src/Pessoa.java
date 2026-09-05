
public class Pessoa {

    String nome;
    String cpf;
    String email;
    String telefone;
    String dataNascimento;

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("E-mail: " + email);
        System.out.println("Telefone: " + telefone);
        System.out.println("Nascimento: " + dataNascimento);
    }

    public void validarCpf() {
        if (cpf != null && cpf.length() >= 11) {
            System.out.println("CPF informado.");
        } else {
            System.out.println("CPF inválido.");
        }
    }

    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "Eva";
        pessoa1.cpf = "11111111111";
        pessoa1.email = "Eva@email.com";
        pessoa1.telefone = "99999-1111";
        pessoa1.dataNascimento = "01/01/0001";

        Pessoa pessoa2 = new Pessoa();
        pessoa2.nome = "Adão";
        pessoa2.cpf = "22222222222";
        pessoa2.email = "Adao@email.com";
        pessoa2.telefone = "99999-2222";
        pessoa2.dataNascimento = "01/01/0001";

        pessoa1.exibirDados();
        pessoa1.validarCpf();

        pessoa2.exibirDados();
        pessoa2.validarCpf();
    }
}