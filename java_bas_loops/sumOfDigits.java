import java.util.Scanner;

public class sumOfDigits {
   public static void main(String arg[]){
        Scanner var =new Scanner(System.in);
        System.out.print("Enter A Number to add its Digits : ");
        int num=var.nextInt();
        int sumOfDigit=0,lastDigit;
        while (num>0) {
            lastDigit=num%10;
            sumOfDigit=sumOfDigit+lastDigit;
            num=num/10;
        }
        System.out.println("Sum of Digit is "+sumOfDigit);

   } 
}
