package IO;

import java.io.*;

public class ReadFile {
    public ReadFile(String fileName) {
        try {
            FileReader file = new FileReader(new File(fileName));
            int c;
            while ((c = file.read()) != -1) {
                System.out.print((char)c);
            }
            file.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + fileName);

        } catch (IOException e2) {
            System.out.println("Something went wrong file reading file: " + fileName);
        }
    }
}
