/*
1. Classe Carro:
Atributos: marca, modelo, cor, ano, placa.
Metodos: acelerar(), frear().
*/

public class Carro {

    String marca;
    String modelo;
    String cor;
    int ano;
    String placa;

    public void acelerar() {
        System.out.println(modelo + " está acelerando!");
    }

    public void frear() {
        System.out.println(modelo + " está freando!");
    }

    public static void main(String[] args) {

        Carro carro1 = new Carro();
        carro1.marca = "Chevrolet";
        carro1.modelo = "Camaro";
        carro1.cor = "Amarelo";
        carro1.ano = 2012;
        carro1.placa = "QYM-1234";

        Carro carro2 = new Carro();
        carro2.marca = "Volkswagen";
        carro2.modelo = "Fusca";
        carro2.cor = "Azul";
        carro2.ano = 1999;
        carro2.placa = "YLI-5678";

        carro1.acelerar();
        carro1.frear();

        carro2.acelerar();
        carro2.frear();
    }
}
