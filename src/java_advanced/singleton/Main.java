package java_advanced.singleton;
/* Crea una classe User che abbia i parametri privati nome ed età e i getter e setter
All'interno di User ci sarà anche una funzione che stampi a video le informazioni di età
 e il nome. Creare 2 oggetti User di cui creerà un'istanza.
Del primo si stamperanno le informazioni di default, del secondo si cambieranno le informazioni
e poi si stamperanno a video */
public class Main {
    public static void main(String[] args) {
      User user1 = User.createIstance();
        System.out.println(user1);
        User user2 = User.createIstance();
        user2.setNome("Enzo");
        user2.setEta((byte) 15);
        System.out.println(user2);
        System.out.println(user1);
        // Sia user1 che user2 si riferiscono in realtà allo stesso oggetto
    }
}

