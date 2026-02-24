package fundamentos;

public class DesafioOperadoresAritimeticos {

    public static void main(String[] args) {
        
        /*
        double a, b;
        a = 25;
        b = 35;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);

        int c, d;
        c = 8;
        d = 3;
        System.out.println(c / d);
        System.out.println(c / (double) d);

        System.out.println(a % b);
        System.out.println(c % d);
        
        double f = Math.pow(5, 2);
        System.out.println(f);

        double ex = Math.pow(6 * (3 + 2), 2);
        */

        double p1 = (1 - 5) * (2 - 7) / 2;
        double p2 = Math.pow(p1, 2);

        double p3 = 6 * (3 + 2);
        double p4 = Math.pow(p3, 2);
        double p5 = p4 / (3 * 2);

        double p6 = p5 - p2;
        double p7 = Math.pow(p6, 3);

        double p8 = Math.pow(10, 3);

        double p9 = p7 / p8;

        System.out.println( (int) p9);
        
    }

}
