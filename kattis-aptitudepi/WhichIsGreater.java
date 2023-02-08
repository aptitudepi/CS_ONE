/** 
Problem Name: Which Is Greater?
Difficulty: 1.3pt
Submission ID: 9371962
**/
import java.util.Scanner;

public class WhichIsGreater {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int a = s.nextInt(), b = s.nextInt();
    if (a > b) {
      System.out.print(1);
    } else {
      System.out.print(0);
    }
    s.close();
  }
}
