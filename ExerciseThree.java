public class ExerciseThree {
    public static void main(String[] args) {
        String[] islands= new String[4];
        islands[0]="Fiji";
        islands[1]="the Bermudas";
        islands[2]="the Azores";
        islands[3]="Cozumel";
        int[] index= new int[4];
        index[0]=1;
        index[1]=3;
        index[2]=0;
        index[3]=2;
        int y=0;
        int ref;
        while(y<4) {
            ref=index[y];
            System.out.print("island = ");
            System.out.println(islands[ref]);
            y=y+1;
        }
        int random = (int) (Math.random()*4);
        System.out.println("If I had to choose I would like to see "+islands[random]+"!");
    }
}

