import IO.*;

public class CopyFileWithCommandLine {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Error: Insufficient arguments");
            System.exit(-1);
        }
        CopyFileWithBuffer file = new CopyFileWithBuffer(args[0], args[1]);
    }
}
