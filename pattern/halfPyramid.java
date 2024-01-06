import java.util.Scanner;

public class halfPyramid {
    public static void main(String arg[]){
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter a Value : ");
        int num=obj.nextInt();
        for(int i=1;i<=num;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
