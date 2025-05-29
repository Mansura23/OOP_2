package Games;

import java.util.Random;
import java.util.Scanner;

public class NumGuessMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Let the game begin!");
        System.out.println("Enter your name");
        String name=sc.nextLine();
        Random random = new Random();
        int randomNumber = random.nextInt(101);
        NumberGuess ng=new NumberGuess(name,randomNumber);

        while (true){
            if(!sc.hasNextInt()){
                System.out.println("Please enter valid number.Please try again");
                continue;
            }
            int num=sc.nextInt();
            if(ng.checkingNumber(num)==0){
                System.out.println("Congratulations, "+name);
                break;
            } else if (ng.checkingNumber(num)==1) {
                System.out.println(" Your number is too big. Please, try again.");
            }
            else{
                System.out.println(" Your number is too small. Please, try again ");
            }
        }

    }
}
