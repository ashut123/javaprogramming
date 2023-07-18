public class MethodPractise4 {
    static void change(int A[],int index,int value){
        A[index]=value;

    }
    public static void main(String[] args) {
        int A[]={2,3,4,5,6};

        change(A,2,10);
 
        for(int x:A)   // here we used for each loop because we had to print all updated arraty element
        {
            System.out.println(x);
        }
    }
    
}
