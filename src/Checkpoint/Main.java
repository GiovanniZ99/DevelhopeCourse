package Checkpoint;

/*) Definire una classe "Giocatore" che abbia i seguenti attributi:
- Nome
- Razza (Elfo, Nano, Uomo, Orco, Stregone, ecc…)
- PosizioneX
- PosizioneY
- Salute
- PuntiAttacco
- PuntiDifesa
- Inventario (capienza max 10)
● Implementare almeno due tipologie di costruttori e i relativi getter e setter per
ciascuna variabile.
● Implementare il metodo muovi(int x, int y) che permette di spostare il
personaggio sulla mappa.
● Implementare il metodo colpisci(Personaggio target) che permette di colpire e
ridurre la salute del target.
● Implementare un metodo che stampi lo status attuale del giocatore (nome,
posizione, salute, puntiAttacco, puntiDifesa, inventario)
2) Progettare una classe Combattimento con i seguenti attributi:
- Modalità (OneVsOne, TwoVsTwo, Survival, Deathmatch, ecc…)
- Partecipanti (al più 4 sfidanti)
● Implementare un costruttore con un unico parametro “modalità”.
● Implementare i getter e setter per ciascuna variabile.
● Realizzare un metodo per aggiungere un personaggio ai partecipanti del
combattimento.
● Realizzare un metodo per rimuovere un personaggio dai partecipanti al
combattimento.
● Implementa il metodo attacco(Personaggio personaggio, Personaggio target)
che permette di attaccare il proprio avversario riducendone la salute
● Implementare il metodo toString in modo da stampare tutte le info relative al
combattimento
3) Creare una classe Main nella quale:
● Istanziare 4 personaggi.
● Creare un combattimento .
● Stampare le informazioni relative al combattimento
● Stampare lo status attuale di uno dei giocatori
● Invocare il metodo attacco scegliendo come target il giocatore precedente
● Stampare lo status aggiornato del target */
        public class Main {
            public static void main(String[] args) {
                String [] inventarioBase ={"Piccone", "scudo", "pozione vita"};
                Giocatore Giovanni = new Giocatore("Gi",Razza.STREGONE, 1, 2, 100f, 15,
                        20, inventarioBase);
                Giocatore Mario = new Giocatore("Ma",Razza.ORCO, 1, 2, 100f, 20,
                        15, inventarioBase);
                Giocatore Luigi = new Giocatore("Lu",Razza.NANO, 1, 2, 100f, 30,
                        5, inventarioBase);
                Giocatore Paolo = new Giocatore("Pa",Razza.ELFO, 1, 2, 100f, 10,
                        20, inventarioBase);
                Combattimento comattimento = new Combattimento(Modalita.DEATHMATCH);
                comattimento.aggGiocatore(Giovanni);
                comattimento.aggGiocatore(Mario);
                comattimento.aggGiocatore(Luigi);
                comattimento.aggGiocatore(Paolo);
                Giovanni.status();
                Combattimento.attacco(Luigi, Giovanni);
                Giovanni.status();
                Combattimento.attacco(Luigi, Giovanni);
                Giovanni.status();
            }
        }

