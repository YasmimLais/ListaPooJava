
public class Produto {

    int codigo;
    String nome;
    String descricao;
    double precoVenda;
    int quantidadeEstoque;

    public void vender(int quantidade) {
        if (quantidade <= quantidadeEstoque) {
            quantidadeEstoque = quantidadeEstoque - quantidade;
            System.out.println("Venda realizada");
            System.out.println("Estoque restante: " + quantidadeEstoque);
        } else {
            System.out.println("Estoque insuficiente");
        }
    }

    public void reporEstoque(int quantidade) {
        quantidadeEstoque = quantidadeEstoque + quantidade;
        System.out.println("Estoque atualizado: " + quantidadeEstoque);
    }

    public static void main(String[] args) {

        Produto produto1 = new Produto();
        produto1.codigo = 1;
        produto1.nome = "Mouse";
        produto1.descricao = "Mouse sem fio";
        produto1.precoVenda = 80;
        produto1.quantidadeEstoque = 10;

        Produto produto2 = new Produto();
        produto2.codigo = 2;
        produto2.nome = "Teclado";
        produto2.descricao = "Teclado mecânico";
        produto2.precoVenda = 200;
        produto2.quantidadeEstoque = 5;

        produto1.vender(2);
        produto1.reporEstoque(5);

        produto2.vender(1);
        produto2.reporEstoque(3);
    }
}