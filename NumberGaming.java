//My Internship of the first task is number game.
  
import java.util.Random; 
import java.util.Scanner; 
  
public class NumberGaming { 
    public static void main(String[] args) 
    { 
        int answer, guess; 
  
        final int MAX = 100; 
  
        Scanner in = new Scanner(System.in); 
  
        Random rand = new Random(); 
  
        boolean correct = false; 
  
        answer = rand.nextInt(MAX) + 1; 
  
        while (!correct) { 
  
            System.out.println( 
                "Guess a number between 1 and 100: "); 
  
            guess = in.nextInt(); 
  
            if (guess > answer) { 
                System.out.println("Too high, try again"); 
            } //End of the if block.
  
            else if (guess < answer) { 
                System.out.println("Too low, try again"); 
            } //End of the else if block.
  
            else { 
                System.out.println( 
                    "Yes, you guessed the number."); 
  
                correct = true; 
            } //End of the else.
        } //End of the while block.
        System.exit(0); 
    } //End of the main method.
}//End of the class.