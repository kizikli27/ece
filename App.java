import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner =new Scanner(System.in);
        System.out.print("Enter a word: ");

        String word=scanner.nextLine();
        String lowerWord=word.toLowerCase();
        int sumCount=0;
        int len=word.length();
        int j=0,i=0,count=0;
        char chi,chj;

        if(len%2!=0){
            System.out.printf("%s is not a pair-word!",word);
        }
        else{
            while (i<len){
                count=0;
                chi=lowerWord.charAt(i);
                while(j<len){
                    chj=lowerWord.charAt(j);
                    if(chi==chj){
                        count++;
                    }           
                j++;
                }
                if(count!=2){
                    System.out.printf("%s is not a pair-word!",word);
                    break;
                }        
        i++;
        j=0;  

        System.out.println(chi + " --" + count);
        sumCount+=count;
       }         
   }
   
   
    if(sumCount==len*2){
        String word2,lowerWord2;
        int lenWord2;
        System.out.printf("%s is a pair-word! \n",word);
        System.out.println("Enter a word2");
        word2=scanner.nextLine();
        lowerWord2=word2.toLowerCase();
        lenWord2=word2.length();
        int k=0,t=0;
        while(k<len){
            t=0;
            while(t<lenWord2){
                if(lowerWord.charAt(k)==lowerWord2.charAt(t)){
                    System.out.println(lowerWord.charAt(k));
                }
                t++;
                
            }
            k++;

        }


    }
    }
}
