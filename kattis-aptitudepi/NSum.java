/** 
Problem Name: N-sum
Difficulty: 1.4pt
Submission ID: 9449880
**/

import java.util.Scanner;

public class NSum {  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int totalInts = s.nextInt();
    int total = 0;
    for (int i = 0; i < totalInts; i++) {
      total += s.nextInt();
    }
    System.out.println(total);
    s.close();
  }
}