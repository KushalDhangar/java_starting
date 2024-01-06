import java.util.Scanner;

public class oneToN {
    public static void main(String arg[]){
        Scanner obj=new Scanner(System.in);
        int i=1;
        System.out.print("Enter Value to Print from 1 to Your value : ");
        int n=obj.nextInt();
        while (i<=n) {
            System.out.println(i);
            i++;
        }
    }
}
