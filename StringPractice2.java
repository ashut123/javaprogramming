public class StringPractice2 {
    public static void main(String[] args) {
        String str1="Java Program";
        String str2=new String("JAVA");

        char c[]={'H','e','l','l','o'};
        String str3=new String(c,1,3);  // here 1,3 means output will print from 1 to 3.


        byte b[]={65,66,67,68};
        String str4=new String(b,2,2); // here 2,2, means ouput will start from 2


        System.out.println(str3);
        System.out.println(str4);
    }
    
}
