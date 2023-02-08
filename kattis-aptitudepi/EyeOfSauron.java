/** 
Problem Name: Eye Of Sauron
Difficulty: 1.3pt
Submission ID: 9285806
**/

import java.util.Scanner;

public class EyeOfSauron {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    String source = s.nextLine();
    String[] parts = source.split("\\(\\)");
    if (parts[0].length() == parts[1].length()) {
        System.out.println("correct");
    } else {
        System.out.println("fix");
    }
    s.close();
  }
}