/** 
Problem Name: Echo Echo Echo
Difficulty: 1.3pt
Submission ID: 9285815
**/

import java.util.Scanner;

public class EchoEchoEcho {  
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    String word = s.next();
    System.out.print(word + " " + word + " " + word);
    s.close();
  }
}