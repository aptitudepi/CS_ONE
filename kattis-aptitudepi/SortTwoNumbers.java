/** 
Problem Name: Sort Two Numbers
Difficulty: 1.4pt
Submission ID: 9272143
**/
import java.util.Scanner;

public class SortTwoNumbers {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int a = s.nextInt(), b = s.nextInt();
    if (a < b) {
      System.out.print(a + " " + b);
    } else {
      System.out.print(b + " " + a);
    }
    s.close();
  }
}
