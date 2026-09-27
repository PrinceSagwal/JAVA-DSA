public class ReverseArray {
    public static void rs(int num[]) {
        int first=0;
        int last=num.length-1;
        while(first<last){
            int temp=num[last];
            num[first]=num[last];
            num[first]=temp;

            first++;
            last--;

        }
        
    }
    public static void main(String[] args) {
        int num[]={2,4,6,8,10};
        rs(num);
        //print array
        for(int i=0;i<=num.length-1;i++){
            System.out.print(num[i]+" ");
        }
        System.out.println();
    }
}
