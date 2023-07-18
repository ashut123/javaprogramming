public class ZZZvariableargumentmaximumvalue {
    static int maximum(int...A){
        if (A.length==0)return Integer.MIN_VALUE;
        int max=A[0];
        for(int i=1;i<A.length;i++)
            if (A[i]>max)A[i]=max;
                
                return max;


            
        }
    
           


        
        public static void main(String[] args) {
            
           System.out.println( maximum(20,30,40,50));
           System.out.println(maximum(39,5,9,59));
            
        }

    }
    
    

