package nivell1.exercici1.model;

import java.io.File;
import java.util.Arrays;

public class OrderList {
    private File directory;
    private String[] filesList;

    public OrderList(String directoryPath) {
        directory = new File(directoryPath);
    }

    public void run(){
        if(!verifyDirectory()){
            return;
        }

        orderList();
    }

    public boolean verifyDirectory(){
        if (!directory.exists() || !directory.isDirectory()) {
            System.err.println("The path does not exist or is not a directory.");
            return false;
        }
        return true;
    }

    public void orderList(){
        filesList = directory.list();

        if(filesList == null || filesList.length == 0){
            System.out.println("The directory is empty");
            return;
        }

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
