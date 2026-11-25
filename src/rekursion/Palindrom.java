package rekursion;

import helper.Service;

public class Palindrom {

    static void main() {
        String word = Service.readString("Wort: ");
        String reversed = reverse((word.length() - 1), "", word.toLowerCase());

        System.out.println((!word.substring(0, (word.length() + 1) / 2).equals(reversed) ? "Kein " : "") + "Palindrom");
    }

    static String reverse(int i, String reversed, String word) {
        return i > word.length() / 2 ? reverse(i-1, reversed + word.charAt(i), word) : reversed + word.charAt(i);
    }

}
