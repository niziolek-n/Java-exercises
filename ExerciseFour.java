public class ExerciseFour {
    public static void main(String[] args) {
        int x=4;
        while(x>0) {
            if(x>3) {
                System.out.print("a");
            }
            x=x-1;//How presented code should be ended to receive following result? a-b c-d e-f
            System.out.print("-");
            if(x==3) {
                System.out.print("b c");
            }
            x=x-1;
            if(x==2) {
                System.out.print("-");
                System.out.print("d e");
            }
            else {
                System.out.print("f");
            }
        }
    }
}
