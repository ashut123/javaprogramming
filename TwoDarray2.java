// 2D array representation of array by using for loop
public class TwoDarray2 {
    public static void main(String[] args) {
        int A[][]=new int[5][5];
        int B[][]={{1,2,3},{2,3,4},{3,4,5}};
        for(int i=0;i<B.length;i++)    // for (int x:A)  -- for each loop
        {  
            for (int j=0;j<B[0].length;j++)  //for(int y:x)  -- for each loop
            {
                System.out.print(B[i][j]+" ");
            }
            System.out.println("");
           
        }

    }
    
}
