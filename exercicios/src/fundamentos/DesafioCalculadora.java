package fundamentos;

import javax.swing.JOptionPane;

public class DesafioCalculadora {
    public static void main(String[] args) {

        double n1, n2, op;
        String num1, num2, oper;

        num1 = JOptionPane.showInputDialog("Digite um numero: ");
        num2 = JOptionPane.showInputDialog("Digite um numero: ");
        oper = JOptionPane.showInputDialog("Digite a operacao: ");

        n1 = Double.parseDouble(num1);
        n2 = Double.parseDouble(num2);
        
        if (oper.equals("+")) {
            op = n1 + n2;
            System.out.printf("%.2f + %.2f = %.2f", n1, n2, op);
            
        }else if (oper.equals("-")) {
            op = n1 - n2;
            System.out.printf("%.2f - %.2f = %.2f", n1, n2, op);
        }else if (oper.equals("*")) {
            op = n1 * n2;
            System.out.printf("%.2f x %.2f = %.2f", n1, n2, op);
        }else if (oper.equals("/")) {
            op = n1 / n2;
            System.out.printf("%.2f / %.2f = %.2f", n1, n2, op);
        }else if (oper.equals("%")) {
            op = n1 % n2;
            System.out.printf("%.2f °/° %.2f = %.2f", n1, n2, op);
        }
    }

}
