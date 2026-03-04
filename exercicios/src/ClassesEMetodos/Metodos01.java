package ClassesEMetodos;

public class Metodos01 {
    public static void main(String[] args) {
        
        int a, b;
        a = 10;
        b = 20;

        Metodos01 somar = new Metodos01();
        int resultado = somar.soma(a, b);
        System.out.println("A soma de " + a + " e " + b + " é: " + resultado);

    }

    int soma(int x, int y) {
        return x + y;
    }

}
