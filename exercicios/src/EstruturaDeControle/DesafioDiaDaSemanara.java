package EstruturaDeControle;

import java.util.Scanner;

public class DesafioDiaDaSemanara {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String dia = sc.next();

        System.out.println("Voce digitou = " + dia);

        if (dia.equalsIgnoreCase("Domingo")) {
            System.out.println("1");
        }else if (dia.equalsIgnoreCase("Segunda")) {
            System.out.println("2");
        }else if (dia.equalsIgnoreCase("Terca")) {
            System.out.println("3");
        }else if (dia.equalsIgnoreCase("Quarta")) {
            System.out.println("4");
        }else if (dia.equalsIgnoreCase("Quinta")) {
            System.out.println("5");
        }else if (dia.equalsIgnoreCase("Sexta")) {
            System.out.println("6");
        }else if (dia.equalsIgnoreCase("Sabado")) {
            System.out.println("7");
        }

        sc.close();
    }

}
