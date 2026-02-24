package fundamentos;

public class DesafioOperadoresLogicos {

    public static void main(String[] args) {
        
        boolean trabalhoT = true;
        boolean trabalhoQ = false;
        boolean soverte = true;
        String tomaram = "";
        boolean ganho;

        if (trabalhoQ == false && trabalhoT == false) {
            soverte = (!soverte);
        }

        if (soverte == true) {
            tomaram = "tomarao sorvete!!!";
        }else if (soverte == false) {
            tomaram = "nao tomaram sorvete!!!";
        }

        if(trabalhoT == true && trabalhoQ == true){
            System.out.println("Familia saiu para comprar TV 50 polegadas!!!");
        } else if (trabalhoT == false && trabalhoQ == true) {
            System.out.println("Familia saiu para comprar TV 32 polegadas e " + tomaram);
        }else if (trabalhoT == true && trabalhoQ == false) {
            System.out.println("Familia saiu para comprar TV 32 polegadas e " + tomaram);
        }else if (trabalhoT == false && trabalhoQ == false) {
            System.out.println("Familia não saiu e " + tomaram);
        }

        System.out.println("\n");

        if (trabalhoT || trabalhoQ) {
            ganho = trabalhoT || trabalhoQ;
            System.out.println("Ganhou os dois ou pelo menos um!!! " + ganho);
        }else {
            ganho = trabalhoT || trabalhoQ;
            System.out.println("Não ganhou nenhum!!! " + ganho);
        }

        System.out.println("\n");

        if (trabalhoT ^ trabalhoQ) {
            ganho = trabalhoT ^ trabalhoQ;
            System.out.println("Um dia, deu certo!!! " + ganho);
        }else {
            ganho = trabalhoT ^ trabalhoQ;
            System.out.println("só podia ganhar um dia ou não ganho nenhum!!! " + ganho);
        }

    }
}
