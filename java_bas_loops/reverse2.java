import java.util.Scanner;

public class reverse2 {
    public static void main(String arg[]){
        Scanner var=new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num=var.nextInt();
        int rev=0;
        int count=0;
        while(num>0){
          int lastDigit=num%10;
          num=num/10;
          rev=(rev*10)+lastDigit;
          count++;
        }
        System.out.println(rev);
        System.out.println("Counted digits are : "+count);
    }
}
