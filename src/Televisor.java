
public class Televisor {

    String marca;
    int polegadas;
    int volume;
    int canalAtual;
    boolean ligada;

    public void ligar() {
        ligada = true;
        System.out.println("Televisão ligada");
    }

    public void trocarCanal(int novoCanal) {
        if (ligada) {
            canalAtual = novoCanal;
            System.out.println("Canal: " + canalAtual);
        } else {
            System.out.println("A televisão tá desligada");
        }
    }

    public static void main(String[] args) {

        Televisor tv1 = new Televisor();
        tv1.marca = "Samsung";
        tv1.polegadas = 50;
        tv1.volume = 20;
        tv1.canalAtual = 10;
        tv1.ligada = false;

        Televisor tv2 = new Televisor();
        tv2.marca = "TCL";
        tv2.polegadas = 55;
        tv2.volume = 15;
        tv2.canalAtual = 5;
        tv2.ligada = false;

        tv1.ligar();
        tv1.trocarCanal(13);

        tv2.ligar();
        tv2.trocarCanal(2);
    }
}