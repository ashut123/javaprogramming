// without use static we have to create new object
// 2nd method to print method

public class MethodPractise {
    int max(int x,int y)
    {
        if(x>y)
           return x;
        else
           return y;   
    }
    public static void main(String[] args) {
        int a=10; int b=15;
        MethodPractise mp=new MethodPractise();  // we have created new object because we have not used static
         System.out.println(mp.max(a,b));
    }
    
}
