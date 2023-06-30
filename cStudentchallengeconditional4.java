import java.util.Scanner;

public class cStudentchallengeconditional4 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        String  num;
        System.out.println("Enter the number");
         
        num=scan.nextLine();

        if(num.matches("[01]+"))
        {
            System.out.println("Binary radix=2");
        }
        else if(num.matches("[0-7]+"))
        {
            System.out.println("octal radix=8");
        }
        else if(num.matches("[0-9A-F]+"))
        {
            System.out.println("hexadecimal radix=16");
        }
        else if(num.matches("([0-9]+)"))
        {
            System.out.println("decimal radix=10");
        }
        else
        {
            System.out.println("not any number");
        }
        }
        

        
    }

    

