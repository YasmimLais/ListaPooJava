
public class Animal {

    String nome;
    String especie;
    String raca;
    int idade;
    double peso;

    public void emitirSom() {
        System.out.println(nome + " tá emitindo um som");
    }

    public void comer(String alimento) {
        System.out.println(nome + " tá comendo " + alimento);
    }

    public static void main(String[] args) {

        Animal animal1 = new Animal();
        animal1.nome = "Luke";
        animal1.especie = "Cachorro";
        animal1.raca = "Caramelo";
        animal1.idade = 3;
        animal1.peso = 6;

        Animal animal2 = new Animal();
        animal2.nome = "Mimi";
        animal2.especie = "Gato";
        animal2.raca = "Siamês";
        animal2.idade = 2;
        animal2.peso = 4;

        animal1.emitirSom();
        animal1.comer("ração");

        animal2.emitirSom();
        animal2.comer("ração");
    }
}