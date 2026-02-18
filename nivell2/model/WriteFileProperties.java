package nivell2.model;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Properties;

public class WriteFileProperties {
    private Properties prop;

    public WriteFileProperties() {
        this.prop = new Properties();
    }

    public void run(){
        readProperties();
    }

    public void readProperties(){
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

    public void listDirectoryAndFiles(File directory, String prefix, BufferedWriter writer) throws IOException {
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
