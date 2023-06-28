public class ZZzstringcompare3 {
    public static void main(String[] args) {
        String str1="china wall";
        String str2=new String("china  tall");
         // it gives also positive value because w is greater than t (tall )
        System.out.println(str1.compareTo(str2));
    }
    
}
