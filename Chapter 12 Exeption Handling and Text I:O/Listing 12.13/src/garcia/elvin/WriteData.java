package garcia.elvin;

import java.io.File;
import java.io.PrintWriter;

public class WriteData {

    public static void main(String[] args) throws java.io.IOException {
	// write your code here
        File file = new File("scores3.txt");
        if (file.exists()) {
            System.out.println("File already exists");
            System.exit(1);
        }

        // Create a file
        PrintWriter output = new PrintWriter(file);

        // Write formatted output to the file
        output.print("John T Smith ");
        output.println(90);
        output.print("Eric k Jones ");
        output.println(85);

        // Close the file
        output.close();

        System.out.println(file.exists());
    }
}
