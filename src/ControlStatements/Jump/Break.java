package ControlStatements.Jump;

public class Break {
    public static void main(String[] args) {
        int count = 0;
        while (count < 10) {
            count++;
            if(count == 6)
                break;

            // Break:  Rompe el bucle para salir de la iteración si encontramos lo que queríamos.

            System.out.println("Hola mundo" + count);
        }
        System.out.println("fin");
    }
}
