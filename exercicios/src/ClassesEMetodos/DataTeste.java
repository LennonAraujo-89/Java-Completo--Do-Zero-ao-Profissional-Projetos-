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

        System.out.println(d1.dataFormatada());

        Data d2 = new Data(17, 03 , 1992);

        System.out.println(d2.dataFormatada());

    }

}
