package rekursion;

import helper.Service;

public class Palindrom {

    static void main() {
        String word = Service.readString("Wort: ");
        String reversed = reversed(word.length()-1, "", word.toLowerCase());

        System.out.println((!word.equals(reversed) ? "Kein" : "") + "Palindrom");

    }

    static String reversed(int i, String reversed, String word) {
        reversed += String.valueOf(word.charAt(i));
        return i > 0 ? reversed(i-1, reversed, word) : reversed;
    }

}
