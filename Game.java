import java.util.Random;
import java.util.Scanner;

public class Game{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        
        //Game options
        String[]choices = {"Rock", "Paper", "Scissors"};
        
        //Score tracker
        int User = 0;
        int Computer = 0;
        
        
        //Start game
        System.out.println("Welcome to rock, paper, scissors!");
        System.out.println("Enter 'rock', 'paper', 'scissors' or 'quit'");
        
        while(true){
            System.out.print("\nYour choice: ");
            String userChoice = scan.nextLine().toLowerCase();
            
            //if user enters quit, exit
            if(userChoice.equals("quit")){
                break;
            }
            
            // if not in choices, new game
            if(!(userChoice.equals("rock")) && !(userChoice.equals("paper")) && !(userChoice.equals("scissors"))){
                System.out.println("Enter rock, paper or scissors");
                
                continue;
            }
            
            //display computer's choice
             int computerIndex = random.nextInt(3);
            String computerChoice = choices[computerIndex];
            
            System.out.println("Computer's choice: "+computerChoice);
            
            if(userChoice.equals(computerChoice)){
                System.out.println("Tie!");
            }
            else if((userChoice.equals("rock") && computerChoice.equals("scissors")) || 
            
            (userChoice.equals("paper") && computerChoice.equals("rock")) || 
            
            (userChoice.equals("scissors") && computerChoice.equals("paper"))){
                
                System.out.println("You win!");
                User++;
            }
            
            else{
                System.out.println("Computer wins!");
                Computer++;
            }
               
            System.out.println("Scores: You: "+User+ " Computer: "+Computer);
        }
        //display final scores
        System.out.println("\nFinal Score:");
        System.out.println("You: "+User);
        System.out.println("Computer: "+Computer);
        System.out.println("Thanks for playing!");
        scan.close();
        
    }
}
