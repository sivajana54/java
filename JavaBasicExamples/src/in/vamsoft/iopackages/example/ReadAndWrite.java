package in.vamsoft.iopackages.example;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadAndWrite {

  /**
   * File read and write.
   * 
   * @param args.
   */
  public static void main(String[] args) throws FileNotFoundException {
    String file = "ReadAndWriteFile.txt";
    String line = null;

    try {

      FileWriter fileWriter = new FileWriter(file);

      BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

      bufferedWriter.write("Hello");
      bufferedWriter.write(" Welcome to java.");
      bufferedWriter.newLine();
      bufferedWriter.write("We are Learning");
      bufferedWriter.write(" java here");

      bufferedWriter.close();
    } catch (IOException ex) {
      System.out.println("Error writing to file '" + file + "'");

    }

    try {
      FileReader fileReader = new FileReader(file);
      BufferedReader bufferedReader = new BufferedReader(fileReader);

      while ((line = bufferedReader.readLine()) != null) {
        System.out.println(line);
      }

      // Always close files.
      bufferedReader.close();

    } catch (IOException e) {
      System.out.println("input output exception");
    }
  }

}
