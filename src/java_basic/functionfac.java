package java_basic;
//Definire una funzione che accetti in ingresso 2 interi e ne restituisca la somma.


public class functionfac {
    public static void main(String[] args) {
        int x=10;
        int y=5;
        int z=5;
        System.out.println(restDiv(x,y));
        System.out.println(div(x,y,z));
    }
    static int sum(int x, int y){
        return x+y;
    }
    static int restDiv(int x, int y){
        return x%y;
    }
    static int div(int x, int y, int z){
    //    return x/y/z;
    // nel video della soluzione fa la media quindi
        return (x+y+z)/3;
        //update il video della media è invertito con quello della divisione

    }
}
