import java.util.Scanner;
import java.io.*;

public class FileCSV {
  public static void main(String[] args) {
    Scanner stdin = new Scanner(System.in), fin = null;
    String filename = "";
    try {
      System.out.println("\nPlease enter the filename:\n");
      filename = stdin.nextLine();
      fin = new Scanner(new File(filename));
    } catch (IOException IOErr) {
      System.out.println(
          "An IOException occurred, with message" + IOErr.getMessage() + ". The Stack Trace is shown below:\n\n");
      IOErr.printStackTrace();
    }
    int count = 0;
    while (fin.hasNextLine()) {
      count++;
      fin.nextLine();
    }
    String[] lines = new String[count], cells = new String[5];
    try {
      fin = new Scanner(new File(filename));
    } catch (IOException IOErr) {
      System.out.println(
          "An IOException occurred, with message" + IOErr.getMessage() + ". The Stack Trace is shown below:\n\n");
      IOErr.printStackTrace();
      fin.close();
      stdin.close();
      return;
    }
    for (int i = 0; i < count; i++) {
      lines[i] = fin.nextLine();
      cells = lines[i].split(", ");
      if (i > 0) {
        for (int j = 0; j < 4; j++) {
          cells[j] = cells[j].trim();
        }
        double wagesEarned = Integer.parseInt(cells[4]) * Double.parseDouble(cells[3]);
        if (Integer.parseInt(cells[2]) >= 18) {
          System.out.printf("%s %s, $%.2f\n", cells[1], cells[0], wagesEarned);
        }
      }
    }
    fin.close();
    stdin.close();
  }
}