import java.util.Scanner;

public class characterPattern {
    public static void main(String arg[]){
        Scanner obj=new Scanner(System.in);
        //char ch='1';
        int e=1;
        System.out.print("Enter a Value : ");
        int num=obj.nextInt();
        for(int i=1;i<=num;i++){
            for(int j=1;j<=i;j++){
                // System.out.print(ch+" ");
                 System.out.print(e+" ");
                // ch++;
                e++;
            }
            System.out.println();
        }

    }
}
