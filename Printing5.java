

public class Printing5 {
    public static void main(String[] args) {
        int x=20;
        float y=12.56f;
        char z='A';
        String str="Java Program";

        System.out.printf("%1$d  %1$d %1$d",x);  // here d means decimal and x means 1st argument ans %1$d  means it will print 1 argument.
        System.out.printf("%1$d  %2$f %1$d",x,y);  // here %2$f means it will print 2nd argument as float
        System.out.printf("%3$s  %2$f %1$d",x,y,str);

    }
    
}
