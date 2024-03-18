/* Scrivere una funzione che accetti in input 2 int e ne stampi la somma
Scrivere una funzione che accetti in input 1 char lo stampi
Scrivere una funzione che accetti in input 2 Integer e ne stampi la somma
Scrivere una funzione che accetti in input 1 Character lo stampi
Scrivere un un valore primitivo per int, double e char e fare autoboxing
Scrivere un oggetto per Integer, Double e Character e fare Unboxing */

package java_advanced;
public class AutoboxingUnboxing {
    public static void main(String[] args) {
        int primitive = 5;
        Integer autoBoxing = primitive;

        double primitive2 = 5.66667;
        Double autoBoxing2 = primitive2;

        char primitive3 = 'c';
        Character autoBoxing3 = primitive3;

        Integer object = 5;
        int unboxing = object;

        Double object2 = 5.66959432;
        double unboxing2 = object2;

        Character object3 = 'c';
        char unboxing3 = object3;


    }
    public static void sumInt(int num1, int num2){
        int sum = num1 + num2;
        System.out.println(sum);
    }
    public static void printChar(char char1){
        System.out.println(char1);
    }
    public static void printInteger (Integer num1, Integer num2){
        System.out.println(Integer.sum(num1, num2));
    }
    public static void printCharacter (Character char1){
        System.out.println(char1);
    }

}
