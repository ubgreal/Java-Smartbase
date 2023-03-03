package BasicDataTypes.Strings;

public class Disemvowel {
    public static void main(String[] args) {

        String cadena = "This website is for losers LOL!";
        String charsToRemove = "aeiou";

        for (char c: charsToRemove.toCharArray()) {
            cadena = cadena.replace(String.valueOf(c),"");
        }
        /*cadena = cadena.replaceAll("[^a-zA-Z]", "");*/
        System.out.println(cadena);

    }
}

