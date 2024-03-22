package java_object.Studenti_es;

public class Studente {
    private int numMatricola;
    private String nome;
    private String cognome;
    private static int studentiCreati;

    public Studente(int numMatricola, String nome, String cognome) {
        this.numMatricola = numMatricola;
        this.nome = nome;
        this.cognome = cognome;
        studentiCreati++;
    }

    public int getNumMatricola() {
        return numMatricola;
    }

    public void setNumMatricola(int numMatricola) {
        this.numMatricola = numMatricola;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public static int getStudentiCreati() {
        return studentiCreati;
    }

    public static void setStudentiCreati(int studentiCreati) {
        Studente.studentiCreati = studentiCreati;
    }

    @Override
    public String toString() {
        return "Studente{" +
                "numMatricola=" + numMatricola +
                ", nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                '}';
    }
}
