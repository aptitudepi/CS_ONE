/** 
Problem Name: Take Two Stones
Difficulty: 1.3pt
Submission ID: 9731923
**/

import java.util.Scanner;

public class TakeTwoStones {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    if (a % 2 == 1) {
      System.out.println("Alice");
    } else {
      System.out.println("Bob");
    }
    sc.close();
  }
}