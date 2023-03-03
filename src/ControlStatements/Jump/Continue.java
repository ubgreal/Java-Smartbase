package ControlStatements.Jump;

public class Continue {
    public static void main(String[] args) {

        int count = 0;
        while (count < 10) {
            count++;
            if(count == 6)
                continue;
// Continué significa que debe saltar a la siguiente iteración una vez finalizada.

            System.out.println("Hola mundo" + count);
        }
        System.out.println("fin");
    }
}
