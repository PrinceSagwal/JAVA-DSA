public class SolidRhombus {
    public static void rhombus(int n) {
        for(int i=1;i<=5;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=5;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
        
    }
    public static void main(String[] args) {
        rhombus(4);
    }
    
}
