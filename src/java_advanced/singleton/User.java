package java_advanced.singleton;

public class User {
    private String nome;
    private byte eta;
    private static User instance;

    // Costruttore privato così non si può usare quello di default
    private User() {
    }

    public static User createIstance(){
        if(instance == null){
           instance = new User();
        }
        return instance;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public byte getEta() {
        return eta;
    }

    public void setEta(byte eta) {
        this.eta = eta;
    }

    @Override
    public String toString() {
        return "User{" +
                "nome='" + nome + '\'' +
                ", eta=" + eta +
                '}';
    }


}
