package Codewars;

import java.util.Scanner;

// Para el cálculo de las potencias,disponemos de la función Math.pow(base, exponente);


// Inicio del programa y declaración de variables:
public class PotenciaNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int base;
        int exponente;

        // Solicitud de datos al usuario
        System.out.println("Calculamos la potencia de un número:");
        System.out.print("Introduce la base de la potencia: ");
        base = scanner.nextInt();
        System.out.println("Introduce el exponente de la potencia: ");
        exponente = scanner.nextInt();

        // Realizamos Cálculos y mostramos en pantalla
        if (base >= 1) {
            System.out.println("El resultado es " + (Math.pow(base, exponente)));
        }else if (exponente == 0) {
            System.out.println("El resultado es 1.");
        }else {
            System.out.println("El resultado es " + (Math.pow(base, 1/exponente)));
        }
    }
}

// Realiza un programa que calcule la potencia de un número, dado este y su exponente.
// Pueden ocurrir tres casos:
//* El exponente sea positivo: imprime resultado en pantalla.
//* El exponente sea 0, el resultado es 1.
//* El exponente sea negativo, el resultado es 1/potencia con el exponente positivo.