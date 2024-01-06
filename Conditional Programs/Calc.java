import java.util.Scanner;

public class Calc {
    public static void main(String arg[]){
        Scanner cal=new Scanner(System.in);
        int a,b;
        System.out.println("Enter Your Choice ");
        System.out.println("Press 1 for Addition");
        System.out.println("Press 2 for Subtraction");
        System.out.println("Press 3 for Multiplication");
        System.out.println("Press 4 for Division");
        System.out.println("Press 5 for Remainder");
        System.out.print("Enter Your Choice : ");
        int ch=cal.nextInt();
        System.out.println("Your Choice is : "+ch);
        System.out.println(" <-> I will calculate this .But first Provide the Two Values <->");
        System.out.print("Enter first Value : ");
        a=cal.nextInt();
        System.out.print("Enter Second Value : ");
        b=cal.nextInt();
            switch(ch){
                            case 1 : {
                                     int sum=0;
                                     sum=a+b;
                                     System.out.println(sum);
                                        break;
                                }
                            case 2 :{
                                    int sub=a-b;
                                    System.out.println(sub);
                                    break;
                            }
                            case 3 :{
                                    int mul=a*b;
                                    System.out.println(mul);
                                    break;
                            }
                            case 4 :{
                                    int div=a/b;
                                    System.out.println(div);
                                    break;
                            }
                            case 5 :{
                                   int mod=a%b;
                                   System.out.println(mod);
                                   break;
                            }
                            default:System.out.println("Your Mood is not to calculate anything Rather than your Girlfriend Budget haha!");
                        }
    }
}
