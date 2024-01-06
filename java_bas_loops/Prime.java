import java.util.Scanner;

public class Prime {
    public static void main(String arg[]){
        Scanner var =new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int num=var.nextInt();
        int i=2;
        while (i<=num) {
            if(num%i==0){
                continue;
            }
            i++;
        }
        System.out.println("No is Prime");
    }
}
