import java.util.*;
public class array_reverse
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        int[] arr = {1,23,4,55,19,7,88};
        swap(arr,2,5);
        System.out.println(Arrays.toString(arr));
        reverse(arr);
        System.out.print(Arrays.toString(arr));
    }
    static void swap(int[] arr, int index1, int index2)
    {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
    static void reverse(int[] arr)
    {
        int start = 0;
        int end = arr.length-1;
        while(start<end)
        {
            swap(arr,start,end);
            start++;
            end--;
        }
    }
}