import java.lang.*;
import java.util.*;
public class ReadKeyboard {
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        // scanner should be attached to keyboard  (sysetm.in = is  already attached to keyboard ) and scanner will be reading from keyboard
        int x= sc.nextInt();
        float y=sc.nextFloat();  // for float we use nextFloat means float value we are taking
        System.out.println(x);
        System.out.println(y);
    }
      // here system.in =object attached to keyboard and
      // System.out is object attachec to monitor that is display device
      //println -= ln is used to move cursor to next line
      // Scanner is utilize package that's why we used of import java,util
    
    
}
