import java.util.Scanner;
public class countDigitofN {
   public static void main(String arg[]){
        Scanner var=new Scanner(System.in);
        System.out.print("Enter a Number To count it's Digit : ");
        int num=var.nextInt();
        int count=0;
        while(num>0){
          int lastDigit=num%10;
          System.out.print(lastDigit);
            num=num/10;
            count++;
        }
        System.out.println("\nThe Digits in a Number is : "+count);
   } 
}
