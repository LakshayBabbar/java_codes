package IO;

import java.io.*;

public class FileBufferReader {
    public FileBufferReader(String fileName) {
        try {
            BufferedReader file = new BufferedReader(new FileReader(fileName));
            String line;
            while ((line = file.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + fileName);
        } catch (IOException e2) {
            System.out.println("Something went wrong while reading file: " + fileName);
        }
    }
}