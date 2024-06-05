package IO;

import java.io.*;

public class WriteFile {
    public WriteFile(String fileName, String dataToBeWrite) {
        try {
            FileWriter file = new FileWriter(fileName);
            file.write(dataToBeWrite);
            file.close();
        } catch (IOException e) {
            System.out.println("Something Went Wrong file writing to the file: " + fileName);
        }
    }
}
