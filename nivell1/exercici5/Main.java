package nivell1.exercici5;

import nivell1.exercici5.model.User;
import nivell1.exercici5.model.UserService;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        UserService app = new UserService(new User("Juan", 18));
        app.run();
    }
}
