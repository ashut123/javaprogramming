public class ZZMethodbyte {
    static int max(byte x,byte y){
        return x>y?x:y;

    }
    static int max(int x,int y){
        return x>y?x:y;

    }
    static int max(int x,int y,int z){
        if (x>y && x>z)
              return x;
        else if(y>z)
              return y;
        else  
              return z;            
    }
    static float max(float x,float y){   // flaot can work on int also 
        if(x>y) 
            return x;
        else  
            return y;    
    }
    public static void main(String[] args) {
        byte a=10; byte b=6;   // byte works on only byte type of data
        System.out.println(max(a,b)); // it will call byte  never it call int type for byte method is call if you passing byte as parameter
        System.out.println(max(12,3));  // if we write here value then it call int type 
        System.out.println(max(10,3,4));  // it will int method those have three input
    }  
    
}
