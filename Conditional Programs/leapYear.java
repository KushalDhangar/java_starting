import java.util.Scanner;

public class leapYear {
    public static void main(String arg[]){
        Scanner var=new Scanner(System.in);
        System.out.print("Enter Year To check it's a leap year or not : ");
        int year=var.nextInt();
        if(year%4==0){
            if(year%100==0){
                if(year%400==0){
                    System.out.println(+year+" It is a Leap Year");
                }
            }
        }
        else{
            System.out.println(+year+" is Not a Leap Year");
        }
    }
}
