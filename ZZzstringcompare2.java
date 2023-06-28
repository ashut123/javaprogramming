public class ZZzstringcompare2 {
    public static void main(String[] args) {
        String str1=("pyramid");   // if chinawall here then value we will gate negative because chinal wall is smaller than pyramid so it will give negative value
        // if china wall instead of pyramid then it give neagtive because the firs letter c is samller than p 
        String str2=new String("china wall");

        System.out.println(str1.compareTo(str2));  // it gives also positive number because str1 value is greater than str2 value

}
}
