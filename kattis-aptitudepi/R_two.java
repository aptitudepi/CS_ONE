/** 
Problem Name: R2
Difficulty: 1.1pt
Submission ID: 9276622
**/
import java.util.Scanner;

public class R_two {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int r_one = s.nextInt(), avg = s.nextInt();
    int r_two = (avg * 2) - r_one; 
    System.out.print(r_two);
    s.close();
  }
}
