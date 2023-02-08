import java.util.Scanner;
import java.io.*;
import java.util.Arrays;

public class StringStats {
  public static void main(String[] args) {
    Scanner stdin = new Scanner(System.in), fin = null;
    String filename = "", minword = "", maxword = "", alphaFirst = "", alphaLast = "";
    try {
      System.out.println("\nPlease enter the filename:\n");
      filename = stdin.next();
      fin = new Scanner(new File(filename));
    } catch (IOException IOErr) {
      System.out.println(
          "An IOException occurred, with message" + IOErr.getMessage() + ". The Stack Trace is shown below:\n\n");
      IOErr.printStackTrace();
    }
    int minlen = Integer.MAX_VALUE, maxlen = Integer.MIN_VALUE, count = 0, total = 0;
    double avglen;
    while (fin.hasNext()) {
      count++;
      total += fin.next().length();
    }
    avglen = (double) total / count;
    String[] lines = new String[count];
    try {
      fin = new Scanner(new File(filename));
    } catch (IOException IOErr) {
      System.out.println(
          "An IOException occurred, with message" + IOErr.getMessage() + ". The Stack Trace is shown below:\n\n");
      IOErr.printStackTrace();
      stdin.close();
      return;
    }
    for (int i = 0; i < count; i++) {
      lines[i] = fin.next();
      if (lines[i].length() < minlen) {
        minlen = lines[i].length();
        minword = lines[i];
      }
      if (lines[i].length() > maxlen) {
        maxlen = lines[i].length();
        maxword = lines[i];
      }
    }
    Arrays.sort(lines);
    alphaFirst = lines[0];
    alphaLast = lines[count - 1];
    try {
      FileWriter fout = new FileWriter("output.txt");
      fout.write(String.format("Shortest word: %s\n", minword));
      fout.write(String.format("Longest word: %s\n", maxword));
      fout.write(String.format("Average word length: %.3f\n", avglen));
      fout.write(String.format("Alphabetically first word: %s\n", alphaFirst));
      fout.write(String.format("Alphabetically last word: %s\n", alphaLast));
      fout.close();
      fin.close();
      stdin.close();
    } catch (IOException IOErr) {
      System.out.println(
          "An IOException occurred, with message" + IOErr.getMessage() + ". The Stack Trace is shown below:\n\n");
      IOErr.printStackTrace();
      stdin.close();
      return;
    }
  }
}