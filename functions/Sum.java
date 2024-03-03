package functions;
import java.util.*;

public class Sum {
    public static void sumOfTwo(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 1st Number :");
        int a = in.nextInt();
        System.out.println("Enter 2st Number :");
        int b = in.nextInt();
        int sum = a + b;
        System.out.println("Sum of " + a + b + "is : " + sum);
    }

    public static void main(){
        sumOfTwo();
    }
}