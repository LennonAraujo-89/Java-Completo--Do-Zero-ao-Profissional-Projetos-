package ClassesEMetodos;

public class AtribuicaoValorReferencia {
    public static void main(String[] args) {
        
        int a = 2;
        int b = a;

        a++;
        b--;

        System.out.println(a);
        System.out.println(b);

        int c = 5;
        primo(c);
        System.out.println(c);
        
    }

    static void primo(int a){
        a++;
    }

}
