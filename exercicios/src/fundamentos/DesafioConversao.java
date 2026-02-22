package fundamentos;

import java.util.Locale;
import java.util.Scanner;

public class DesafioConversao {
    public static void main(String[] args) {

        Locale.setDefault(Locale.forLanguageTag("pt-BR"));
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro salario: ");
        String salario1 = sc.nextLine().replace(",", ".");

        System.out.println("Digite o segundo salario: ");
        String salario2 = sc.nextLine().replace(",", ".");

        System.out.println("Digite o terceiro salario: ");
        String salario3 = sc.nextLine().replace(",", ".");

        double salarioD1 = Double.parseDouble(salario1);
        double salarioD2 = Double.parseDouble(salario2);
        double salarioD3 = Double.parseDouble(salario3);

        double mediaSalarial = (salarioD1 + salarioD2 + salarioD3) / 3;

        System.out.printf("Sua media salarial = R$%.2f", mediaSalarial);


        sc.close();
    }

}
