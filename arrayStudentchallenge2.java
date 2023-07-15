import java.util.*;
public class arrayStudentchallenge2 {
    public static void main(String[] args) {
        int A[]={2,3,6,7,8,9,3,9};
        int key;
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter a  number");
        key =sc.nextInt();
        



        for(int i=0;i<=A.length;i++){
            
            if (key==A[i]){
                System.out.println("Element found:"+i);
                System.exit(0);
                
            }
        }
       System.out.println("Not found");
            

            }
        } 


        

    
    

