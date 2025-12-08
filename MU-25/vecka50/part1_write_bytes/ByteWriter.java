package vecka50.part1_write_bytes;

import java.io.FileOutputStream;
import java.io.IOException;

public class ByteWriter {

    static void main(String[] args) {

        try {

            FileOutputStream fos = new FileOutputStream("story.txt");

            String text = "Java är ett roligt spåk. \n" +
                            "Här kommer rad 2. \n" +
                            "Vi övar på att spara filer. \n" +
                            "Heja Java!";

            byte[] bytes = text.getBytes();

            fos.write(bytes);
            fos.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
