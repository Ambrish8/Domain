import java.util.*;
public class array7
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        int[] nums ={1,34,23,56,89};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void change(int[] arr) 
    {
        arr[0] = 18;  //Arrays are mutable
    }
}