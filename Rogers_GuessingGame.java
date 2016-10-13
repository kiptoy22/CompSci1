import java.util.Scanner;
import java.util.Random;
public class Rogers_GuessingGame {
    public static void main() {
        System.out.println("I'm thinking of a number!"); 
        System.out.println("Guess what it is! 0 to 1000!");
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int answer = rand.nextInt(1000); 
        boolean playing = true;
        int tries = 0;
        while(playing == true) {
            int guess = scan.nextInt(); 
            tries = tries + 1;
            if (guess == answer) {
                System.out.println ("You've done it!");
                System.out.println ("It took you");

                System.out.println (tries+"Tries:"); 
                System.out.println ("Do you want to play again? 1=YES, 2= NO."); 
                int repeat = scan.nextInt();
                if (repeat == 1) {
                    answer = rand.nextInt(1000); 
                    System.out.println("I'm thinking of a number!"); 
                    System.out.println("Guess what it is! 0 to 1000!");
                    tries = 0; 
                }
                if (repeat == 2) {
                    playing = false; 
                    System.out.println("Seeya next time!"); 
                }
            }
            if (guess < answer){ 
                System.out.println ("That's too low, try again!");
            }
            if (guess > answer){
                System.out.println ("That's too high, try again!"); 

            } 
        }

    }

}

