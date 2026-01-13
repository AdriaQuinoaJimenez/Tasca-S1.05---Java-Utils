package nivell1.exercici2;

import java.io.File;
import java.text.SimpleDateFormat;
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

        listDirectoryAndFiles(directory, "");
    }

    public static void listDirectoryAndFiles(File directory, String prefix) {
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
            System.out.println(prefix + file.getName() + " - " + type + " - " + date);

            if(file.isDirectory()){
                listDirectoryAndFiles(file, prefix + "\t");
            }
        }
    }
}
