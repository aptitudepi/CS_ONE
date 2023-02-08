/** 
Problem Name: FYI
Difficulty: 1.3pt
Submission ID: 9372085
**/
import java.util.Scanner;

public class FYI {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    String n = s.nextLine();
    if (Integer.valueOf(n.substring(0,3)) == 555) {
      System.out.println(1);
    } else {
      System.out.println(0);
    }
    s.close();
  }
}