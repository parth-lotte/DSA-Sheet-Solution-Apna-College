import java.util.*;
public class chocolateDistri {

    public static int Choco(int arr[], int n, int m)
    {
        Arrays.sort(arr);
        if(m==0 || n==0)
        {
            return 0;
        }

        if(n<m)
        {
            return -1;
        }
        int Min_Diff= Integer.MAX_VALUE;

        for(int i= 0; i+m-1<n; i++)
        {
            int diff= arr[i+m-1] - arr[i];
            if(diff<Min_Diff)
            {
                Min_Diff= diff;

            }

        }
        return Min_Diff;
    }

    public static void main(String args[])
    {
        int arr[] = {7,3,2,4,9,12,56};
        int m=3;

        int n= arr.length;

        int res=Choco(arr,n,m);

        System.out.println(res);

    }
    
}
