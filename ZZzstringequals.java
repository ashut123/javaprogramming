public class ZZzstringequals {
    public static void main(String[] args) {
        String str1="Pyramid";
        String str2="Pyramid";
        String str3=new String("Pyramid");

        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));
        System.out.println(str1==str2); // here we compare references and references are holding the object
        System.out.println(str1==str3); // str 1 and str3 both are not same because str1 created pool ans str3 are created in heap
        System.out.println(str1.equals(str3)); // it will check content of string
        System.out.println(str1.compareTo(str3)); // here we are comparing both if both are same then we will get 0
        
    }
    
}
