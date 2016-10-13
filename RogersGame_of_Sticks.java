import java.util.Scanner;
import java.util.Random; 
public class RogersGame_of_Sticks {
    public static void main() { 
        System.out.println("How many sticks do you want to play with?");
        Scanner scan = new Scanner(System.in); 
        Random rand = new Random(); 
        int sticks = scan.nextInt();
        boolean playing = true;
        System.out.println("Do you want to go first or second?");
        int turn = scan.nextInt();
        while(playing == true) {
            System.out.println("Sticks = " +sticks);
            if(sticks > 0 && turn == 1) {
                //players turn
                System.out.println("How many to take?"); 
                int take = scan.nextInt();
                sticks = sticks - take; 
                turn = 2;
                if(sticks <= 0) {
                    System.out.println("Game over. The computer won!");
                    playing = false; 

                }
            }
            if(sticks > 0 && turn == 2) { 
                //computers turn
                int take = 0;
                turn = 1;

                if(sticks % 4 == 0) {
                    take = 3;
                }
                if(sticks % 4 == 1) { 
                    take = rand.nextInt(); 
                }
                if(sticks % 4 == 2) {
                    take = 1;
                }
                if(sticks % 4 == 3) {
                    take = 2;
                }
                sticks = sticks - take; 
                System.out.println("The computer took "+take+" sticks");
                if(sticks == 1) {
                    System.out.println("The computer won!");
                    playing = false;
                    System.out.println("There are " +sticks+" Left");

                }
            }
        }
    }
}
