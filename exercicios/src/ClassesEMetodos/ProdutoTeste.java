package classesEMetodos;

public class ProdutoTeste {
    public static void main(String[] args) {
        
        Produto p1 = new Produto("Notebook", 4500.00, 0.15);

        Produto p2 = new Produto("Geladeira", 3000.00, 0.10);

        double valorFinal = p1.precoComDesconto(4500.00, 0.15);
        double valorFinal2 = p2.precoComDesconto();

        System.out.println("Produto: " + p1.nome);
        System.out.println("Preço original: R$ " + p1.preco);
        System.out.println("Preço com desconto: R$ " + valorFinal);

        System.out.println("Produto: " + p2.nome);
        System.out.println("Preço original: R$ " + p2.preco);
        System.out.println("Preço com desconto: R$ " + valorFinal2);

    }
}
