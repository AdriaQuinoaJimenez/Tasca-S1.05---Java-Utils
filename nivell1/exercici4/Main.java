package nivell1.exercici4;

import java.io.*;

public class Main {
    public static void main(String[] args) {

        if (args.length != 1) {
            System.err.println("Error. Missing argument! Please provide a directory path.");
            return;
        }

        File file = new File(args[0]);
        if (!file.exists() || !file.isDirectory()) {
            System.err.println("The path does not exist or is not a directory.");
            return;
        }
        readExternFile(file);
    }

    public static void readExternFile(File file) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("extern.txt"));
            String line;
            while((line = br.readLine()) != null){
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Error reading extern file: " +  e.getMessage());
        }
    }
}
