package ClassesEMetodos;

public class ProdutoTeste {
    public static void main(String[] args) {
        
        Produto p1 = new Produto();
        p1.nome = "Notebook";
        p1.preco = 4500.00;
        p1.desconto = 0.15;
       
        Produto p2 = new Produto();
        p2.nome = "Geladeira";
        p2.preco = 3000.00;
        p2.desconto = 0.10;

        double valorFinal = p1.precoComDesconto();

        System.out.println("Produto: " + p1.nome);
        System.out.println("Preço original: R$ " + p1.preco);
        System.out.println("Preço com desconto: R$ " + valorFinal);

    }


}
