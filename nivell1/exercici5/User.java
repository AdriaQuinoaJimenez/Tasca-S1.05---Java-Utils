package nivell1.exercici5;

import java.io.Serializable;

public class User implements Serializable {
    private String name;
    private int edad;

    public User(String name, int edad) {
        this.name = name;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "User{" + "name=" + name + ", edad=" + edad + '}';
    }
}
