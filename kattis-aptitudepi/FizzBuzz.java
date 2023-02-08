/** 
Problem Name: FizzBuzz
Difficulty: 1.3pt
Submission ID: 9285732
**/

import java.util.Scanner;

public class FizzBuzz {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int x = s.nextInt(), y = s.nextInt(), n = s.nextInt() + 1;
    for (int i = 1; i < n; i++) {
      if (i % x == 0 && i % y == 0) {
        System.out.println("FizzBuzz");
      } else if (i % x == 0) {
        System.out.println("Fizz");
      } else if (i % y == 0) {
        System.out.println("Buzz");
      } else {
        System.out.println(i);
      }
    }
    s.close();
  }
}



