import java.util.Scanner;
public class mart18diji {
    public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    System.out.print("Enter a sentence : ");
    String sentence=scanner.nextLine();
    int len=sentence.length();
    char ch;
    int chs;
    int sum=0,count=0;;
    

    for(int i=0;i<len;i++){
        ch=sentence.charAt(i);
        if(Character.isDigit(ch)){
           chs=Character.getNumericValue(ch);
           sum+=chs;
           count++;
        }
        
    }
    if(count!=0){
    System.out.printf("The sum of the digits is: %d",sum);
    }
    else{
        System.out.println("No numeric characters exist in the input string");
    }

    }  
}
