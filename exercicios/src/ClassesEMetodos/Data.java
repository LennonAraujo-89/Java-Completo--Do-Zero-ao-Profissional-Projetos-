package classesEMetodos;

public class Data {

    int dia;
    int mes;
    int ano;

    Data(){
        dia = 05;
        mes = 03;
        ano = 1974;
        //this(1, 1, 2020);
    }

    Data(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    /*
    Data(int diaData, int mesData, int anoData){
        this.dia = diaData;
        this.mes = mesData;
        this.ano = anoData;
    }
    Data(int diaData, int mesData, int anoData){
        dia = diaData;
        mes = mesData;
        ano = anoData;
    }
        */

    String dataFormatada() {
        return String.format("%02d/%02d/%04d", dia, mes, ano);
        //return String.format("%02d/%02d/%04d", this.dia, mes, ano);
    }

}
