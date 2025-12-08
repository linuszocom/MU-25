package vecka50.part5_user_database;

import java.io.*;
import java.sql.SQLOutput;
import java.util.Scanner;

public class UserDatabase {

    static void main(String[] args) {

        try {

            // SPARA data
            Scanner console = new Scanner(System.in);
            BufferedWriter writer = new BufferedWriter(new FileWriter("users.txt", true));

            System.out.println("Ange namn: ");
            String inputName = console.nextLine();

            System.out.println("Ange ålder: ");
            String inputAge = console.nextLine();

            writer.write(inputName + ":" + inputAge);
            writer.newLine();
            writer.close();

            System.out.println("Användare är sparad!");

            // LÄSA data
            BufferedReader reader = new BufferedReader(new FileReader("users.txt"));
            String line;

            System.out.println("--- LISTA ---");

            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(":");
                String name = parts[0];
                String age = parts[1];

                System.out.println("Namn: " + name + ", Ålder: " + age);
            }

            reader.close();



        } catch (
                IOException e) {
            e.printStackTrace();
        }
    }
}
