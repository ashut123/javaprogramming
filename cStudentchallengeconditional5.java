import java.util.Scanner;

public class cStudentchallengeconditional5 {
    public static void main(String[] args) {
        
        System.out.println("Enter the year");
        Scanner sc=new Scanner(System.in);

        int year=sc.nextInt();  
        if(year%4==0)
        {
            if(year%100==0)
            {
                if(year%400==0) // it means it my be or may not be leap year
                {
                    System.out.println("It is a leap year");
                }
                else{
                    System.out.println("It is not a leap year");
                }
            }
            else
            {
                System.out.println("It is a leap year");
            }
        } 
        else
        {
            System.out.println("Not a leap year");
        }
    }
    
}
