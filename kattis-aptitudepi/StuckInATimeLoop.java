/** 
Problem Name: Stuck In A Time Loop
Difficulty: 1.5pt
Submission ID: 9285832
**/

import java.util.Scanner;

public class StuckInATimeLoop {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt() + 1;
    for (int i = 1; i < n; i++) {
      System.out.println(i + " Abracadabra");
    }
    s.close();
  }
}