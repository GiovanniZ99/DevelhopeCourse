package Checkpoint;

import java.util.Arrays;

public class Giocatore {
    private String nome;
    private Razza razza;
    private int x;
    private int y;
    private float salute;
    private int puntiAttacco;
    private int puntiDifesa;
    private String[] inventario;

    public Giocatore(String nome, Razza razza, int x, int y, float salute, int puntiAttacco, int puntiDifesa,String [] inventario) {
        this.nome = nome;
        this.razza = razza;
        this.x = x;
        this.y = y;
        this.salute = salute;
        this.puntiAttacco = puntiAttacco;
        this.puntiDifesa = puntiDifesa;
        this.inventario = new String [10];
    }

    public Giocatore(String nome,Razza razza, int x, int y) {
        this.nome = nome;
        this.x = x;
        this.y = y;
    }

    public java.lang.String getNome() {
        return nome;
    }

    public void setNome(java.lang.String nome) {
        this.nome = nome;
    }
    public Razza getRazza() {
        return razza;
    }

    public void setRazza(Razza razza) {
        this.razza = razza;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public float getSalute() {
        return salute;
    }

    public void setSalute(float salute) {
        this.salute = salute;
    }

    public int getPuntiAttacco() {
        return puntiAttacco;
    }

    public void setPuntiAttacco(int puntiAttacco) {
        this.puntiAttacco = puntiAttacco;
    }

    public int getPuntiDifesa() {
        return puntiDifesa;
    }

    public void setPuntiDifesa(int puntiDifesa) {
        this.puntiDifesa = puntiDifesa;
    }
    public java.lang.String[] getInventario() {
        return inventario;
    }

    public void setInventario(java.lang.String[] inventario) {
        this.inventario = inventario;
    }
    public void muovi(int x, int y){
        setX(x);
        setY(y);
        System.out.println(x);
        System.out.println(y);
    }
    public void colpisci(Giocatore giocatore){
        if(giocatore.getPuntiDifesa()>this.puntiAttacco){
            giocatore.setSalute(salute);
        }else if(giocatore.getPuntiDifesa()<this.puntiAttacco) {
            giocatore.setSalute(giocatore.salute - (this.puntiAttacco - giocatore.puntiDifesa));
        }
    }

    public void status (){
        System.out.println("Nome: " + this.nome);
        System.out.println("Posizione: (" + this.x + ", " + this.y + ")");
        System.out.println("Salute: " + this.salute);
        System.out.println("Punti Attacco: " + this.puntiAttacco);
        System.out.println("Punti Difesa: " + this.puntiDifesa);
        System.out.println("Inventario: " + Arrays.toString(this.inventario));
    }
}
