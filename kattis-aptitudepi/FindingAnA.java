/** 
Problem Name: Finding An A
Difficulty: 1.3pt
Submission ID: 9285758
**/
import java.util.Scanner;

public class FindingAnA {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String source = s.nextLine();
        System.out.println(source.substring(source.indexOf("a")));
        s.close();
      }
}
