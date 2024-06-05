package IO;

import java.io.*;

public class FileSize {
    public FileSize() {
        try {
            FileInputStream file = new FileInputStream("bin.txt");
            int i = 0;
            while (file.read() != -1) {
                i++;
            }
            System.out.println(i + " Bytes");
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e2) {
            System.out.println("Something went wrong");
        }
    }
}
