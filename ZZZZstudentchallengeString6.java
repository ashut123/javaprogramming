//Remove extra spaces from string

public class ZZZZstudentchallengeString6 {
    public static void main(String[] args) {
        String str="abc     def   gh    ijk";
        String str1="   abc   efg  lm    ijk";
        System.out.println(str.replaceAll("\\s+"," ").trim());
        System.out.println(str1.replaceAll("\\s+"," ").trim());
    }
    
}
