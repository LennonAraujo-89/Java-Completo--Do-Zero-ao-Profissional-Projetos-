package fundamentos;

import java.util.Scanner;

public class Console {

    public static void main(String[] args) {

        Scanner entrence = new Scanner(System.in);
        
        System.out.print("Digite seu nome: ");
        String nome = entrence.nextLine();

        System.out.print("\nDigite seu Sobrenome: ");
        String sobrenome = entrence.nextLine();

        System.out.print("\nDigite sua idade: ");
        int idade = entrence.nextInt();

        System.out.printf("\nO senhor %s %s tem %d anos.", nome, sobrenome, idade);

        System.out.print("\nDigite um numero: ");
        int a = entrence.nextInt();

        System.out.print("\nDigite um numero: ");
        int b = entrence.nextInt();

        int soma = a + b;

        System.out.printf("\nA soma dos numeros: %d + %d = %d", a, b, soma);

        entrence.close();
    }

}
