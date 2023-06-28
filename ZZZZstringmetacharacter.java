import javax.sql.rowset.spi.SyncResolver;

public class ZZZZstringmetacharacter {
    public static void main(String[] args) {
        String str1="9";
        String str2="b";
        String str3="a";
        String str4=" ";

        System.out.println(str1.matches("\\d"));  // it will only consist only digit
        System.out.println(str2.matches("\\D")); // it doesnot contain any digit it contain all thing accept digit
        System.out.println(str3.matches("\\w")); // it contain alphabets and digit
        System.out.println(str3.matches("\\W"));  //it neither contain alphabets or digit,it is for special character
        System.out.println(str4.matches("\\s")); // it is used for space
        System.out.println(str4.matches("\\S"));  //it does not contain sapces
    }
    
}
