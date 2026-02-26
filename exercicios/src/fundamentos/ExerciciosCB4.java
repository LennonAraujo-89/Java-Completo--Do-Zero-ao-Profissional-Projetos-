package fundamentos;

import java.util.Scanner;

public class ExerciciosCB4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double num = sc.nextDouble();
        
        double qu = Math.pow(num, 2);
        double cu = Math.pow(num, 3);

        System.out.printf("%.2f Elevado ao quadrado = %.2f\n%.2f Elebado ao cubo = %.2f", num, qu, num, cu);
    
        sc.close();
    }

}
