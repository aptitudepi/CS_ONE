/** 
Problem Name: Faktor
Difficulty: 1.3pt
Submission ID: 9285777
**/

import java.util.Scanner;

public class Faktor {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int a = s.nextInt(), i = s.nextInt() - 1, c = (a * i) + 1;
    System.out.println(c);
    s.close();
  }
}