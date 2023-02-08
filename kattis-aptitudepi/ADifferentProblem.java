/** 
Problem Name: A Different Problem
Difficulty: 2.8
Submission ID: 9312091
**/

import java.util.Scanner;

public class ADifferentProblem {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (s.hasNextLong()) {
            long a = s.nextLong();
            long b = s.nextLong();
            System.out.println(Math.abs(a-b));
        }
        s.close();
    }
}