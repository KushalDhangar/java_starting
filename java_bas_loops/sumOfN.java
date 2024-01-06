import java.util.Scanner;

public class sumOfN {
    public static void main (String arg[]){
        Scanner var=new Scanner(System.in);
        int sum=0,i=1;
        System.out.print("Enter Value To be find their sum : ");
        int n=var.nextInt();
        while (i<=n) {
            sum=sum+i;
            System.out.println(i);
            i++;
        }
        System.out.println("Sum From 1 to "+n+" is "+sum);

    }

}
