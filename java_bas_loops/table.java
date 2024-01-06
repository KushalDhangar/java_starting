import java.util.Scanner;

public class table {
    public static void main(String arg[]){
        Scanner var=new Scanner(System.in);
        System.out.print("Enter Number for Table : ");
        int num=var.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(+num+" * "+i+" = "+num*i);
        }

    }
}
