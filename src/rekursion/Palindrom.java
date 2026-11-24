package rekursion;

import helper.Service;

public class Palindrom {

    static void main() {
        String word = Service.readString("Wort: ");
        String reversed = reverse(word.length()-1, "", word.toLowerCase());

        System.out.println((!word.equals(reversed) ? "Kein " : "") + "Palindrom");
    }

    static String reverse(int i, String reversed, String word) {
        return i >= 0 ? reverse(i-1, reversed + word.charAt(i), word) : reversed;
    }

}
