public class ifelseFac {
    public static void main(String[] args) {
        String tre = "freeze";
        String cinque = "buzz";
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
            System.out.println(value(i));
        }

    }

    public static String value(int x) {
        String empty = "";

        if ((x % 3 == 0) && (x % 5 == 0)) {
            empty = "freezebuzz";
        } else if (x % 3 == 0) {
            empty = "freeze";
        } else if (x % 5 == 0) {
            empty = "buzz";
        }
        return empty;
    }
}



