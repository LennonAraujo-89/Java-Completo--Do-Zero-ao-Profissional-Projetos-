package ClassesEMetodos;

public class Revisao {

    public static void main(String[] args) {
        
        Produto caProduto = new Produto("Guitarra", 1899.00, 0.15);
        
        double valorFinal = caProduto.precoComDesconto();

        System.out.printf("R$ %.2f", valorFinal);
    }

}
