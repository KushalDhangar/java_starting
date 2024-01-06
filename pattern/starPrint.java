import java.util.Scanner;

public class starPrint {
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter a VAlue : ");
        int num=obj.nextInt();
        for (int line=1;line<=num;line++){
             for(int j=1;j<=line;j++){
                System.out.print(" * ");
             }
             System.out.println();
        }
    }
}
