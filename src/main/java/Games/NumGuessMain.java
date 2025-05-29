package Games;

import java.util.Arrays;
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
        int[] numbers=new int[100];
        int count=0;
        while (true) {
            if(!sc.hasNextInt()){
                System.out.println("Please enter valid number.Please try again");
                sc.nextLine();
                continue;
            }
            int num=sc.nextInt();
            if (num>0 && num<=100){
                if(count<numbers.length){
                    numbers[count]=num;
                    count++;
                }
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
            else{
                System.out.println("Please enter number between 1 and 100");
                sc.nextLine();
            }
        }
        int [] guesses=new int[count];
        System.arraycopy(numbers, 0, guesses, 0, guesses.length);
        System.out.println("Your numbers ");
        Arrays.sort(guesses);
        System.out.println(Arrays.toString(guesses));
    }
}
