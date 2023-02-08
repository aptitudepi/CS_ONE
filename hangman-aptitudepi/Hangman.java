import java.util.Scanner;

public class Hangman {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); // Setup Scanner
    String initWord = sc.nextLine().toLowerCase(); // Take User Input Word
    int guessesRemaining = 9, guesses = 0;
    // Replace the letters with dashes
    String hiddenString = "-".repeat(initWord.length());
    while (guessesRemaining > 0) {
      if (guessesRemaining == 1) {
        System.out.printf("%s, %d incorrect guess left\n", hiddenString, guessesRemaining);
      } else {
        System.out.printf("%s, %d incorrect guesses left\n", hiddenString, guessesRemaining);
      }
      String guess = sc.next(); // Take user's guess char as String
      if (initWord.indexOf(guess) == -1) { // If the user's guess letter is incorrect, tell the user
        System.out.printf("%s is not in the word\n", guess);
        guessesRemaining--;
      } else { // If the user's guess is correct, tell the user replace the respective letters in the hidden string
        System.out.printf("%s is in the word\n", guess);
        for (int index = initWord.indexOf(guess); index >= 0; index = initWord.indexOf(guess, index + 1)) {
          hiddenString = hiddenString.substring(0, index) + guess + hiddenString.substring(index + 1);
        }
      }
      guesses++; // Prevents the user from getting infinite guesses
      if (hiddenString.toString().equals(initWord)) { // If the user guesses all the correct letters, break the loop and congratulate the winner with a chicken dinner
        System.out.printf("Congratulations! You guessed %s in %d guesses!", initWord, guesses);
        guessesRemaining = -1;
      }
    }
    if (guessesRemaining == 0) { // Consolation Prize for the loser
      System.out.printf("You lost! The word was %s\n", initWord);
    }
    sc.close();
  }
}