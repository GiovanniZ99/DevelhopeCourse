package checkpoint;

import java.util.Arrays;

public class Combattimento {
    private Modalita modalita;
    private Giocatore[] giocatori;

    public Combattimento(Modalita modalita) {
        this.modalita = modalita;
        this.giocatori = new Giocatore[4];
    }

    public Modalita getModalita() {
        return modalita;
    }

    public void setModalita(Modalita modalita) {
        this.modalita = modalita;
    }

    public Giocatore[] getGiocatori() {
        return giocatori;
    }

    public void setGiocatori(Giocatore[] giocatori) {
        this.giocatori = giocatori;
    }

    public void aggGiocatore(Giocatore giocatore) {
        for (int i = 0; i < giocatori.length; i++) {
            if (giocatori[i] == null) {
                giocatori[i] = giocatore;
                break;
            }
        }
    }

    public void rimGiocatore(Giocatore giocatore) {
        Giocatore[] temparray = new Giocatore[giocatori.length];
        for (int i = 0; i < giocatori.length; i++) {
            if (!(giocatore.getNome().equalsIgnoreCase(giocatori[i].getNome()))) {
                temparray[i] = giocatori[i];
            }
            giocatori = temparray;
        }
    }

    public static void attacco(Giocatore giocatore, Giocatore giocatoreDif) {
        giocatore.colpisci(giocatoreDif);
    }

    @Override
    public String toString() {
        return "Comattimento{" +
                "modalita=" + modalita +
                ", giocatori=" + Arrays.toString(giocatori) +
                '}';
    }
}
