public class ConditionalStatement3 {
    public static void main(String[] args) {
        int a=3, b=6,c=2;
        if(a>b && a>c)
        {
            System.out.println(a);
        }
        else if(b>c)
        {
            System.out.println(b);
        }
        else
        {
            System.out.println(c);
        }
    }
    
}
