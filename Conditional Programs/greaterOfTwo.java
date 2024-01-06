import java.util.*;
public class greaterOfTwo{
    public static void main(String arg[]){
    Scanner num=new Scanner(System.in);
    int num1=num.nextInt();
    int num2=num.nextInt();
    int num3=num.nextInt();
        if(num1>num2 && num1>num3){
            System.out.print(+num2+" is Greater");
        }
        else if(num2>num1 && num2>num3){
            System.out.print(+num2+" is Greater than other"+num1+" and "+num3);
        }
        else{
            System.out.print(+num3+" is Greater");
        }
    }
}
