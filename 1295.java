class Solution {
    public int findNumbers(int[] nums) {
        int ans=0;
        for(int i=0;i<nums.length;i++)
        {
            int digits=0;
            while(nums[i]>0)
            {
                digits++;
                nums[i]/=10;
            }
            if(digits%2==0)
            {
                ans++;
            }
        }
        return ans;
    }
}
