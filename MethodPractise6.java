// change of two  arrray value;
public class MethodPractise6 {
    static void change(int X[],int index,int value){
        X[index]=value;
    }
    static void change2(int x,int value){
        x=value;

    }    

    
    public static void main(String[] args) {
        int A[]={2,3,4,5,6};

        change(A,2,10);
 
        for(int x:A)   // here we used for each loop because we had to print all updated arraty element
        {
            System.out.println(x);
        }
        int x=10;
        change2(x,20);
        System.out.println("Value of paramter"+x);
    }
    
}
