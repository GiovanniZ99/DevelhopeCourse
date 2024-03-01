package Object_es1;

public class Auto2 {
    private final String marca;
    private final String modello;

    private final String targa;

    private final double cilindrata;

    public Auto2(String marca, String modello, String targa, double cilindrata) {
        this.marca = marca;
        this.modello = modello;
        this.targa = targa;
        this.cilindrata = cilindrata;
    }

    public String getMarca() {
        return marca;
    }

    public String getModello() {
        return modello;
    }

    public String getTarga() {
        return targa;
    }

    public double getCilindrata() {
        return cilindrata;
    }


}
