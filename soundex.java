import java.util.Scanner;

public class soundex {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        while (getSoundex(word).equals("-1")) {

            word = scanner.nextLine();

        }

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
        System.out.println(word + " 61 buildcode");
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
        if (word.length() > 1) {
            for (int i = 0; i < word.length() - 1; i++) {
                ch = word.charAt(i);
                chNext = word.charAt(i + 1);
                if (ch != chNext) {
                    newWord += ch;
                }

            }
            newWord += chNext;
        } else {
            newWord = word;
        }
        System.out.println(newWord + " 95 removeadjent");
        return newWord;
    }

    public static String removeLetters(String word, String word2) {
        char ch = 'a', chWord2 = 'b';
        String newWord = "";
        word = word.toUpperCase();
        newWord += word.charAt(0);
        for (int i = 1; i < word.length(); i++) {
            ch = word.charAt(i);
            if (!word2.contains(Character.toString(ch))) {
                newWord += ch;
            }
        }
        System.out.println(newWord + " 111 removeletters");
        return newWord;
    }

    public static String padCode(String word) {
        String newWord = word;
        int dgt=4-word.length();
        if (dgt<0){
           newWord= word.substring(0,4);
        }
        else {
            for(int i=0;i<dgt;i++){
                newWord+="0";
            }
        }
       /* if (word.length() == 2) {
            newWord += "00";
        } else if (word.length() == 3) {
            newWord += "0";
            
        } else if (word.length() == 1) {
            newWord += "000";
        } else if (word.length() > 4) {
            
        }
        for(int i=dgt;i<4;i++){
            
        }*/
        System.out.println(newWord + " 127 padcode");
        return newWord;
    }

    public static String getSoundex(String word) {
        String soundexWord = "";
        boolean isAlpha = isAlphaWord(word);
        char ch;
        if (!isAlpha) {
            System.out.println("Characters must be alphabetic...");// return "";
            return "-1";
        } else {
            soundexWord = removeLetters(word, "HWYAEIOU");
            soundexWord = buildCode(soundexWord);
            soundexWord = removeAdjacentDuplicates(soundexWord);
            soundexWord = padCode(soundexWord);
            System.out.println(soundexWord + " 144 getsoundex");
            return soundexWord;
        }

    }

}
