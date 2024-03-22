package java_advanced.checkpoint_1;

public class Auto {
    private String Marca;
    private String Modello;
    private int Prezzo;

    public Auto(String marca, String modello, int prezzo) {
       this.Marca = marca;
       this.Modello = modello;
        this.Prezzo = prezzo;
    }

    public Auto(String marca, String modello) {
        this.Marca = marca;
        this.Modello = modello;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public String getModello() {
        return Modello;
    }

    public void setModello(String modello) {
        Modello = modello;
    }

    public int getPrezzo() {
        return Prezzo;
    }

    public void setPrezzo(int prezzo) {
        Prezzo = prezzo;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "Marca='" + Marca + '\'' +
                ", Modello='" + Modello + '\'' +
                ", Prezzo=" + Prezzo +
                '}';
    }
}
