import java.util.Scanner;

public class posNeg {
    public static void main(String arg[]){
        Scanner num=new Scanner(System.in);
        System.out.println("Enter a Number ");
        int num1=num.nextInt();
        if(num1>=0){
            System.out.println("Number is Positive "+num1);
        }
        else{
             System.out.println("Number is Negative "+num1);
        }
    }
}
