package EstruturaDeControle;

import java.util.Scanner;

public class Exercicios03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nota1, nota2, media;

        System.out.println("Ditgite a primeira nota: ");
        nota1 = sc.nextDouble();
        System.out.println("Ditgite a segunda nota: ");
        nota2 = sc.nextDouble();

        media = (nota1 + nota2) / 2;

        if (nota1 < 0 || nota1 > 10 || nota2 < 0 || nota2 > 10) {
            System.out.println(media + " Nota invalida!!!");
        }else if(media >= 7.0 && media < 10){
            System.out.println(media + " Aprovado!!!");
        }else if (media < 7.0 && media >= 4.0) {
            System.out.println(media + " Recuperacao!!!");
        }else if (media < 4.0 && media >= 0) {
            System.out.println(media + " Reprovado!!!");
        }

        sc.close();
    }

}
