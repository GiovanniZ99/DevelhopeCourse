package Concessionaria_es;

public class Auto extends Veicolo{
    boolean cinture;

    boolean sensori;

    String infoNavigatore;

    public Auto(String marca, String modello, float prezzo, TipoDiMotore tipoDiMotore, boolean cinture,
                boolean sensori, String infoNavigatore) {
        super(marca, modello, prezzo, tipoDiMotore);
        this.cinture = cinture;
        this.sensori = sensori;
        this.infoNavigatore = infoNavigatore;
    }

    public Auto (String marca, String modello, float prezzo, TipoDiMotore tipoDiMotore){
        super(marca, modello, prezzo, tipoDiMotore);
    }

    public boolean isCinture() {
        return cinture;
    }

    public void setCinture(boolean cinture) {
        this.cinture = cinture;
    }

    public boolean isSensori() {
        return sensori;
    }

    public void setSensori(boolean sensori) {
        this.sensori = sensori;
    }

    public String getInfoNavigatore() {
        return infoNavigatore;
    }

    public void setInfoNavigatore(String infoNavigatore) {
        this.infoNavigatore = infoNavigatore;
    }

    @Override
    public int consumoMedio() {
        return peso*velocita;
    }
}
