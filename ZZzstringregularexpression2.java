public class ZZzstringregularexpression2 {
    public static void main(String[] args) {
        String str1="7";  // it cant be store %,# i only contain chararcter 
        String str2="a7"; // this case it cannot contain only 7 because we have given [a-z][0-9].
        String str3="b";
        String str4="abc"; // it can't consist abcd because it is unmatched string


        System.out.println(str1.matches("[a-z0-9]")); // it contain al character and it will contain any operator
        System.out.println(str2.matches("[a-z][0-9]")); // special character are not allowed.
        System.out.println(str3.matches("[a|b]")); // it will consist only a and b it cannot contain c or any alphabet except a and b
        System.out.println(str4.matches("abc")); // it will consist exact value not for any value
        
    }
    
}
