import java.util.Scanner;

public class soundex {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        getSoundex(word);

    }

    public static boolean isAlphaWord(String word) {
        char ch = 'a';
        int i = 0;
        boolean durum = false;

        while (!Character.isDigit(ch) && i < word.length()) {

            ch = word.charAt(i);
            i++;
        }
        if (Character.isDigit(ch)) {
            return false;
        } else {
            return true;
        }

    }

    public static int getCode(char ch) {
        if (ch == 'B' || ch == 'F' || ch == 'P' || ch == 'V') {
            return 1;
        } else if (ch == 'C' || ch == 'G' || ch == 'J' || ch == 'K' || ch == 'Q' || ch == 'S' || ch == 'X'
                || ch == 'Z') {
            return 2;
        } else if (ch == 'D' || ch == 'T') {
            return 3;
        } else if (ch == 'L') {
            return 4;
        } else if (ch == 'M' || ch == 'N') {
            return 5;
        } else if (ch == 'R') {
            return 6;
        } else {
            return -1;
        }

    }

    public static String buildCode(String word) {
        String soundexWord = "";

        char ch;
        word = word.toUpperCase();
        word = removeAdjacentDuplicates(word);
        System.out.println(word);
        soundexWord += word.charAt(0);
        for (int i = 1; i < word.length(); i++) {
            ch = word.charAt(i);
            int code = getCode(ch);
            if (code != -1) {
                soundexWord += code;
            }

        }

        return soundexWord;
    }

    /**
     * @param word
     * @return
     */
    public static String removeAdjacentDuplicates(String word) {
        String newWord = "";
        char ch, chNext = 'a';
        for (int i = 0; i < word.length() - 1; i++) {
            ch = word.charAt(i);
            chNext = word.charAt(i + 1);
            if (ch != chNext) {
                newWord += ch;
            }

        }
        newWord += chNext;

        return newWord;
    }

    public static String removeLetters(String word, String word2) {
        char ch = 'a', chWord2 = 'b';
        String newWord = "";
        word = word.toUpperCase();
        newWord += word.charAt(0);
        // int i = 1;
        // int j=0;
        for (int i = 1; i < word.length(); i++) {
            ch = word.charAt(i);
            if (!word2.contains(Character.toString(ch))) {
                newWord += ch;
            }
        }

        return newWord;
    }

    public static String padCode(String word) {
        String newWord = word;
        if (word.length() == 2) {
            newWord += "00";
        } else if (word.length() == 3) {
            newWord += "0";

        } else if (word.length() == 1) {
            newWord += "000";
        } else if (word.length() > 4) {
            for (int i = 0; i < 4; i++) {
                newWord += word.charAt(i);
            }
        }
        return newWord;
    }

    public static String getSoundex(String word) {
        String soundexWord = "";
        boolean isAlpha = isAlphaWord(word);
        char ch;
        if (!isAlpha) {
            System.out.println("Characters must be alphabetic...");//return "";
        } else {
            soundexWord = removeLetters(word, "HWYAEIOU");
            
            System.out.println(soundexWord);
        }

    }

}