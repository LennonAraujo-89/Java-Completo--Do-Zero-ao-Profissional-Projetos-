package fundamentos;

import java.util.Scanner;

public class Wrappers {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        
        //byte
        Byte b = 100;
        Short s = 1000;
        Integer i = 10000; //int
        Integer iS = Integer.parseInt("20000");
        Integer iT = Integer.parseInt(entrada.next());
        Long l = 100000L;
        
        System.out.println(b.byteValue());
        System.out.printf("Valor de i = %d e valor de iS = %d%nValor de iT = %d%n", i, iS, iT);
        System.out.println(l.longValue());

        Boolean bo = Boolean.parseBoolean("true");
        System.out.println(bo);
        System.out.println(bo.toString().toUpperCase());

        entrada.close();

    }

}
