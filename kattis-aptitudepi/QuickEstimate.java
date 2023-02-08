/** 
Problem Name: Quick Estimate
Difficulty: 1.5pt
Submission ID: 9398503
**/

import java.util.Scanner;

public class QuickEstimate {  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    String[] lines = new String[n];
    for (int i = 0; i<n; i++) {
      lines[i] =  s.next();
    }
    for (int i = 0; i < lines.length; i++) {
      System.out.println(lines[i].length());
    }
    s.close();
  }
}