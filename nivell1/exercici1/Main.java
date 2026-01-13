package nivell1.exercici1;

import java.io.File;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        if (args.length != 1) {
            System.err.println("Error. Missing argument! Please provide a directory path.");
            return;
        }

        File directory = new File(args[0]);
        if (!directory.exists() || !directory.isDirectory()) {
            System.err.println("The path does not exist or is not a directory.");
            return;
        }

        String[] filesList = directory.list();

        System.out.println("Unordered list: ");
        for (String fileName : filesList) {
            System.out.print(fileName + " | ");
        }

        Arrays.sort(filesList);

        System.out.println("\nOrdered list: ");
        for (String fileName : filesList) {
            System.out.print(fileName + " | ");
        }
    }
}