package fundamentos;

import java.util.Scanner;

public class ExerciciosCB3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double peso, altura, imc;

        System.out.println("Digite o peso: ");
        peso = sc.nextDouble();
        System.out.println("Digite a altura: ");
        altura = sc.nextDouble();

        imc = peso / (altura * altura);

        System.out.printf("IMC = %.2f", imc);

        sc.close();
    }

}
