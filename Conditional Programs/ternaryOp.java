import java.util.*;

public class ternaryOp {
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        /*System.out.print("Enter A number : ");
        int num=sc.nextInt();
        String type=(num%2==0)?"Even":"odd";
        System.out.println(type);*/
        System.out.print("Enter Your marks : ");
        int marks=sc.nextInt();
        String type=(marks>=33)?"Pass":"Fail";
        System.out.print(type);
    }
}
