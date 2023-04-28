import java.util.*;
public class SearchRotatedsortedArray {

    public static int search(int arr[],int tar, int si, int ei)
    {
        // Mid point 

        int mid= si+(ei-si)/2;
        // Base conditions 
        
        if(si>ei)
        {
            return -1;
        }

        if(arr[mid]==tar)
        {
            return mid;
        }


        // Mid point on line 1
       // Case 1
    
    
        if(arr[si]<=arr[mid])
        {
            if(arr[si]<=tar && tar<=arr[mid])
            {
                return search(arr, tar, si,mid-1);
            }
            else
            {
                return search(arr, tar, mid+1, ei);
            }
        }

        // On line 2
        else
        {
            if(arr[mid]<=tar && tar<=arr[ei])
            {
                return search(arr, tar, mid+1,ei);
            }
            else
            {
                return search(arr, tar, si, mid-1);
            }
        }

    }
    public static void main(String args[])
    {
        int arr[]= {4,5,6,7,0,1,2};
        int targ=0;

        int Tindx= search(arr, targ, 0, arr.length-1);

        System.out.println("The target index value is =" + Tindx);
        

    }
}
