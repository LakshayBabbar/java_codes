import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WordCount {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java WordCount <file>");
            return;
        }

        String fileName = args[0];
        BufferedReader reader = null;
        int wordCount = 0; // Declare the wordCount variable here

        try {
            reader = new BufferedReader(new FileReader(fileName));
            String line;

            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\s+");
                wordCount += words.length;
            }

            System.out.println("The number of words in the file: " + wordCount);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
