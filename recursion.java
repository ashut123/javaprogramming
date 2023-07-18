import javax.sql.rowset.spi.SyncResolver;

public class recursion {
    static void  rec(int n){
        if(n>0){
           
            System.out.println(n);
            rec(n-1);
            
        }
    }
    public static void main(String[] args) {
        rec(3);
    }
    
}
