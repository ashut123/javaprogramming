public class Zstringstart {
    public static void main(String[] args) {
        String str =new String("Mr. Ashutosh Mishra");
        System.out.println(str.startsWith("Mr.")); // if Mr. is in input then it gives true value.
        // if we write Ashu on the place of Mr then it will give false.
        System.out.println(str.startsWith("Ashu",4));
    }
    
}
