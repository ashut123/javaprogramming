public class jBitwiseDemo5 {
    public static void main(String[] args) {
        int x=-0b1000;
        int y;

        y=x>>1;  // y=~x this is for not means inversed
        System.out.println(String.format("%s",Integer.toBinaryString(x))); // this is for binary form for x
        System.out.println(String.format("%s",Integer.toBinaryString(y))); // this is for binary form for y

    }
    
}
