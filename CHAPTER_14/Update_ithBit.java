public class Update_ithBit {
    public static int clearithbit(int n,int i){
        int bitmask=~(1<<i);
        return n&bitmask;
    }
    public static int setithbit(int n,int i){
        int bitmask= 1<<i;
        return n | bitmask;
    }
    public static int UpdateithBit(int n,int i,int newBit){
        if(newBit==0){
            return clearithbit(n, i);
        }else{
            return setithbit(n, i);
        }
    }
    public static void main(String[] args) {
        System.out.println(UpdateithBit(10, 2, 1));
    }
}
