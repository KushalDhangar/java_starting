import java.util.Scanner;

public class nNaturalReverse {
    public static void main(String arg[]){
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int num=obj.nextInt();
        for(int i=num;i>0;i--){
            System.out.println(i);
        }
    }
}
