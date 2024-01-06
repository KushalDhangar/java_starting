import java.net.SocketPermission;
import java.util.Scanner;

public class sumOfEvenOdd {
    public static void main(String arg[]){
        Scanner var=new Scanner(System.in);
        int sumE=0,sumO=0;
        System.out.print("Enter A Number for calculate Sum of Even or Odd : ");
        int num=var.nextInt();
        for(int i=1;i<=num;i++){
            if(i%2==0){
                System.out.println(i);
                sumE=sumE+i;
            }
            else{
                System.out.println(i);
                sumO=sumO+i;
            }
        }
        System.out.println("Sum of Even is : "+sumE);
        System.out.println("Sum of ODD is : "+sumO);
    }

}
