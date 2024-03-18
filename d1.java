import java.util.Scanner;

public class d1 {
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);
        System.out.print("Enter a sentence :");
        String sentence=scanner.nextLine();
        int sentenceLength=sentence.length();
        System.out.print("Enter an integer value between 1 and "+sentenceLength + " :");
        double lenDouble=scanner.nextDouble();
        int lenint=(int)lenDouble;
        if(lenDouble!=lenint)
        {
            System.out.println("Error - value must be an integer");
        }
        else if(lenint>sentenceLength){
            System.out.println("Error - value must be between 1 and " + sentenceLength);
        }

        else{
            String beginOfSentence=sentence.substring(0, lenint);
            String endOfSentence=sentence.substring(sentenceLength-lenint);
            
            
            if(beginOfSentence.equals(endOfSentence)){
               String upper=beginOfSentence.toUpperCase();
               String lower=beginOfSentence.toLowerCase();
               if(upper.equals(beginOfSentence)){
                System.out.printf("First and last %d characters are the same and they are uppercase ",lenint);
               }

               else if(lower.equals(beginOfSentence)) {
                System.out.printf("First and last %d characters are the same and they are lowercase ",lenint);
               }
               else{
                
                    System.out.printf("First and last %d characters are the same",lenint);
                                          
                }
               
               
               
            }
            else{
                System.out.printf("First and last %d characters are not the same ",lenint);
            }
        }
        
    }
}
