public class ZZZvariableargumentsum {
    static int sum(int...A){
        int sum=0;
        int n=A.length;
        for(int i=0;i<n;i++){
            sum=A[i]+sum;
            
        }
        return sum;
    }
    public static void main(String[] args) {
        int ans=sum(20,30,30);
        System.out.println(ans);

    }
    
}
