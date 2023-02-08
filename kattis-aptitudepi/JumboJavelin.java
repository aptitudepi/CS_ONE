/** 
Problem Name: JumboJavelin
Difficulty: 1.3pt
Submission ID: 9312224
**/

import java.util.Scanner;

public class JumboJavelin {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int count = s.nextInt();
        int total = 0;
        for (int i = 0; i < count; i++) {
            total += s.nextInt();
        }
        total -= count;
        System.out.println(total + 1);
        s.close();
    }
}