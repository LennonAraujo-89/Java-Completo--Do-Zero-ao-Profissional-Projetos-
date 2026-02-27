package EstruturaDeControle;

import java.util.Scanner;

public class DesafioWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       double nota = 0, media = 0, i = 0;

       while (i != -1) {
        nota = sc.nextDouble();
        nota = nota + nota;
        i++;
       }

       


        sc.close();

    }

}
