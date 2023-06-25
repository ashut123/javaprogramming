public class jBitwiseSwipe {
    public static void main(String[] args) {
        int a=10, b=15;
        a=a^b;
        b=a^b;
        a=a^b;  // these three we use always for swapping.

        System.out.println(a+" " +b);

}
    
}
