public class BreakContinueFac {
    public static void main(String[] args) {
        int a = 7;
        numbers(a);
    }

    public static void numbers(int x) {
        for (int i = 0; i <= x; i++) {

            if (i == 5) {
                continue;
            }else{

                System.out.println(i);

            }

        }
    }
}

