package fundamentos;

import java.util.Scanner;

public class ExercicioCB2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double celsius, fahrenheit;

        celsius = sc.nextDouble();

        fahrenheit = celsius * 1.8 + 32;

        System.out.printf("%.2f Celsius = %.2f Fahrenheit", celsius, fahrenheit);

        sc.close();
    }

}
