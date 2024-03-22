package java_advanced.Studenti_es;

public class CorsoLaurea {
    private String nome;
    private Studente[] studenti;

    public CorsoLaurea(String nome) {
        this.nome = nome;
        this.studenti = new Studente[0];
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Studente[] getStudenti() {
        return studenti;
    }

    public void setStudenti(Studente[] studenti) {
        this.studenti = studenti;
    }

    public void printStudent() {
        for (Studente studente : studenti) {
            System.out.println(studente);
        }
    }

    public void addStudent(Studente studente) {
        Studente[] tempArray = new Studente[studenti.length + 1];
        for (int i = 0; i < studenti.length; i++) {
            tempArray[i] = studenti[i];
        }
        tempArray[tempArray.length - 1] = studente;
        studenti = tempArray;
    }

    public void remStudent(Studente studente) {
        Studente[] tempArray = new Studente[studenti.length - 1];
        for (int i = 0; i < studenti.length; i++) {
            if (!(studenti[i].getNumMatricola() == studente.getNumMatricola())) {
                tempArray[i] = studenti[i];
            }
            studenti = tempArray;
        }

    }
}
