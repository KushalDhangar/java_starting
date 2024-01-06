import java.util.Scanner;

public class weekNoName {
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("*** Enter Digits from (1-7)To show Week Day Name ***");
        int week=sc.nextInt();
        switch (week) {
            case 1: 
                    System.out.println("Sunday");
                    break;
            case 2: 
                    System.out.println("Monday");
                    break;
            case 3: 
                    System.out.println("Tuesday");
                    break;
            case 4: 
                    System.out.println("Wednesday");
                    break;
            case 5: 
                    System.out.println("Thursday");
                    break;
            case 6: 
                    System.out.println("Friday");
                    break;
            case 7: 
                    System.out.println("Saturday");
                    break;
            default:
                    System.out.println("Ab kya tere liye 8 waa Din bhi hoga kya rest karne ke liye!!!");
                    break;
        }
    }
}
