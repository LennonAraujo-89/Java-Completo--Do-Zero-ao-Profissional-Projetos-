package fundamentos;

import java.util.Scanner;

public class ExerciciosCB5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double base, altura, area;
        System.out.println("Digite a base: ");
        base = sc.nextDouble();
        System.out.println("Digite a altura: ");
        altura = sc.nextDouble();

        area = (base * altura) / 2;

        System.out.println("Area = " + area);


        sc.close();
    }

}
