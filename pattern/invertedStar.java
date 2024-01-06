import java.util.Scanner;

public class invertedStar {
    public static void main(String arg[]){
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter a Value : ");
        int num=obj.nextInt();
        for(int i=1;i<=num;i++){
            for(int j=1;j<=num-i+1;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
