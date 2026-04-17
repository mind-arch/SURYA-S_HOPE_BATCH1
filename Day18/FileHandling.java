import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {
    public static void main(String[] args) {
        try {
            // Create a new file
            File file = new File("example.txt");
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }

            // Write to the file
            FileWriter writer = new FileWriter("example.txt");
            writer.write("Hello, this is a sample file.\n");
            writer.write("This file is used for demonstrating file handling in Java.");
            writer.close();
            System.out.println("Successfully wrote to the file.");

            // Read from the file
            Scanner reader = new Scanner(file);
            System.out.println("Contents of the file:");
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                System.out.println(line);
            }
            reader.close();

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}