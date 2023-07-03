//  Display  type of website
import java.util.Scanner;

public class Studentchallengeswitchcase3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Domain name");
        String domain=scan.nextLine();
        String ext=domain.substring(domain.lastIndexOf(".")+1);
        
        switch(ext)
        {
            case "com":System.out.println("commercial");
            break;
            case "net":System.out.println("network");
            break;
            case "org": System.out.println("organisation");
            break;
            case "gov":System.out.println("government");
            break;
        }
    }
    
}
