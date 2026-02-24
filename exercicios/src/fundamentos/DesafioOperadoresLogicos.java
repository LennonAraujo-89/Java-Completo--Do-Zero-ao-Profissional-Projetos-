package fundamentos;

public class DesafioOperadoresLogicos {

    public static void main(String[] args) {
        
        boolean trabalhoT = true;
        boolean trabalhoQ = false;
        boolean soverte = true;
        String tomaram = "";

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

    }
}
