package vecka50.part2_read_scanner;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class SimpleFileReader {

    static void main(String[] args) {

        try {

            File file = new File("story.txt");
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println("Läst: " + line);
            }

            scanner.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
