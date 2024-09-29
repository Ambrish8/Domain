class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max=-99999999;
        List<Boolean> result = new ArrayList<>(candies.length);
        for(int i=0;i<candies.length;i++)
        {
            max=Math.max(max,candies[i]);
        }
        for(int i:candies)
        {
            if(i+extraCandies>=max)
            {
                result.add(true);
            }
            else
            {
                result.add(false);
            }
        }
        return result;
    }
}
