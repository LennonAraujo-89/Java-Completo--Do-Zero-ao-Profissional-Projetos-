package fundamentos;

import java.util.Scanner;

public class ExerciciosCB6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		
		/*Criar um programa que resolve equações do segundo grau (ax2 + bx + c = 0) 
        utilizando a fórmula de Bhaskara. Use como exemplo a = 1, b = 12 e c = -13. 
        Encontre o delta*/

        double a = 2, b = -3, c = -5, x1, x2, delta;

        delta = Math.pow(b, 2) - 4 * a * c;
        System.out.println(delta);

        x1 = (-b + Math.sqrt(delta)) / (2 * a);
        x2 = (-b - Math.sqrt(delta)) / (2 * a);

        System.out.println(x1);
        System.out.println(x2);

		
		scanner.close();
    }

}
