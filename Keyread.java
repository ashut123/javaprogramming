import java.lang.*;
import java.util.*;

public class Keyread {
    public static void main(String args[])
    {
        Scanner S=new Scanner(System.in);
        
        int a,b,c;
        System.out.println( "Enter 2 number");
         a=S.nextInt();  // this method is returns that integer value
         b=S.nextInt();

         c=a+b;

        System.out.println("Sum is "+c);
    }

    
}



// Class Scanner 
//next Int()  is used for reading integer value 
// next flaot() - float value
 // next() - is used for reading the string 

 // has NextInt() -- is used for to check next value is coming that is integer or not it returns boolean value true false.@interface
 // has float()
