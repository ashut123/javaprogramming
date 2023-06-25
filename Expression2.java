import java.lang.*;
import java .util.Scanner;

public class Expression2 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in); // there is Scanner which is usinfg reading value from keyboards.

        int a,b,c; // we have decalre 3 variales
        float s;
        double area;

        System.out.println("Enter 3 side of Triangle");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();

        s=(a+b+c)/2f;

        area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("Area is "+area);


    }
    
    
}
