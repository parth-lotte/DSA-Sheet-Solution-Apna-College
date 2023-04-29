class Solution {
    public int trap(int[] height) {

        // We will calc right max and left max; for the 
        // calc of water level we need 
        int n= height.length;

        int leftMax[]= new int [n];
        // left bar will store 0 element 
        leftMax[0]= height[0];
        for(int i=1 ; i<=n-1;i++)
        {
            leftMax[i]= Math.max(height[i], leftMax[i-1]);
        }

        // same for the right
        int rightMax[]= new int[n];

        rightMax[n-1]= height[n-1];
        for(int i=n-2 ; i>=0;i--)
        {
            rightMax[i]= Math.max(height[i], rightMax[i+1]);
        }

        // Waterlevel
        int trappedWater=0;
        for(int i=0;i<n;i++)
        {
        int waterLevel= Math.min(rightMax[i],leftMax[i]);
        trappedWater+= waterLevel- height[i];
        }
        return trappedWater;
    }
}