package Games;

import java.util.Random;

public class NumberGuess {
    String name;
    int randomNumber;
    NumberGuess(String name, int number) {
        this.name = name;
        this.randomNumber = number;
    }
    public int checkingNumber(int guess) {
        return Integer.compare(guess, randomNumber);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRandomNumber() {
        return randomNumber;
    }

    public void setRandomNumber(int randomNumber) {
        this.randomNumber = randomNumber;
    }
}
