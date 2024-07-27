import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = 0;
        int attempts = 8;
        boolean playAgain = true;

        System.out.println("Welcome to Number Game");

        while (playAgain) {
            int random = getrandom(1, 100);
            boolean guess = false;

            for (int i = 1; i <= attempts; i++) {
                System.out.print("Enter your guess No. " + i + " :");
                int user = sc.nextInt();

                if (user == random) {
                    guess = true;
                    score += 1;
                    System.out.println("You won it");
                    break;
                } else if (user > random) {
                    System.out.println("You have gone more");
                } else {
                    System.out.println("You are behind it");
                }
            }

            if (!guess) {
                System.out.println("You losed it, The random number is " + random);
            }

            System.out.println("Do you want to play Again dear");
            String pA = sc.nextLine();
            playAgain = pA.equalsIgnoreCase("y");

            System.out.println("Score" + score);
        }
    }

    public static int getrandom(int a, int b) {
        return (int) (Math.random() * (a + b) + a);
    }
}
