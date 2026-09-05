public class Celular {

    String numero;
    String marca;
    String modelo;
    String empresa;
    int nivelBateria;

    public void enviarMensagem(String texto) {
        System.out.println("Mensagem enviada: " + texto);
    }

    public void realizarChamada(String numeroDestino) {
        System.out.println("Ligando para: " + numeroDestino);
    }

    public static void main(String[] args) {

        Celular celular1 = new Celular();
        celular1.numero = "99999-1111";
        celular1.marca = "Samsung";
        celular1.modelo = "Galaxy S24";
        celular1.empresa = "Claro";
        celular1.nivelBateria = 80;

        Celular celular2 = new Celular();
        celular2.numero = "99999-2222";
        celular2.marca = "Apple";
        celular2.modelo = "iPhone 15";
        celular2.empresa = "TIM";
        celular2.nivelBateria = 15;

        celular1.enviarMensagem("Olá!");
        celular1.realizarChamada("99999-3333");

        celular2.enviarMensagem("Tudo bem?");
        celular2.realizarChamada("99999-4444");
    }
}
