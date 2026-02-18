package nivell1.exercici2;

import nivell1.exercici2.model.OrderListFormat;

public class Main {
    public static void main(String[] args) {

        if (args.length != 1) {
            System.err.println("Error. Missing argument! Please provide a directory path.");
            return;
        }

        OrderListFormat app = new OrderListFormat(args[0]);
        app.run();
    }
}
