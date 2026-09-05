/*
4. Classe Estudante:
Atributos: nome, matricula, curso, idade, notaMedia.
Métodos: registrarNota(valor), verificarSituacao() (ex:
aprovado/reprovado).
*/


public class Estudante {

    String nome;
    String matricula;
    String curso;
    int idade;
    double notaMedia;

    public void registrarNota(double valor) {
        notaMedia = valor;
        System.out.println("Nota : " + notaMedia);
    }

    public void verificarSituacao() {
        if (notaMedia >= 7) {
            System.out.println(nome + " APROVADO!");
        } else {
            System.out.println(nome + " REPROVADO!");
        }
    }

    public static void main(String[] args) {

        Estudante estudante1 = new Estudante();
        estudante1.nome = "Pedro";
        estudante1.matricula = "2026001";
        estudante1.curso = "ADS";
        estudante1.idade = 20;
        estudante1.notaMedia = 0;

        Estudante estudante2 = new Estudante();
        estudante2.nome = "Lucas";
        estudante2.matricula = "2026002";
        estudante2.curso = "ADS";
        estudante2.idade = 22;
        estudante2.notaMedia = 0;

        estudante1.registrarNota(8.5);
        estudante1.verificarSituacao();

        estudante2.registrarNota(5.5);
        estudante2.verificarSituacao();
    }
}