// Find person is young or not young

import java.util.Scanner;
public class cStudentchallengeconditional2 {
    public static void main(String[] args) {
        int age;
        Scanner sc=new Scanner(System.in);
        age=sc.nextInt();
        if(age>=14 && age<=55)
        {
            System.out.println("person is young");
        }
        else
        {
            System.out.println("person is not young");
        }

    }
    
}
