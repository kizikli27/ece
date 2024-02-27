import java.util.Scanner;
public class ifdeneme4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        try{
        System.out.print("Enter an integer value between  1 and " + sentence.length()+" :");
        int n = Integer.parseInt(scanner.nextLine());
        if (n <= 0 || n > sentence.length()) {
        System.out.println("Error - value must be between 1 and " + sentence.length() + ").");
        }
        String sntBegin=sentence.substring(0, n);
        String sntEnd=sentence.substring(sentence.length()-n);
        if(sntBegin.equals(sntEnd)){
            System.out.println("The first and last " + n + " characters are the same.");
        }
        else{
            System.out.println("The first and last " + n + " characters are not the same.");
        }
        }
        catch (NumberFormatException e) {
            System.out.println("Error - value must be an integer");
        }
        
        
    }

    }

