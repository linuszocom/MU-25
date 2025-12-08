package vecka50.part4_copy_files;

import java.io.*;

public class FileCopier {

    static void main(String[] args) {

        try {

            BufferedReader reader = new BufferedReader(new FileReader("story.txt"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("story_copy"));

            String line;

            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }

            reader.close();
            writer.close();

            System.out.println("Kopiering är klar");


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
