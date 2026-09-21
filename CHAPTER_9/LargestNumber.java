public class LargestNumber {
    public static int lm(int num[]) {
        int largest=Integer.MIN_VALUE;//-infinity

        for(int i=0;i<num.length;i++){
            if(largest<num[i]){
                largest=num[i];
            }
        }
        return largest;
        
    }
    public static void main(String[] args) {
        int num[]={2,4,7,9,3};
        System.out.println("Largest no. is : "+lm(num));
    }
}
