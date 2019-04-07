class Player {
    int number = 0;
    public void guess() {
        number = (int) (Math.random() * 10);
        System.out.println("number is " + number);
    }
}

class GuessingGame {
    Player p1;
    Player p2;
    Player p3;

    public void start() {
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();

        int typep1 = 0;
        int typep2 = 0;
        int typep3 = 0;

        boolean p1guessed = false;
        boolean p2guessed = false;
        boolean p3guessed = false;

        String p1guessedstr;
        String p2guessedstr;
        String p3guessedstr;

        int numberToGuess = (int) (Math.random() * 10);
        System.out.println("I am thinking about a number from 0 to 9...");

        while (true) {
            System.out.print("First player: ");
            p1.guess();
            System.out.print("Second player: ");
            p2.guess();
            System.out.print("Third player: ");
            p3.guess();

            typep1 = p1.number;
            typep2 = p2.number;
            typep3 = p3.number;

            if(typep1==numberToGuess) {
                p1guessed = true;
                p1guessedstr = "YES";
            }
            else {
                p1guessedstr = "NO";
            }
            if(typep2==numberToGuess) {
                p2guessed = true;
                p2guessedstr = "YES";
            }
            else {
                p2guessedstr = "NO";
            }
            if(typep3==numberToGuess) {
                p3guessed = true;
                p3guessedstr = "YES";
            }
            else {
                p3guessedstr = "NO";
            }

            if(p1guessed||p2guessed||p3guessed) {
                System.out.println("We have a winner! I was thinking about "+numberToGuess);
                System.out.println("Has the first player told correct number? " + p1guessedstr );
                System.out.println("Has the second player given correct answer? " + p2guessedstr );
                System.out.println("Has the third player guessed my number? " + p3guessedstr );
                System.out.println("End of the game.");
                break;
            }
            else {
                System.out.println("Please try again. I was thinking about " + numberToGuess+".");
            }
        }
    }
}

class Starter {
    public static void main(String[] args) {
        GuessingGame game = new GuessingGame();
        game.start();
    }
}
