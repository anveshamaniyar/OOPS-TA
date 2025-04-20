import java.io.*;  // Importing Java I/O classes

public class FileHandlingDemo {
    public static void main(String[] args) {
        String filename = "example.txt";

        // Writing to a file
        try (FileWriter writer = new FileWriter(filename)) {
            writer.write("Hello, this is a Java file handling example.");
            System.out.println("Data written successfully.");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }

        // Reading from a file
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            System.out.println("Reading from file:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
