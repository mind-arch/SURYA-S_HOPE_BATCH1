public class Filewriter {
    public static void main(String[] args) {
        String filePath = "output.txt"; // Specify the file path
        String content = "Hello, this is a sample content to write to the file.";

        try (java.io.FileWriter writer = new java.io.FileWriter(filePath)) {
            writer.write(content);
            System.out.println("Content written to the file successfully.");
        } catch (java.io.IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}