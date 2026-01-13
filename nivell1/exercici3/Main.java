package nivell1.exercici3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String fileName = "files.txt";

        if (args.length != 1) {
            System.err.println("Error. Missing argument! Please provide a directory path.");
            return;
        }

        File directory = new File(args[0]);
        if (!directory.exists() || !directory.isDirectory()) {
            System.err.println("The path does not exist or is not a directory.");
            return;
        }

        try(BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            listDirectoryAndFiles(directory, "", writer);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void listDirectoryAndFiles(File directory, String prefix, BufferedWriter writer) throws IOException {
        File[] files = directory.listFiles();

        if(files == null){
            return;
        }

        Arrays.sort(files);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        for (File file : files) {
            String type;
            String date;

            if(file.isDirectory()){
                type = "D";
            }else{
                type = "F";
            }
            date = sdf.format(file.lastModified());
            writer.write(prefix + file.getName() + " - " + type + " - " + date);
            writer.newLine();

            if(file.isDirectory()){
                listDirectoryAndFiles(file, prefix + "\t", writer);
            }
        }
    }
}
