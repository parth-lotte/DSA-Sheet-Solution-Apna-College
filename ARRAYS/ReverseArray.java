import javax.lang.model.util.ElementKindVisitor7;

public class ReverseArray {

    public static void reverseArray(int arr[],int si,int end)
    {
        int temp;
        while(si<end)
        {
            temp=arr[si];
            arr[si]=arr[end];
            arr[end]=temp;
            si++;
            end--;
        }
    }

    public static void printArray(int arr[])
    {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+"");
                
        }
    }
    public static void main(String args[])
    {
        int arr []= {12,14,16,18,20};
        reverseArray(arr, 0, arr.length-1);
        printArray(arr);
    }
    

}