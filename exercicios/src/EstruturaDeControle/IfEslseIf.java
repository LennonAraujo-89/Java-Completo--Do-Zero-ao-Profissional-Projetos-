package estruturaDeControle;

import javax.swing.JOptionPane;

public class IfEslseIf {
    public static void main(String[] args) {
        
        String nota1, nota2, nota3, nota4;
        double n1, n2, n3, n4, media;
        nota1 = JOptionPane.showInputDialog("Digita a primeira nota:");
        n1 = Double.parseDouble(nota1.trim());
        if (n1 < 0 || n1 > 10) {
            System.out.println("Nota 1 invalida!!!");
            System.exit(0);
        }
        nota2 = JOptionPane.showInputDialog("Digita a segunda nota:");
        n2 = Double.parseDouble(nota2.trim());
        if (n2 < 0 || n2 > 10) {
            System.out.println("Nota 2 invalida!!!");
            System.exit(0);
        }
        nota3 = JOptionPane.showInputDialog("Digita a terceira nota:");
        n3 = Double.parseDouble(nota3.trim());
        if (n3 < 0 || n3 > 10) {
            System.out.println("Nota 3 invalida!!!");
            System.exit(0);
        }
        nota4 = JOptionPane.showInputDialog("Digita a quarta nota:");
        n4 = Double.parseDouble(nota4.trim());
        if (n4 < 0 || n4 > 10) {
            System.out.println("Nota 4 invalida!!!");
            System.exit(0);
        }

        media = (n1 + n2 + n3 + n4) / 4;

        if (media >= 0 && media < 5) {
            System.out.println("Reprovado!!!");
        }else if (media >= 5 && media < 7) {
            System.out.println("Recuperacao");
        }else if (media >= 7 && media <= 10) {
            System.out.println("Aprovado!!!");
        }

    }

}
