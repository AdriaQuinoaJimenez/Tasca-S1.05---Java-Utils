package nivell1.exercici5;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        String file = "user.ser";
        User user1 = new User("Juan", 18);

        try(ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(file))){
            outputStream.writeObject(user1);
            System.out.println("Serialized user has been saved in: " + file);
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }

        try(ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(file))){
            User recoveredUser = (User) inputStream.readObject();
            System.out.println("User has been deserialized.");
            System.out.println(recoveredUser);
        }catch (IOException | ClassNotFoundException e){
            System.err.println("Error: " + e.getMessage());
        }
    }
}
