//Find is Number is Binary or not

public class ZZZZstudentchallengeString4 {
    public static void main(String[] args) {
        String str="123BD"; // it is hexadecimal number it gives true if R123BT - it is not hexadecimal number.
        String str1="B123AZ"; // this is not in hexadecimal
        System.out.println(str.matches("[0-9A-F]+"));
        System.out.println(str1.matches("[0-9A-F]+"));

    }
    
}
