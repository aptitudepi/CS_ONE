/** 
Problem Name: Greetings
Difficulty: 1.3pt
Submission ID: 9354424
**/

import java.util.Scanner;

public class Greetings {  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    String hey = s.nextLine();
    String[] heyArray = hey.split("(?!^)");
    int count = 0;
    for (int i = 0; i < heyArray.length; i++) {
      if (heyArray[i].contains("e")) {
        count++;
      }
    }
    System.out.print("h");
    for (int i = 0; i < (count * 2); i++) {
      System.out.print("e");
    }
    System.out.print("y");
    s.close();
  }
}