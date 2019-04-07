public class ExerciseOne {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        while (a < 5) {//How presented code should be ended to have following result? 11 34 59
            a = a + 1;
            b = b + a;
            System.out.print(a + "" + b + " ");
            a = a + 1;
        }
        a = 0;
        b = 0;
        System.out.println();
        while (a < 5) {//How presented code should be ended to have following result? 00 11 21 32 42
            b = a - b;
            System.out.print(a + "" + b + " ");
            a = a + 1;
        }
        a = 0;
        b = 0;
        System.out.println();
        while (a < 5) {//How presented code should be ended to have following result? 00 11 23 36 410
            b = b + a;
            System.out.print(a + "" + b + " ");
            a = a + 1;
        }
        a = 0;
        b = 0;
        System.out.println();
        while (a < 5) {//How presented code should be ended to have following result? 02 14 25 36 47
            b = b + 2;
            if (b > 4) {
                b = b - 1;
            }
            System.out.print(a + "" + b + " ");
            a = a + 1;
        }
    }
}

