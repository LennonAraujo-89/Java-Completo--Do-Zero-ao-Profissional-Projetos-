package ClassesEMetodos;


public class DesafioModuloPessoa {

    String nomeDaPessoa;
    double pesoDaPessoa;

    void Pessoa(){
        nomeDaPessoa = "Sem nome";
        pesoDaPessoa = 00;
    }

    void Pessoa(String nomeDaPessoa, double pesoDaPessoa){
        this.nomeDaPessoa = nomeDaPessoa;
        this.pesoDaPessoa = pesoDaPessoa;
    }

    double Comer(double comeu){
        return this.pesoDaPessoa + comeu;
    }
}
