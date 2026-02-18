package nivell1.exercici2.model;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Arrays;

public class OrderListFormat {
    private File directory;

    public OrderListFormat(String directoryPath) {
        this.directory = new File(directoryPath);
    }

    public void run(){
        if(!verifyDirectory()){
            return;
        }

        listDirectoryAndFiles(directory, "");
    }

    public boolean verifyDirectory(){
        if (!directory.exists() || !directory.isDirectory()) {
            System.err.println("The path does not exist or is not a directory.");
            return false;
        }
        return true;
    }

    public void listDirectoryAndFiles(File currentDir, String prefix){
        File[] files = currentDir.listFiles();

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
