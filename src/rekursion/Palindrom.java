package rekursion;

import helper.Service;

public class Palindrom {

    static void main() {
        String word = Service.readString("Wort: ");
        String reversed = reversed(word.length()-1, "", word.toLowerCase());

        if (word.equals(reversed)) {
            System.out.println("Palindrom");
        } else {
            System.out.println("Kein Palindrom");
        }

    }

    static String reversed(int i, String reversed, String word) {
        reversed += String.valueOf(word.charAt(i));
        return i > 0 ? reversed(i-1, reversed, word) : reversed;
    }

}
