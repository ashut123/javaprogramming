public class ZZZZstringquantifiers2 {
    public static void main(String[] args) {
        String str1="abc";
        String str2="abcf";
        String str3="ababaab";
        System.out.println(str1.matches("[abc]{3}"));
        System.out.println(str2.matches("[abc]{3}"));  // it will gives false because {5} means 5 character should be there but there is only 4 character
        System.out.println(str3.matches("[abc]{3,7}"));
    }
    
}
