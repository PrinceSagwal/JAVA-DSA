import java.util.*;
public class ReverseOfNumber {
    
    
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter Number: ");
            int n=sc.nextInt();
            int lastdigit=0;
            int rev=0;
            while(n>0){
                lastdigit=n%10;
                rev=(rev*10)+lastdigit;
                n=n/10;
            }
            System.out.println(rev);
    
        }
        
    
    
}
