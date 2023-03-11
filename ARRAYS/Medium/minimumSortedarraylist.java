import javax.lang.model.util.ElementScanner14;

// Leet Code 153

public class minimumSortedarraylist {
    public int findmin(int [] nums)
    {
        int mid;
        int lo=0;
        int hi=nums.length-1;
        // Using Binary Search 
        if(nums[lo]<nums[hi])
        {
            // array is not rotated 
            return nums[0];
        }
        while(lo<=hi)
        {
        mid= lo +(hi-lo)/2;
        if(nums[mid]<nums[mid-1])
        {
            return nums[mid];
        }
        else if(nums[mid]<nums[mid+1])
        {
            return nums[mid+1];

        }
        else if(nums[lo]<=nums[mid])
        {
            lo=mid+1;
        }
        else if(nums[mid]<=nums[hi])
        {
            hi=mid-1;
        }

        }
        return -1;
        
    }
}