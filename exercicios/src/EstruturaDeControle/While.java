package EstruturaDeControle;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

       int i = 0;

       System.out.println("While!!!");

       while (i <= 4) {
        System.out.println(i);
        i++;
       }

       System.out.println("For!!!");

       for(i=0;i<=4;i++){
        System.out.println(i);
       }
       System.out.println("While inderteminado!!!");

       String word = "";

       while (!word.equalsIgnoreCase("sair")) {
        
        System.out.println("Digite: \nDigirte sair para terminar.");
        word = sc.nextLine();
        System.out.println("Você digitou = " + word);

       }

       System.out.println("DO / While!!!");

       i = 0;

       do {
        System.out.println(i);
        i++;
       }while(i <= 4);

       sc.close();

    }

}
