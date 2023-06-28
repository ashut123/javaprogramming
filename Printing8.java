public class Printing8 {
    public static void main(String[] args) {
        
        float a =8918123.45f;  // here bigger number is there then output will be in bigger number
        // if number will be small then it take 6 places in output
        float b=3.45f;  // it will take total 6 spaces in output
        System.out.printf("%6.2f",a); 
        System.out.printf("%06.2f",b);  // if we use 0 flag here then the remianing spaces will fill with 0.
        

    }
    
}
