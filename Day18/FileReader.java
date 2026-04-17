public class FileReader {
    public static void main(String[] args) {
        String filePath = "path/to/your/file.txt"; // Replace with your file path
        try (java.io.BufferedReader reader = new java.io.BufferedReader(new java.io.FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line); // Print each line of the file
            }
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }

        
    }
}
