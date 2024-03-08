package concessionaria_es;

public class Concessionaria {
    String nome;
    Veicolo[] catalogo = new Veicolo[50];

    public Concessionaria(String nome) {
        this.nome = nome;
    }
    public void addAuto(){
        for (Veicolo veicolo : catalogo){

        }
    }
    public void printAuto(){

        for (Veicolo veicolo : catalogo) {
            System.out.println(veicolo);

        }

    }
}

