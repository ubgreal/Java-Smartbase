package BasicDataTypes.IO_Scanner;

/*  Crea un programa que pida al usuario dos números y muestre el resultado de su división.
 Si el segundo número es 0, debe mostrar un mensaje de error.*/

import java.util.Scanner;

public class IntroInfoTelado2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        int b;

        System.out.print("Introduce el número primero: ");
        a = scanner.nextInt();
        System.out.print("Introduce el número segundo: ");
        b = scanner.nextInt();

            if (b > 0) {
                System.out.println("Este es el resultado.."+(a / b));
            } else if (b == 0) {
                System.out.println("Error");
            }
    }
}



