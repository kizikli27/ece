import java.util.Scanner;
import java.lang.*;
public class substringornek {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Enter phone number: " );
        String phoneNumber = number.nextLine();
        int acparantez=phoneNumber.indexOf("(");
        int kapaparantez=phoneNumber.indexOf(")");
        char parantheses1 = '(';
        char parantheses2 = ')';
        char dash1 = '-';
        char dash2 ='-'; 
        
        String countryCode=phoneNumber.substring(acparantez+1,kapaparantez);

        //String countryCode = phoneNumber.substring(parantheses1,parantheses2);

        //String cityCode = phoneNumber.substring(parantheses2, dash1);
        //String phoneNum = phoneNumber.substring(dash1, dash2);
        //String phoneNum1 = phoneNumber.substring(dash2);
       
        System.out.printf("Country Code: %s %n", countryCode);
       // System.out.printf("City/Area Code: %s %n", cityCode);
        //System.out.printf("Phone Number: %s %.2s %.2s ", phoneNum,"-", phoneNum1);
        


        //(90)342-256-1122
        
        
    }
}
