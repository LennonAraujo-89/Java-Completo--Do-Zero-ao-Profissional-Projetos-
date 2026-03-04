package ClassesEMetodos;

public class DataTeste {
    public static void main(String[] args) {

        //Documente a classe DataTeste, explicando o que ela faz e como ela se relaciona com a 
        // classe Data.
        //A classe DataTeste é uma classe de teste que tem como objetivo criar instâncias da 
        // classe Data, atribuir valores aos seus atributos e exibir essas informações no console. 
        // Ela serve para demonstrar como a classe Data pode ser utilizada para representar datas e 
        // manipular seus atributos. A classe DataTeste é uma forma de validar o funcionamento da 
        // classe Data, garantindo que os objetos criados a partir dela estejam corretos e possam ser 
        // utilizados em outras partes do programa.
        
        Data d1 = new Data();
        d1.dia = 04;
        d1.mes = 03;
        d1.ano = 2026;

        Data d2 = new Data();
        d2.dia = 17;
        d2.mes = 03;
        d2.ano = 2026;

        System.out.println("Data 1: " + d1.dia + "/" + d1.mes + "/" + d1.ano);
        System.out.println("Data 2: " + d2.dia + "/" + d2.mes + "/" + d2.ano);
        
    }

}
