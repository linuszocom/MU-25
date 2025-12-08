package vecka50.part3_analysis_stats;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileAnalyzer {

    static void main(String[] args) {

        try {

        FileReader fr = new FileReader("story.txt");
        BufferedReader reader = new BufferedReader(fr);

        String line;
        int lineCount = 0;
        int wordCount = 0;
        int charCount = 0;

        while ((line = reader.readLine()) != null) {
            lineCount++;
            charCount += line.length();

            String[] words = line.split(" ");
            wordCount += words.length;

            System.out.println(line);

            if (line.contains("spara")) {
                System.out.println("Jag hittade ordet!");
            }
        }

        reader.close();
            System.out.println("Rader: " + lineCount + ", Ord: " + wordCount + ", Tecken: " + charCount);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
