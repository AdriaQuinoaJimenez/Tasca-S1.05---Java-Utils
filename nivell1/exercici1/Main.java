package nivell1.exercici1;

import nivell1.exercici1.model.OrderList;

public class Main {
    public static void main(String[] args) {

        if(args.length != 1){
            System.err.println("Error: Falta el argumento. Uso: java Main <ruta_directorio>");
            return;
        }

        OrderList app = new OrderList(args[0]);
        app.run();
    }
}