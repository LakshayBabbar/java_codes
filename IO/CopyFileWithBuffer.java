package IO;

import java.io.*;

public class CopyFileWithBuffer {

    public CopyFileWithBuffer(String inFile, String outFile) {
        try {
            BufferedReader srcFile = new BufferedReader(new FileReader(inFile));
            BufferedWriter destFile = new BufferedWriter(new FileWriter(outFile));
            String line;
            while ((line = srcFile.readLine()) != null) {
                destFile.write(line);
                destFile.newLine();
            }
            srcFile.close();
            destFile.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + inFile);
        } catch (IOException e2) {
            System.out.println("Something went wrong");
        }
    }
}
