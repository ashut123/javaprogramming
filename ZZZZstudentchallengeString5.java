//Remove Special characters from a string

public class ZZZZstudentchallengeString5 {
    public static void main(String[] args) {
        String str="a!B@c#1$2%3#";
        System.out.println(str.replaceAll("[^a-zA-z0-9]",""));  // it removes all special character

        
    }
    
}
