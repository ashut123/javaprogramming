//jagged array by using for each loop
public class TwoDarray5 {
    public static void main(String[] args) {
        int A[][];
        A=new int [3][];
        A[0]=new int[5];
        A[1]=new int[3];
        A[2]=new int[4];
        
        for(int x[]:A)
        {
            for(int y:x)
            {
                System.out.print(y+" ");
            }
            System.out.println("");
        }
    }
    
}
