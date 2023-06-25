public class IncrementDecrement3 {
    
    public static void main(String[] args) {
        int x=5,y=4,z;
        
        z=2*x++ + 3 * ++y;
        System.out.println(z);

        float a=34.5f;  // this is for float value.
        a++;
        System.out.println(a);

        char b='B';   // this is for character value.
        b++;
        System.out.println(b);

        byte  c=5;
        c++;        // this is integer literal and this can't be a c+1
        System.out.println(c);

    }
}
