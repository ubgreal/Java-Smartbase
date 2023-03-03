package ControlStatements.Selection.If_Statements;

public class Multiplo {

    public static void main(String[] args) {

        int num1 = 3;
        int num2 = 9;
        int resultado = num1 % num2;
        if (resultado == 0) {
            System.out.println("Es multiplo");
        } else if (resultado < 0) {
            System.out.println("0");
        }else{
            System.out.println("No es multiplo");
        }
    }
}
