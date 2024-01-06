import java.util.Scanner;

public class squarePattern {
    public static void main(String arg[]){
        Scanner var=new Scanner(System.in);
        System.out.print("How Many Rows You want in Your Square : ");
        int rowS=var.nextInt();
        System.out.print("How Many Columns You want in Your Square : ");
        int colS=var.nextInt();
        for(int i=1;i<=rowS;i++){
            for(int j=1;j<=colS;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
