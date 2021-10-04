import java.util.Random;
import java.util.Scanner;
public class RockPaperScissors {
    public static void main(String[] args) {
        boolean condition = true;
        while(condition){
            Scanner sca = new Scanner(System.in);
            int rounds;
            System.out.println("How many rounds of Rock, Paper, Scissors would you like to play? Max=10");
            String stringRounds = sca.nextLine();
            rounds = Integer.parseInt(stringRounds);
            if(rounds>10&&rounds<=0){
                System.out.println("This is an incorrect choice");
                condition = false;
            }
            int ties = 0;
            int userWins = 0;
            int compWins = 0;
        for(int i=1; i <=rounds; i++){
            System.out.println("Game: "+i+". Please select your choice 1=Rock, 2=Paper and 3=Scissors.");
            int choice = sca.nextInt();
            Random rng = new Random();
            int compChoice = rng.nextInt(3)+1;
            if(choice==1&&compChoice==2){
                result(compWins, 0);
            }else if(choice==1&&compChoice==3){
                result(userWins, 1);
            }else if(choice==2&&compChoice==1){
                result(userWins, 1);
            }else if(choice==2&&compChoice==3){
                result(compWins, 0);
            }else if(choice==3&&compChoice==1){
                result(compWins, 0);
            }else if(choice==3&&compChoice==2){
                result(userWins, 1);
                }else{
                    result(ties,2);
            }
        }
        if(userWins>compWins){
            System.out.println("The computer won!");
            tally(compWins,userWins,ties);
        }else if(compWins>userWins){
            System.out.println("The computer won!");
            tally(compWins,userWins,ties);
        }else{
            System.out.println("It's a tie!");
            tally(compWins,userWins,ties);
        }
            System.out.println("Would you like to play again?(y/n)");
            String answer = sca.nextLine();
            if(answer.equals("n")){
                condition = false;
                System.out.println();
                System.out.println("Thanks for playing!");
            }
        }
    }
    static void result(int winsTally, int winner){
        String[] option = {"Comp wins!","User wins!", "Tie!"};
        System.out.println(option[winner]);
        winsTally++;
    }
    static void tally(int compWins, int userWins, int ties){
        System.out.println("Comp wins: "+compWins);
        System.out.println("User wins: "+userWins);
        System.out.println("Ties: "+ties);
        System.out.println();
    }
}
