/** 
Problem Name: Simple Addition
Difficulty: 1.9pt
Submission ID: 9433128
**/

import java.math.BigInteger;
import java.util.Scanner;

public class SimpleAddition {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    BigInteger x = s.nextBigInteger(), y = s.nextBigInteger();
    BigInteger z = x.add(y);
    System.out.println(z);
    s.close();
    }
}



