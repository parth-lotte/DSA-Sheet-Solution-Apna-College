import java.util.*;
public class HeapSort {

    public static void heapify(int arr[],int i, int size)
    {
        int left= 2*i+1;
        int right= 2*i+2;
        int maxIdx= i;

        if(left<size && arr[maxIdx]<arr[left])
        {
            maxIdx=left;
        }

        if(right<size && arr[maxIdx]<arr[right])
        {

            maxIdx=right;
        }

        if(maxIdx!=i)
        {
            //  swap with the left or the right element 

            int t= arr[i];
            arr[i]=arr[maxIdx];
            arr[maxIdx]=t;

            heapify(arr, maxIdx, size);
        }
    }

    public static void sortHeap(int arr[])
    {
        // Step 1- Build Max Heap 
        int n=arr.length;
        for(int i= n/2; i>=0; i--)
        {
            heapify(arr,i,n);
        
        }

        // Step 2 push the first element at the last 

        for(int i=n-1; i>0; i--)
        {
            int temp = arr[0];
            arr[0]=arr[i];
            arr[i]=temp;

            heapify(arr,0,i);
        }
    }
    public static void main(String args[])
    {
        int arr[]= {1,2,4,5,3};

        

            sortHeap(arr);

            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]+ " ");
            }
    }
    
}
