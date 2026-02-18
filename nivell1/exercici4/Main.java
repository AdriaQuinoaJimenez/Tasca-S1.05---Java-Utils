package nivell1.exercici4;

import java.io.*;

public class Main {
    public static void main(String[] args) {

        if (args.length != 2) {
            System.err.println("Error. Missing argument! Please provide a file path and filename.");
            return;
        }

        File directory = new File(args[0]);
        String filename = args[1];

        System.out.println("Buscando archivo: " + filename + ", en el directorio " + directory.getAbsolutePath());
        if (!directory.exists() || !directory.isDirectory()) {
            System.err.println("The path does not exist or is not a directory.");
            return;
        }

        File foundFile = findFileInDirectory(directory, filename);
        if(foundFile != null){
            System.out.println("File found!");
            readExternFile(foundFile);
        }else{
            System.out.println("Error: File " + foundFile + " not found in this directory");
        }
    }

    public static void readExternFile(File file) {
        try(BufferedReader br = new BufferedReader(new FileReader(file))){
            String line;
            while((line = br.readLine()) != null){
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Error reading extern file: " +  e.getMessage());
        }
    }

    public static File findFileInDirectory(File directory, String filename){
        File[] files = directory.listFiles();

        if(files == null){
            return null;
        }

        for (File f : files){
            if (f.isFile() && f.getName().equalsIgnoreCase(filename)) {
                return f;
            }

        }
        return null;
    }
}
