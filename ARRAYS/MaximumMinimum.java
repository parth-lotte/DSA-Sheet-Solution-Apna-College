public class MaximumMinimum {

    public static int maxMin(int arr[])
    {
     
        for (int i = 0; i<arr.length;i++) {
            
            for (int j = i+1; j < arr.length; j++) {
                int max=arr[i];               
            

            
            if(max<arr[j])
            {
                max=arr[j];
                // return max;
                System.out.println(max);
            }
        }
        }
        return max;
    }
    public static void printArray(int arr[])
    {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+"");
                
        }
    }
    public static void main(String args[])
    {
        int arr[]={12,14,5,6,98,5};
        maxMin(arr);
        // printArray(arr);
    }
    
}
