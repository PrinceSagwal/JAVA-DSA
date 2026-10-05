public class TrappingRainwater {
    public static int traprainwater(int height[]){
        int n=height.length;
        //Calculate Left Max Boundary  --array
        int leftMax[]=new int [n];
        leftMax[0]=height[0];
        for(int i=1;i<n;i++){
            leftMax[i]=Math.max(height[i],leftMax[i-1]);
        }
        //Calculate Right Max Boundary  --array
        int rightMax[]=new int[n];
        rightMax[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            rightMax[i]=Math.max(height[i], rightMax[i+1]);
        }
        int trappedwater=0;
        //loop
        for(int i=0;i<n;i++){
            //waterlevel= min(leftMax boundary, rightMax boundary)
            int waterlevel=Math.min(leftMax[i],rightMax[i]);
            //Trapped Water= water level - Height[i]
            trappedwater += waterlevel - height[i];
        }
        return trappedwater;

    }
    public static void main(String[] args) {
        int height[]={4,2,0,6,3,2,5};
        System.out.println(traprainwater(height));
    }
}
