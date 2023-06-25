public class jBitwiseDemo6 {
    public static void main(String[] args) {
        int x=0b1000;
        int y;

        y=~x;  // y=~x this is for not means inversed
        System.out.println(String.format("%s",Integer.toBinaryString(x))); // this is for binary form for x
        System.out.println(String.format("%32s",Integer.toBinaryString(y))); // this is for binary form for y   // here  %32 means starting value is 1 that will convert into 0 or space
        
        System.out.println(y);

    }
    
}
