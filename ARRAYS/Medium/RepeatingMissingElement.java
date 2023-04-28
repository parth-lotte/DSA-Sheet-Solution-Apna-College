import java.util.*;
public class RepeatingMissingElement {


     public static  void calc(int arr[], int n)
    {
        // First we will sort the array 

        Arrays.sort(arr);
        for(int i=0 ; i<n-1; i++)
        {
            if(arr[i]==arr[i+1])
            {
                System.out.println("Repeating element ="+ arr[i]);
                break;
            }

            
        }

        for(int i=1 ; i<=n; i++)
        {
            if(i!=arr[i-1])
            {
                System.out.println("Missing element ="+ i);
                break;
            }

            
        
    }
}
    public static void main(String args[])
    {
        int arr []= {5,3,2,3,1};
        int n= arr.length;

         calc(arr, n);
        // System.out.println(ans);

    }
    
}
