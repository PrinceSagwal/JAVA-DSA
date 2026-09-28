public class SubArrays {
    public static void PrintSA(int num[]) {
        int ts=0;
        for(int i=0;i<num.length;i++){
            int start=i;
            for (int j=i;j<num.length;j++){
                int last=j;
                for(int k=start;k<=last;k++){//print
                    System.out.print(num[k]+" ");//subarray
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("total subarrays= "+ ts);
    }public static void main(String[] args) {
        int num[]={2,4,6,8,10};
        PrintSA(num);
    }
}
