

public class ZZzstringregularexpression {
    public static void main(String[] args) {
        String str1="f";
        String str2="a";  // here we cant write two value together it will give false value only it consist one value at a time that cant be differe as printed value.
        String str3="z";

        System.out.println(str1.matches("."));  //(.)is regular expression used for all character either a-z or 1-9 it gives true as output,
        // it is false more than one charcter because it consist only one character.
        System.out.println(str2.matches("[abc]"));
        System.out.println(str3.matches("[^abc]"));   // ^abc  contain all character except abc so that's why it will give true value

    }
    
}
