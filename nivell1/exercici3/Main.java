package nivell1.exercici3;

import nivell1.exercici3.model.OrderListFormatInFile;

public class Main {
    public static void main(String[] args) {

        if (args.length != 2) {
            System.err.println("Error. Missing argument! Please provide a directory path.");
            return;
        }

        OrderListFormatInFile app = new OrderListFormatInFile(args[0], args[1]);
        app.run();
    }
}
