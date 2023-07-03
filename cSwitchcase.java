public class cSwitchcase {
    public static void main(String[] args) {
        int n=3;   // it does not consist float type of data it can consist byte sor char and string 
        switch (n)  // switch cases if we enter any value then it will go directly on that value and it will print that value
        
        {
            case 1: System.out.println("One");  // we cannot write case1.1 because it does not support float value
            break;
            case 2: System.out.println("Two");
            break;
            case 3:System.out.println("Three");
            break;
            case 4:System.out.println("four");
            break;
            default:System.out.println("Invalid");

        }
    }
    
}
