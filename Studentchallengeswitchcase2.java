// Display name of month based on number
import java.util.Scanner;
public class Studentchallengeswitchcase2 {
    public static void main(String[] args) {
        int month;
        System.out.println("Enther month number");
        Scanner sc=new Scanner(System.in);
        month=sc.nextInt();
        switch(month)
        {
            case 1:System.out.println("janauary");
            break;
            case 2:System.out.println("February");
            break;
            case 3:System.out.println("march");
            break;
            case 4:System.out.println("April");
            break;
            case 5:System.out.println("May");
            break;
            case 6:System.out.println("june");
            break;
            case 7:System.out.println("July");
            break;
            case 8:System.out.println("August");
            break;
            case 9:System.out.println("September");
            break;
            case 10:System.out.println("Novemer");
            break;
            case 11:System.out.println("october");
            break;
            case 12:System.out.println("December");
            break;
            default:System.out.println("Invalid");
            break;
        }
    }
    
}
