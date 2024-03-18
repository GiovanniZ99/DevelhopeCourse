package checkpoint_1;

public class Concessionaria {
    private String nome;
    private Auto[] listaAuto;

    public Concessionaria(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Auto[] getListaAuto() {
        return listaAuto;
    }

    public void setListaAuto(Auto[] listaAuto) {
        this.listaAuto = listaAuto;
    }
    public void addAuto (Auto auto){
        for (int i = 0; i< listaAuto.length; i++){
            listaAuto[i]=auto;
        }

    }
    public void printAuto(){
        for (Auto auto : listaAuto) {
            System.out.println(auto);
        }
    }
}
