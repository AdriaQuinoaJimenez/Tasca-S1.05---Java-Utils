package nivell1.exercici5.model;

import java.io.*;

public class UserService {
    private User user;
    private String file = "user.ser";

    public UserService(User user) {
        this.user = user;
    }

    public void run(){
        serializingObject();
        deserializingObject();
    }

    public void serializingObject(){
        try(ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(file))){
            outputStream.writeObject(user);
            System.out.println("Serialized user has been saved in: " + file);
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    public void deserializingObject(){
        try(ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(file))){
            User recoveredUser = (User) inputStream.readObject();
            System.out.println("User has been deserialized.");
            System.out.println(recoveredUser);
        }catch (IOException | ClassNotFoundException e){
            System.err.println("Error: " + e.getMessage());
        }
    }
}
