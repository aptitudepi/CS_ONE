/** 
Problem Name: FizzBuzz
Difficulty: 1.3pt
Submission ID: 9285732
**/

import java.util.Scanner;

public class Grades {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int grade = sc.nextInt();
    if (grade > 100) {
      System.out.print("The number grade cannot be greater than 100.");
    } else if (grade <= 100 && grade >= 90) {
      System.out.println("Letter grade: A");
    } else if (grade < 90 && grade >= 80) {
      System.out.println("Letter grade: B");
    } else if (grade < 80 && grade >= 75) {
      System.out.println("Letter grade: C");
    } else if (grade < 75 && grade >= 70) {
      System.out.println("Letter grade: D");
    } else if (grade < 70 && grade >= 0) {
      System.out.println("Letter grade: F");
    } else if (grade < 0) {
      System.out.println("The number grade cannot be negative.");
    }
    sc.close();
  }
}



