import java.util.Scanner;
import java.io.*;

public class FileIOExam {
  public static void main(String[] args) throws IOException {
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
      fin.nextLine();
      count++;
    }
    int newCount = count/3;
    String[] desc = new String[newCount];
    int[] quant = new int[newCount];
    Double[] price = new Double[newCount];
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
    for(int i = 0; i < count; i++) {
      String line =  fin.nextLine();
      //System.out.println(line);
      if (i % 3 == 0) {
        desc[i/3] = line;
      }
      if (i % 3 == 1) {
        quant[i/3] = Integer.parseInt(line);
      } 
      if (i % 3 == 2) {
        price[i/3] = Double.parseDouble(line);
      }
      //i++;
    }
    
    FileWriter fout = new FileWriter("output.txt");
    for (int i = 0; i < count/3; i++) {
      try {
        fout.write(String.format("%s: $%.2f\n", desc[i], quant[i] * price[i]));
        //fout.close();
      } catch (IOException IOErr) {
        System.out.println(
            "An IOException occurred, with message" + IOErr.getMessage() + ". The Stack Trace is shown below:\n\n");
        IOErr.printStackTrace();
        fout.close();
        fin.close();
        stdin.close();
        return;
      }
    }
    fout.close();
    fin.close();
    stdin.close();
  }
}
