package estruturaDeControle;

import java.util.Scanner;

public class Exercicios04 {
    public static void main(String[] args) {

        // o esta acontecendo aqui? O programa esta lendo um numero inteiro do usuario e depois 
        // imprimindo esse numero na tela. O programa utiliza a classe Scanner para ler a entrada 
        // do usuario e o metodo nextInt() para obter um numero inteiro. Depois de imprimir o numero, 
        // o programa fecha o Scanner para liberar os recursos.

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int x = sc.nextInt();

        System.out.println(x);

        sc.close();
    }

}
