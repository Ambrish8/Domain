class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] arr=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            int temp=0;
            for(int j=0;j<arr.length;j++)
            {
                if(nums[j]<nums[i])
                temp++;
            }
            arr[i]=temp;
        }
        return arr;
    }
}
