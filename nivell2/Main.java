package nivell2;

import java.io.*;
import java.util.Properties;

import static nivell1.exercici3.Main.listDirectoryAndFiles;

public class Main {
    public static void main(String[] args) {
        Properties prop = new Properties();

        try(FileInputStream fis = new FileInputStream("config.properties")) {
            prop.load(fis);

            String inputPath = prop.getProperty("read_this_directory");
            String outputPath = prop.getProperty("output_file");

            File directory = new File(inputPath);
            try(BufferedWriter writer = new BufferedWriter(new FileWriter(outputPath))) {
                listDirectoryAndFiles(directory, "", writer);
            }
        }catch(IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
