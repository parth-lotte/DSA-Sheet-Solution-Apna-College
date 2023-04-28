import java.util.*;
public class reverseArray {
       public static void main(String args[])
    {
        int arr[]= {2,5,9,7,6,3,5,8};
        int n=arr.length;
        int i=0;
        int j= n-1;

        while(i<j)
        {
        int t= arr[i];
        arr[i]=arr[j];
        arr[j]=t;
        i++;
        j--; 

        }
        System.out.println(Arrays.toString(arr));
   
    
    }    
}

