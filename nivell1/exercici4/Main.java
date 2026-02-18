package nivell1.exercici4;

import nivell1.exercici4.model.ReadFile;

import java.io.*;

public class Main {
    public static void main(String[] args) {

        if (args.length != 2) {
            System.err.println("Error. Missing argument! Please provide a file path and filename.");
            return;
        }

        ReadFile app = new ReadFile(args[0], args[1]);
        app.run();
    }
}
