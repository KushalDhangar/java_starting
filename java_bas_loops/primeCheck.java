import java.util.*;

public class primeCheck {
    public static void main(String arg[]){
       Scanner var=new Scanner(System.in);
       System.out.println("give Number : "); 
       int num=var.nextInt();
       boolean isprime=true;
       if(num==2){
            System.out.println("No is prime");
       }
       else{
            //for(int i=2;i<=num-1;i++){
              for(int i=2;i<=Math.sqrt(num);i++){
                 if(num%i==0){
                    isprime=false;
                 }
             }
             if(isprime==true){
                System.out.println(num+" is Prime");
                 }
             else{
                System.out.println(num+" is not a Prime");
             }
           }
    }
}
