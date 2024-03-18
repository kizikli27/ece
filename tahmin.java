import java.util.Scanner;
import java.util.Random;

public class tahmin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rnd = new Random();
        int rand = rnd.nextInt(100, 1000);
        String randString = Integer.toString(rand);
        String number = "";
        int countCorrect = 0, countPlace = 0, countGuess = 0;
        char ch, chr;
        System.out.println(rand);
        while (!randString.equals(number)) {
            countCorrect = 0;
            countPlace = 0;
            System.out.print("Your guess : ");
            number = scanner.nextLine();
            int len = number.length();
            if (len == 3) {
                countGuess++;
                for (int i = 0; i < len; i++) {
                    ch = number.charAt(i);
                    chr = randString.charAt(i);
                    if (ch == chr) {
                        countCorrect++;
                        countPlace++;
                    } else {
                        for (int j = 0; j < len; j++) {
                            chr = randString.charAt(j);
                            if (ch == chr) {
                                countCorrect++;
                            }
                        }
                    }
                }
                if (countPlace != 3) {
                    System.out.printf("Correct digits: %d Correct Place: %d\n", countCorrect, countPlace);
                }
            } else {
                System.out.println("your guess must be 3 digits");
            }
        }

        System.out.println("Correctly guessed in " + countGuess + " tries");

    }
}

