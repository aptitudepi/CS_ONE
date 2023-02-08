/** 
Problem Name: Autori
Difficulty: 1.3pt
Submission ID: 9534049
**/

import java.util.Scanner;

public class Autori {  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    String full = s.nextLine();
    String[] fullArray = full.split("-");
    for (int i = 0; i < fullArray.length; i++) {
      System.out.print(fullArray[i].charAt(0));
    }
    s.close();
  }
}