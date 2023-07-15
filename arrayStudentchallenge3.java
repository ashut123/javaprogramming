import java.util.*;
public class arrayStudentchallenge3 {
    public static void main(String[] args) {
        int A[]={2,3,4,5,6,7,8,9,10};
        Scanner sc=new Scanner(System.in);
        int max=10;
        System.out.println("Enter a number");
        
        
        for(int i=0;i<=A.length;i++)
        {
            if(A[i]>max);
            {
                max=A[i];
            }

            
            
        }
        System.out.println(max);
    }
    
}
