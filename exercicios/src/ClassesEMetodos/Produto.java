package classesEMetodos;

public class Produto {
 
    String nome;
    double preco;
    double desconto;

    Produto(String nomeProduto, double precoProduto, double descontoProduto){
        this.nome = nomeProduto;
        this.preco = precoProduto;
        this.desconto = descontoProduto;
    }
    
    double precoComDesconto() {
        return preco * (1 - desconto);
    }

    double precoComDesconto(double precoProduto, double descontoProduto) {
        return this.preco * (1 - this.desconto);
    }
}

