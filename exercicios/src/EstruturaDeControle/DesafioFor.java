package EstruturaDeControle;

public class DesafioFor {
    public static void main(String[] args) {
        
        int i, num = 10;

        for(i = 0; i < 6; i++){
            System.out.println("num = " + num);
            num -= 2;
        }

        
        for(String valor = "#"; !valor.equalsIgnoreCase("#####"); valor += "#"){
            System.out.println(valor);
        }

    }

}
