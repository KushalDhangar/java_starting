import java.util.*;
public class greaterOfTwoNo {
    public static void main(String arg[]){
        Scanner num=new Scanner(System.in);
        System.out.print("Enter The Two Numbers : ");
        int num1=num.nextInt();
        int num2=num.nextInt();
        if(num1>num2){
            System.out.println(""+num1+" Is Greater!");
        }
        else{
            System.out.println(""+num2+" Is Greater!");
        }
    }
}
