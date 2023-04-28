// import java.util.Arrays;
import java.util.*;

class Karrayelements{

    public static int minDiff(int arr[], int k, int n)
    {
        int res= Integer.MAX_VALUE;

        Arrays.sort(arr);

        for (int i = 0; i <=n-k; i++) {
            res= Math.min(res, arr[i+k-1]-arr[i]);
            
        }
        return res;
    }
    public static void main(String args[])
{
    
    int arr[]={10,100, 300, 200, 1000, 20, 30};
    int n= arr.length;
    int k=3;

    System.out.println(minDiff(arr, k, n));

    
    
    }
}