public class Solution {
    public int[] productExceptSelf(int[] nums) {

            // base case

            if(nums ==null || nums.length==0)
            {
                return new int[0];
            }
        // first we will create new array result 

        int [] result= new int [nums.length];

        // for the left pass 
        int rp=1;
        for(int i=0; i<nums.length ; i++)
        {
            result[i]=rp;
            rp= rp*nums[i];
        }
        

        // For the right pass 

         rp=1;
        for(int i=nums.length-1; i>=0 ; i--)
        {
            result[i]=result[i]*rp;
            rp= rp*nums[i];
        }

        return result;
    }
} {
    
}
