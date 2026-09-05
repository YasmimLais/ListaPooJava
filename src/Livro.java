
public class Livro {

    String titulo;
    String autor;
    String editora;
    String isbn;
    int numeroPaginas;

    public void abrirLivro() {
        System.out.println("Livro aberto: " + titulo);
    }

    public void lerPagina(int numero) {
        if (numero >= 1 && numero <= numeroPaginas) {
            System.out.println("Lendo a página " + numero);
        } else {
            System.out.println("Página inválida");
        }
    }

    public static void main(String[] args) {

        Livro livro1 = new Livro();
        livro1.titulo = "Os Miseráveis"; // Mds amo esse livro
        livro1.autor = "Vitor Hugo";
        livro1.editora = "Novo Fronteira";
        livro1.isbn = "123456";
        livro1.numeroPaginas = 1500;

        Livro livro2 = new Livro();
        livro2.titulo = "Dom Casmurro";
        livro2.autor = "Machado de Assis";
        livro2.editora = "Principis";
        livro2.isbn = "789101";
        livro2.numeroPaginas = 250;

        livro1.abrirLivro();
        livro1.lerPagina(50);

        livro2.abrirLivro();
        livro2.lerPagina(100);
    }
}