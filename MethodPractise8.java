import java.util.*;
public class MethodPractise8 {
    static int gcd(int x,int y){
       if(y == 0)return x;
       else{

        return gcd(y , Math.abs(y-x));
       }


    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int ans=gcd(x, y);
        System.out.println(ans);
        
    }
    
    
}