package fundamentos;

import javax.swing.JOptionPane;

public class OperadoresAtribuicaoUnarios {
    public static void main(String[] args) {

        System.out.println("Operadores Atribuicao");

        int a, b, c;
        a = 20;
        b = a;
        c = a + b;

        c += b; // c = c + b; -+ *= /=

        System.out.println(c);

        c %= 2; // c = c % 2; 0 ou 1

        System.out.println(c);

        System.out.println("O peradoes Unarios");

        a = 1;
        b = 2;

        a++; // a = a + 1;
        a--; // a = a - 1;

        System.out.println("Operador Ternario");

        String nota1, nota2, nota3;
        double n1, n2, n3, media;
        nota1 = JOptionPane.showInputDialog("Digite a primeira nota: ");
        nota2 = JOptionPane.showInputDialog("Digite a Segunda nota:");
        nota3 = JOptionPane.showInputDialog("Digite a terceira nota: ");

        n1 = Double.parseDouble(nota1);
        n2 = Double.parseDouble(nota2);
        n3 = Double.parseDouble(nota3);
        media = (n1 + n2 + n3) / 3;
        String resultado = media >= 7.0 ? "Aprovado" : "Recuperacao";
        System.out.println(resultado);

        
    }
}
