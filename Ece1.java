import java.util.Scanner;
public class Ece1 {
    
    public static void main( String args[] ) 
    {
        Scanner scanner=new Scanner(System.in);
        String word,firstWord,secondWord;
        System.out.println("Kelime giriniz");
        word=scanner.nextLine();
        if(!word.equals("exit")){
            firstWord=word;
            word=scanner.nextLine();
            if(firstWord.compareTo(word)<0){
                secondWord=word;
            }
            else{
                secondWord=firstWord;
                firstWord=word;
                
            }

            while(!word.equals("exit")){
                 word=scanner.nextLine();
                 if(word.equals("exit")) {
                    if(firstWord.equals(secondWord))
                    {
                        System.out.println("Hata yeterli veri yok");
                        System.exit(0);                
                    }
                    
                }
                if(firstWord.compareTo(word)<0 && word.compareTo(secondWord)<0){
                    secondWord=word;
                }
                else if(word.compareTo(firstWord)<0){
                    secondWord=firstWord;
                    firstWord=word;
                }               
            }
            int lenSecond=secondWord.length();
            int i=0,j=lenSecond-1;
            String revSecond="";
            while(j>=0){
                revSecond+=secondWord.charAt(j);
                if(j!=0){
                revSecond+="*";
                }
                j--;

            }
            System.out.println(revSecond);
            /*while(i<lenSecond){
                System.out.print(revSecond.charAt(i));
                if(i==lenSecond-1){
                    System.exit(0);
                }
                System.out.print("*");
                i++;
            }*/
            //System.out.println(secondWord);
        }
        else{
            System.out.println("Hata yeterli veri yok");
            System.exit(0);

        }
    }
}
