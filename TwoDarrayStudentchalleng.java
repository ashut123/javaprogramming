// Adding of 2 matrices
public class TwoDarrayStudentchalleng {
    public static void main(String[] args) {
        int A[][]={{2,3,4},{3,4,5},{4,5,6}};
        int B[][]={{5,6,7},{3,4,5},{7,8,9}};
        int C[][]=new int[3][3];

        for(int i=0;i<A.length;i++){
            for(int j=0;j<A[0].length;j++){
                C[i][j]=A[i][j]+B[i][j];
            }
            
        }
        for(int x[]:C)
        {
            for(int y:x)
            {
                System.out.print(y+",");
            }
            System.out.println("");
        }
    }
    
}
