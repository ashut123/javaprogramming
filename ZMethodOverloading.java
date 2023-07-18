import java.util.*;
public class  ZMethodOverloading {
    static int max(int x,int y){
        return x>y?x:y;
    }
    static float max(float x,float y){
        if(x>y)
           return x;
        else
           return y;   

    }
    public static void main(String args[]){
        System.out.println(max(10,5));
        System.out.println(max(2f,5f));
    }
    
}
