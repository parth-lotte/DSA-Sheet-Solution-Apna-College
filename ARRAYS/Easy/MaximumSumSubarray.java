public class MaximumSumSubarray {


    // ALSO KNOWNS AS KADENS ALGO
    public static int maxsub(int arr[])
    {
        int currS=0;
        int maxS=Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++)
        {
            currS+=arr[i];

            if(currS>maxS)
            {
                maxS=currS;
            }
            if(currS<0)
            {
                currS=0;
            }

        }
        return maxS;
    }
    public static void main(String args[])
    {
        int arr[]={-4};

        int res= maxsub(arr);
        
        System.out.println(res);

    }
    
}
