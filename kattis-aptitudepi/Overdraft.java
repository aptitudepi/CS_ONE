/** 
Problem Name: Overdraft
Difficulty: 1.8pt
Submission ID: 9390541
**/
import java.util.Scanner;

public class Overdraft {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int total = 0;
    int minFund = 0;
    for (int i=0; i<n; i++) {
      int t = s.nextInt();
      total += t;
      minFund = Math.max(minFund, -total);
    }
    System.out.println(minFund);
    s.close();
  }
}