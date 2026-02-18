package nivell1.exercici4.model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    private File directory, foundFile;
    private String filename;

    public ReadFile(String directoryPath, String filenamePath) {
        this.directory = new File(directoryPath);
        this.filename = filenamePath;
    }

    public void run(){
        if(!verifyDirectory()){
            return;
        }

        foundFile = findFileInDirectory(directory, filename);
        if(foundFile != null){
            System.out.println("File found!");
            readExternFile(foundFile);
        }else{
            System.out.println("Error: File " + foundFile + " not found in this directory");
        }
    }

    public boolean verifyDirectory(){
        System.out.println("Buscando archivo: " + filename + ", en el directorio " + directory.getAbsolutePath());
        if (!directory.exists() || !directory.isDirectory()) {
            System.err.println("The path does not exist or is not a directory.");
            return false;
        }
        return true;
    }

    public void readExternFile(File file) {
        try(BufferedReader br = new BufferedReader(new FileReader(file))){
            String line;
            while((line = br.readLine()) != null){
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Error reading extern file: " +  e.getMessage());
        }
    }

    public File findFileInDirectory(File directory, String filename){
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
