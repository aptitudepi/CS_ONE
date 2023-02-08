/** 
Problem Name: Cold-puter Science

Difficulty: 1.3pt
Submission ID: 9354458
**/

import java.util.Scanner;

public class Cold {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int total = 0;
    for (int i = 0; i < n; i++) {
      int[] t = new int[n];
      t[i] = s.nextInt();
      if (t[i] < 0) {
        total++;
      }
    }
    System.out.println(total);
    s.close();
  }
}



