public class ClearLastiBits {
    public static int clearibits(int n,int i){
        int bitmask= (~0)<<i;// (-1)=(~0) we take -1 because it make 111111
        return n&bitmask;
    }
    public static void main(String[] args) {
        System.out.println(clearibits(15, 2));
    }
}
