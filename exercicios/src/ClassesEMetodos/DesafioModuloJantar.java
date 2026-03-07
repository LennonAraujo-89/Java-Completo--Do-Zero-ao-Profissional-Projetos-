package ClassesEMetodos;

public class DesafioModuloJantar {
    public static void main(String[] args) {

        DesafioModuloPessoa pessoa = new DesafioModuloPessoa();
        pessoa.nomeDaPessoa = "Lennon";
        pessoa.pesoDaPessoa = 92.581;

        DesafioModuloComida comendo = new DesafioModuloComida();
        comendo.nomeDaComida = "Frango";
        comendo.pesoDaComida = 0.284;
        
        System.out.printf("\n%s está pesando %.3f.\n\n", pessoa.nomeDaPessoa, pessoa.pesoDaPessoa);
        
        System.out.printf("Ele comeu %s e agora pesa: %.3f\n\n", comendo.nomeDaComida, pessoa.Comer(comendo.pesoDaComida));
        
        DesafioModuloPessoa pessoa2 = new DesafioModuloPessoa();
        pessoa2.Pessoa("Samara", 91.309);
        DesafioModuloComida comendo2 = new DesafioModuloComida();
        comendo2.Comendo("Arroz", 0.241);

        System.out.printf("\n%s está pesando %.3f.\n\n", pessoa2.nomeDaPessoa, pessoa2.pesoDaPessoa);
        
        System.out.printf("Ele comeu %s e agora pesa: %.3f\n\n", comendo2.nomeDaComida, pessoa2.Comer(comendo.pesoDaComida));
        
    }

}
