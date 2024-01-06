import java.util.*;
public class incometax {
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Your Income : ");
        int income=sc.nextInt();
        float incometax;
        if(income<500000){
            System.out.print("You Don't Have To Pay any Tax");
        }
        else if(income>=500000 && income<1000000){
            incometax=0.20f*income;
            System.out.print(+incometax+" Your Income tax You have to Pay!");
        }
        else if(income>1000000){
            incometax=0.30f;
            System.out.print(+incometax+" Your Income Tax You have to Pay !");
        }

    }
}
