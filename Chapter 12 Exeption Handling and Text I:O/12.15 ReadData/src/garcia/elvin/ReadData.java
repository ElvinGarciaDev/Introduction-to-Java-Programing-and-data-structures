package garcia.elvin;

import java.io.File;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadData {

    public static void main(String[] args) throws FileNotFoundException {

        // create a file instance
        File file = new File("/Users/elvinmac/Desktop/12.15 ReadData/scores.txt");

        // Create a scanner for the file
        Scanner input = new Scanner(file);

        // read data from the file
        while (input.hasNext()) {
            System.out.println(input.nextLine());
        }

        // Close the file
        input.close();
    }
}
