package BasicDataTypes.Strings;

import java.util.Scanner;

public class TestMayus {
    public static void main(String[] args) {

        // Inicio del programa y declaración de variables:
        Scanner scanner = new Scanner(System.in);
        String cadena;
// Solicitud de datos al usuario
        System.out.println("Este programa nos pide una cadena y comprueba si es una letra mayúscula.");
        System.out.print("Introduce la cadena que desees: ");
        cadena = scanner.nextLine();

// Realizamos Cálculos y mostramos en pantalla (Esta realizando una comparacion con codigo ASCII del teclado gracias a compareTo)
        if (cadena.length() != 1){
            System.out.println("La cadena no es una letra mayúscula");
            // }else if ((cadena > "A") && (cadena < "Z")) {
        }else if ((cadena.compareTo("A") >= 0) && (cadena.compareTo("Z")<=0)) {
            System.out.println("La cadena es una letra mayúscula.");
        }else {
            System.out.println("La cadena no es una letra mayúscula.");
        }
    }
}


/* Realiza un programa que lea una cadena por teclado y compruebe si es una letra mayúscula. */