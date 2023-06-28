//Find the email id is on gmail
// Find username and domain name from email

public class ZZZZstudentchallengeonString {
    public static void main(String[] args) {
        String str="programmer@gmail.com";
        // here before @ programmer is user name and after @ gmail.com is domain name
        int i=str.indexOf("@");
        String uname=str.substring(0,i);
        String domain=str.substring(i+1,str.length());

        System.out.println("Username: "+uname);
        System.out.println("Domain:  "+domain);

        System.out.println(domain.startsWith("gmail"));  // if here we write hot mail then it will give false
        
        int j=domain.indexOf(".");
        String name=domain.substring(0,j);
        System.out.println(name.equals("gmail"));

    }
    
}
