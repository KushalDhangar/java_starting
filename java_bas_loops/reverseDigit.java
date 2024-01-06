import java.util.Scanner;
public class reverseDigit {
    public static void main(String arg[]){
        Scanner var=new Scanner(System.in);
        System.out.println("Enter a Number To Reverse it ");
        int num=var.nextInt();
        while(num>0){
           int lastDigit=num%10;
           System.out.print(lastDigit);
            num=num/10;
        }
        System.out.println();
    }
}
