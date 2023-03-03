package ControlStatements.Selection.Switch_Statements;

public class Switch_Case {
    public static void main(String[] args) {

        String weather = "fefe";

        switch (weather) {
            case "Sunny":
                System.out.println("El tiempo es soleado");
                break;
                case "Cloudy":
                    System.out.println("El tiempo esta nublado");
                    break;
            default:
                System.out.println("No se pudo identificar el clima");
        }
    }
}
