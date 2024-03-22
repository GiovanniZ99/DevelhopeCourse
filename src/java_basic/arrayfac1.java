package java_basic;

/* Scrivi un programma che contenga un metodo che crea un array e lo riempie con
i numeri da 1 a 10 e che che calcoli la somma dei numeri contenuti
nell'array inizializzato e la stampi a video. */
public class arrayfac1 {
    public static void main(String[] args) {
        System.out.println(sumArray(createArray()));
    }
    public static int[] createArray(){
        int[] array=new int[10];
        for(int i=0;i<array.length;i++){
            array[i]=i;
        }
        return array;
    }
    public static int sumArray(int [] randArray){
        int sum=0;
        for(int j=0;j<=randArray.length; j++){
            sum+=j;

        }
    return sum;
    }

}
