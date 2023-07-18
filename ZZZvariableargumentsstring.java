// program for variable arguments of String.
public class ZZZvariableargumentsstring {

    static void showlist(int start,String...S){  // this is for string  if we want to start from some then we will give start value
        int n=S.length;
        for(int i=0;i<n;i++){
            System.out.println(start+"."+S[i]);
            start ++;
        }
    }
    public static void main(String[] args) {
        showlist(5,"ashutosh","shubham","shivam","manbodh");  // here we can pass upto more names it will work
    }
    
}
