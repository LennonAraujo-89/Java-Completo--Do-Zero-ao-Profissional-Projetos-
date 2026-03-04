package ClassesEMetodos;

public class DataTeste {
    public static void main(String[] args) {
        
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
