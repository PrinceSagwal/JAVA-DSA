public class SelectionSort {
    public static void selectionsort(int num[]) {
        for(int i=0;i<num.length-1;i++){
            int minPostion=i;
            for(int j=i+1;j<num.length;j++){
                if(num[minPostion]>num[j]){
                    minPostion=j;
                }
            }
            //swap
            int temp=num[minPostion];
            num[minPostion]=num[i];
            num[i]=temp;
        }
    }
    public static void sorting(int num[]){
        for(int i=0;i<num.length;i++){
            System.out.print(num[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int num[]={5,4,1,3,2};
        selectionsort(num);
        sorting(num);
    }
}
