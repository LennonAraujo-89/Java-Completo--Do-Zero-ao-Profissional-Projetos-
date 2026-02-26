package fundamentos;

import java.util.Scanner;

public class ExercicioCB1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double fahrenheit, celsius;

        fahrenheit = sc.nextDouble();

        celsius = (fahrenheit - 32) * 5 / 9;

        System.out.printf("%.2f Fahrenheit = °%.2f Celsius.", fahrenheit, celsius);

        sc.close();
    }

}
