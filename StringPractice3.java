public class StringPractice3 {
    public static void main(String[] args) {
        String str1="Java";
        String str2="Java"; // here if put small j then it shows false reuslt becuse it will have different object,
        // String str2=new String ("Java") it gives also false result berause str gives pool and str2 making new object.

        System.out.println(str1==str2); // == it means it gets result true if they are holding same object other wise it get false result.

    }
    
}
