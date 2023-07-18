public class ZZVaraiableargument {  
      static void show(int...A){  // if we write int A[] then in main method only we could call only array type value like new int A[]{}
//and we if give variable argument int ...A then it will take any type of value
        for(int x:A){
            System.out.println(x);

        }
    }
    public static void main(String[] args) {
        show();  // we called to upper value show but we have not give any variable so it will not print any thing 
        show(10,20,30); // it will print th given value
        show(new int []{10,2,3,4,5,});
    }
    
}
