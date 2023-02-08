/** 
Problem Name: Magic Trick
Difficulty: 1.4pt
Submission ID: 9677880
**/

import java.util.Scanner;

public class MagicTrick {
  public static void main(String[] args){
    Scanner si = new Scanner(System.in);
    String User = si.nextLine();
    char[] UserInput = User.toCharArray();
    int n = 0;
    for (int i = 0; i < User.length(); i++) {
      for(int x = i + 1; x < User.length(); x++){
        if (UserInput[i] == UserInput[x]) {
          n+=1;
        }
      }
    }
    if (n!=0) {
        System.out.println(0);
    } else {
        System.out.println(1);
    }
    si.close();
  }

}