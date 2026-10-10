import java.util.Arrays;
import java.util.Collections;//for reverse 

public class InbuiltSort {
    public static void main(String[] args) {
        int num[]={5,4,1,3,2};
        Arrays.sort(num);
        Arrays.sort(num,0,3);
        Arrays.sort(num,Collection.reverseOrder());//for reverse sort & for this you have to use Integer
        }
}
