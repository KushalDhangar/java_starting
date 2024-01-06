import java.util.*;
public class my {
    public static void main(String arg[])
    {
        Scanner obj=new Scanner(System.in);
        int num=obj.nextInt();
        int fact=1;
        for(int i=1;i<=num;i++){
            fact =fact*i;
        }
        System.out.println("Factorial of "+num+" is : "+fact);

    }
}
