package ClassesEMetodos;

public class Data {

    int dia;
    int mes;
    int ano;

    Data(){
        this.dia = 05;
        this.mes = 03;
        this.ano = 1974;
    }

    Data(int diaData, int mesData, int anoData){
        this.dia = diaData;
        this.mes = mesData;
        this.ano = anoData;
    }

    String dataFormatada() {
        return String.format("%02d/%02d/%04d", dia, mes, ano);
    }

}
