// Rock Paper Scissors Game 🎮
// Author: Syed Arham Ali

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        
        String[] options = {"rock", "paper", "scissors"};
        
        System.out.println("🎮 Welcome to Rock, Paper, Scissors!");
        System.out.println("Type rock, paper, or scissors to play. Type exit to quit.");
        
        while (true) {
            System.out.print("\nYour choice: ");
            String userChoice = sc.nextLine().toLowerCase();
            
            if (userChoice.equals("exit")) {
                System.out.println("👋 Thanks for playing!");
                break;
            }
            
            if (!userChoice.equals("rock") && !userChoice.equals("paper") && !userChoice.equals("scissors")) {
                System.out.println("❌ Invalid choice! Try again.");
                continue;
            }
            
            String computerChoice = options[rand.nextInt(3)];
            System.out.println("Computer chose: " + computerChoice);
            
            if (userChoice.equals(computerChoice)) {
                System.out.println("🤝 It's a tie!");
            } 
            else if (
                (userChoice.equals("rock") && computerChoice.equals("scissors")) ||
                (userChoice.equals("paper") && computerChoice.equals("rock")) ||
                (userChoice.equals("scissors") && computerChoice.equals("paper"))
            ) {
                System.out.println("✅ You win!");
            } 
            else {
                System.out.println("❌ You lose!");
            }
        }
        
        sc.close();
    }
}
