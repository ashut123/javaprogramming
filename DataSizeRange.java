
import java.lang.*;

public class DataSizeRange {
    public static void main(String arg[])
    {
        System.out.println("Int Min: " + Integer.MIN_VALUE);
        System.out.println("Int Max: "+ Integer.MAX_VALUE);
        System.out.println("Int Bytes " +Integer.BYTES);
    }
    
}
// here if we have to find for flaot then we use javap java.lang.Float 
// for short we use javap java.lang.Short    // in both of case we will get max and min value and bytes 
// for boolean we get in the form of true or false