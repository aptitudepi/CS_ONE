import java.util.Scanner;

public class StringComparison {  
  public static void main(String[] args) {
    //Define Scanner and User Inout as Strings.
    Scanner sc = new Scanner(System.in);
    String word = sc.nextLine();
    String anotherWord = sc.nextLine();
    String  yetAnotherWord = sc.nextLine();
    //Manual Sort via complex, unreadable if-else-if-statements 
    if (word.compareTo(anotherWord) <= 0 && anotherWord.compareTo(yetAnotherWord) <= 0) {
        System.out.print(word + ", " + anotherWord + ", " + yetAnotherWord);
    } else if (word.compareTo(yetAnotherWord) <= 0 && yetAnotherWord.compareTo(anotherWord) <= 0) {
      System.out.print(word + ", " + yetAnotherWord + ", " + anotherWord);
    } else if (word.compareTo(yetAnotherWord) <= 0 && word.compareTo(yetAnotherWord) <= 0) {
      System.out.print(anotherWord + ", " + word + ", " + yetAnotherWord);
    } else if (anotherWord.compareTo(yetAnotherWord) <= 0 && yetAnotherWord.compareTo(word) <= 0) {
      System.out.print(anotherWord + ", " + yetAnotherWord + ", " + word);
    } else if (yetAnotherWord.compareTo(word) <= 0 && word.compareTo(anotherWord) <= 0) {
      System.out.print(yetAnotherWord + ", " + word + ", " + anotherWord);
    } else if (yetAnotherWord.compareTo(anotherWord) <= 0 && word.compareTo(yetAnotherWord) <= 0) {
      System.out.print(yetAnotherWord + ", " + anotherWord + ", " + word);
    } else {
      System.out.print(yetAnotherWord + ", " + anotherWord + ", " + word);
    }
    //Close Scanner to prevent memory leaks.
    sc.close();
  }
}