// Find type of website and the protocal used
import java.util.Scanner;
public class cStudentchallengeconditional7 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter a URL");
        String url=scan.nextLine();

        String protocal=url.substring(0,url.indexOf(":"));
        if(protocal.equals("http"))
            System.out.println("hyper link test protocal");

        else if(protocal.equals("ftp"))    
            System.out.println("file transfer protocal");

        String ext=url.substring(url.lastIndexOf(".")+1);

        if(ext.equals("com"))
            System.out.println("Commercial");

        else if(ext.equals("org"))
                System.out.println("organisation");
                
        else if(ext.equals("net"))
                System.out.println("network");       
                
          

        
        
    }
    
}
