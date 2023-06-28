public class ZZZZstringquantifiers3 {
    public static void main(String[] args) {
        String str1="ausu@gmail.com";
        String str2="ashu951@gmail.com";

        System.out.println(str1.matches(".*gmail.*"));
        System.out.println(str2.matches("\\w*@gmail(.*)")); // w is for all digits and alphabets
        
    }
    
}
