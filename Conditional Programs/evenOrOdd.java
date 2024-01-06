import java.util.*;
public class evenOrOdd {
    public static void main (String arg[]){
        Scanner num=new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num1=num.nextInt();
        if(num1%2==0){
            System.out.println(""+num1+" is an Even!");
        }
        else{
            System.out.println(""+num1+" is an Odd!");
        }
    }
}
