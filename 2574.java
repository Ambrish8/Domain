class Solution {
    public int[] leftRightDifference(int[] nums) {
      int n=nums.length;
      int[] leftSum = new int[n];  
      int[] rightSum = new int[n];
      int[] answer = new int[n];

      int leftsum=0;
      int rightsum=0;

      for(int i=0;i<n;i++)
      {
        leftSum[i]=leftsum;
        leftsum+=nums[i];

        rightSum[n-1-i]=rightsum;
        rightsum+=nums[n-1-i];
      }
      for(int i=0;i<n;i++)
      {
        answer[i]=Math.abs(leftSum[i]-rightSum[i]);
      }
      return answer;
    }
}
