public class ZZZZstringquantifiers {
    public static void main(String[] args) {
        String str1="abdhs"; //abhsu8 it gives false
        String str2="aBhfj"; // it gives because string should contain lower alphabets
        String str3="";

        System.out.println(str1.matches(".*")); // it means any numbers of time allowed
        System.out.println(str1.matches("[a-z]*"));   //they can be any numbers of alphabets it should contain only alphabests not numbers
        System.out.println(str1.matches("[a-z]+")); // it gives also true (+)means 1 or more and (*) means 0 or more
        System.out.println(str3.matches("[abc]+")); // it gives false because + means 1 or more
        
    }   
    
}
