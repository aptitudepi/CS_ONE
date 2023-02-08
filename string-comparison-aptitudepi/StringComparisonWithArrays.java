/* DO NOT GRADE THIS.*/
import java.util.Scanner;
import java.util.Arrays;

public class StringComparisonWithArrays {  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String word = sc.nextLine();
    String anotherWord = sc.nextLine();
    String  yetAnotherWord = sc.nextLine();
    String[] words = {word, anotherWord, yetAnotherWord};
    Arrays.sort(words);
    System.out.print(words[0] +  ", ");
    System.out.print(words[1] +  ", ");
    System.out.print(words[2]);
    sc.close();
  }
}