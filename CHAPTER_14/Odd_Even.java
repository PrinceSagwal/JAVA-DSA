public class Odd_Even {
    
    public static void oddOrEven(int n){
        if((n&1)==0){
            System.out.println("Even number");
        }else{
            System.out.println("odd number");
        }
    }
    public static void main(String[] args) {
        int n=4;
        oddOrEven(n);
    }
}
