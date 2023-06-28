//Find if a number is Binaary 

public class ZZZZstudentchallengeonString3 {
    public static void main(String[] args) {
        int b=10001010; // if there is 566002 that gives false value because it is not binary number
        String str=String.valueOf(b);

        System.out.println(str.matches("[01]*"));  // here 01 will gives true value 
        System.out.println(str.matches("[01]+"));    

    }
    
}
