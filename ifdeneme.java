import java.util.Scanner;

public class ifdeneme {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first value: ");
        int value1 = scanner.nextInt();

        System.out.print("Enter the second value: ");
        int value2 = scanner.nextInt();
        int roundValue1,roundValue2,reminder1,reminder2;
        reminder1=value1%10;
        if(reminder1<5){
             roundValue1=value1-reminder1;
        }
        else{
             roundValue1=value1-reminder1+10;
            }

        if(roundValue1%3==0)
        {
            roundValue2=value2;
        }
        else{
            reminder2=value2%10;
            if(reminder2<5){
                roundValue2=value2-reminder2;
            }
            else{
                roundValue2=value2-reminder2+10;
            }
        }
        System.out.println(roundValue1+roundValue2);
           
    }
}
