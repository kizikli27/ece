import java.util.Scanner;

public class aaa {
    public static void main( String args[] ) {
     Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a word: ");
    String word = scanner.nextLine().toLowerCase();

    if (isPairWord(word)) {
      System.out.println(word + " is a pair-word.");
    } else {
      System.out.println(word + " is not a pair-word.");
    }
  }

  /**
   * Checks if a word is a pair-word (each character appears exactly twice).
   *
   * @param word The word to check.
   * @return True if the word is a pair-word, False otherwise.
   */
  public static boolean isPairWord(String word) {
    // Create a character count dictionary.
    int[] charCounts = new int[26]; // Assuming only lowercase alphabets (a-z)

    for (char ch : word.toCharArray()) {
      // Check if character is a letter and increment its count.
      if (Character.isLetter(ch)) {
        int index = ch - 'a'; // Convert character to index (a=0, b=1, ...)
        charCounts[index]++;
      }
    }

    // Check if all character counts are equal to 2.
    for (int count : charCounts) {
      if (count != 2) {
        return false;
      }
    }

    return true;
  }
}
