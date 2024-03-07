package basi_di_java;

public class es_4 {
    public static void main(String[] args) {
        int number_1=5;
        int number_2=7;
        System.out.println(numbers(number_1, number_2));
    }
    static int numbers(int x, int y) {
        x += 1;
        y += 1;
        return x*y;
    }
}
