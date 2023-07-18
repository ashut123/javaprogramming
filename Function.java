import java.util.Scanner;

public class Function{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ashoustosh = sc.nextInt();
         System.out.println( check_even(ashoustosh));
        
    }
     static boolean check_even(int n){
        if(n%2==0)

        {
            return true;
        }
        return false;
         
    }
}