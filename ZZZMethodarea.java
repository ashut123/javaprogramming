import java.util.*;
public class ZZZMethodarea {
    static int max(int l,int b){
        return l*b;
    }
    static double area(int radius){
        return Math.PI*radius*radius;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int l=sc.nextInt();
        int b=sc.nextInt();
        int ans=max(l,b);
        System.out.println(max(l,b));
        
    }
    
}
