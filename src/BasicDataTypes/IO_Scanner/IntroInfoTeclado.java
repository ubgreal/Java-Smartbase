package BasicDataTypes.IO_Scanner;

/* Realiza un programa que pida un número por teclado y nos indique si es par o impar.*/

import java.util.Scanner;

public class IntroInfoTeclado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        System.out.println("Este programa calcula si un número es par o impar.");
        System.out.print("Introduce el número: ");
        numero = scanner.nextInt();

        if (numero / 2 == 0) {
            System.out.println("Este numero es impar");
        }else{
            System.out.println("Este numero es par");
        }
    }
}
