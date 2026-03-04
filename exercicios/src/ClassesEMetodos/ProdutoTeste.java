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


        System.out.println(p1.nome + " custa R$ " + p1.preco + " com desconto de " + (p1.desconto * 100) + "%" + 
        " Total com desconto: R$ " + (p1.preco * (1 - p1.desconto)));

        System.out.println(p2.nome + " custa R$ " + p2.preco + " com desconto de " + (p2.desconto * 100) + "%" + 
        " Total com desconto: R$ " + (p2.preco * (1 - p2.desconto)));

    }

}
