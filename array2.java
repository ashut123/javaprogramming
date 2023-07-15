

public class array2 {
    public static void main(String[] args) {
        int A[]=new int[10];
        int B[]={2,3,4,5,6};
        int C[];
        C=new int[10];

        for(int x:B)   // it is for each loop in which it print directly all the value of array
        {
            System.out.println(x);  // we can write here x++ also
        }
        
        // for change the value we have to use counter control for loop 
        // for(int i=0;i<=B.length;i++)  // this can change the value
        //{
            // System.out.println(B[i]++);

        //}
    }
    
}
