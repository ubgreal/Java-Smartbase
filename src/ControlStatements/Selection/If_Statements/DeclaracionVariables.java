package ControlStatements.Selection.If_Statements;

/*  Declara dos variables numéricas (con el valor que desees), muestra por consola la suma,
 resta, multiplicación, división y módulo (resto de la división).
 */

/*  Declara 2 variables numéricas (con el valor que desees), he indica cual es mayor de los dos.
 Si son iguales indicarlo también. Ves cambiando los valores para comprobar que funciona.
 */

public class DeclaracionVariables {

    public static void main(String[] args) {

        int a = 5;
        int b = 6;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);

        if (a == b) {
            System.out.println("Son iguales");
        } else if (a > b) {
            System.out.println("A es mayor que B");
        } else if (a < b) {
            System.out.println("B es mayor que A");
        } else {
            System.out.println("Error de numero");
        }
    }
}



