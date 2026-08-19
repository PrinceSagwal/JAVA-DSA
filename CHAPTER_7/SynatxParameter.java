import java.util.*;
class SynatxParameter {
    public static int CalculateSum(int a,int b) {// Parameters or Formal parameters
        int sum=a+b;
        return sum;
        }
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int a=sc.nextInt();
            int b=sc.nextInt();
            int sum= CalculateSum(a,b);// Arguments or Actual Parameters
            System.out.println("Sum: "+sum);
        }

    
}
