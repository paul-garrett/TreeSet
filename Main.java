import java.util.*;
import java.io.*;

public class Main {
  public static void main(String[] args) {
    // Input file to scan
    String inputFile = "Flights.txt";
    String outputFile = "UniqueWords.txt";

    // Create TreeSet
    TreeSet<String> uniqueWords = new TreeSet<>();
    // try buffered reader new BuffereReader, new FileReader, new File(inputFile) - from line 6
    try(BufferedReader reader = new BufferedReader(new FileReader(new File(inputFile)))) {
    String line;
    while ((line = reader.readLine()) != null) {
      // split lines into individual words
      String[] words = line.split("\\s+");
      for (String word : words) {
        // Ignore punctuation and change to lower case
        word = word.replaceAll("[^a-zA-Z' ]", "").toLowerCase();
        if (!word.isEmpty()) {
          uniqueWords.add(word);
        }
      }
    }
    
    } catch (IOException e) {
      e.printStackTrace();
    }
    // write the unique wors to the output file UniqueWords.txt
    try(BufferedWriter writer = new BufferedWriter(new FileWriter(new File(outputFile)))) {
      for (String word : uniqueWords) {
        writer.write(word + "\n");
    }
  } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
