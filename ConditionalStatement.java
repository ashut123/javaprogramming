

public class ConditionalStatement {
    public static void main(String[] args) {
        
        int x=2 ,y=4 ,z=5;
        float a=2.5f, b=4.5f, c=5.5f;  // here we can use float value also
        

        System.out.println(x<y);
        System.out.println(x<y && y<z); // here we used logical operator and(&&) operator.  if both are true then it givs true value
        System.out.println(x<y || y<z); // here we used or(||) operator 
        System.out.println(a<b);
     }
    
}
