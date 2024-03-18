import java.util.Scanner;

public class dna {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a nucleic acid sequence:");
        String word = scanner.nextLine();
        int len = word.length();
        char ch = 'a', ch1;
        int count = 1;
        String newWord = "";
        for (int i = 0; i < len; i++) {

            if (!(i + 1 == len)) {
                ch = word.charAt(i);
                ch1 = word.charAt(i + 1);
                if (ch == ch1) {
                    count++;
                } else {

                    newWord += ch;
                    newWord += count;
                    count = 1;
                    // System.out.println(count +"----"+ch+"-----"+newWord);
                }

            } else {
                newWord += ch;
                newWord += count;
            }

        }
        System.out.println(newWord);

    }

}
