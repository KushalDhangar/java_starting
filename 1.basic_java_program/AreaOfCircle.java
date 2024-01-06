import java.util.Scanner;
public class AreaOfCircle {
    public static void main (String arg[]){
        Scanner obj=new Scanner(System.in);
        int rad= obj.nextInt();
        float area = 3.14f*rad*rad;
        System.out.println(area);
    }
}
