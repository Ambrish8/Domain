class Solution {
    public int[][] generateMatrix(int n) {
        int[][] arr=new int[n][n];
        int num=1;
        int left=0;
        int right=n-1;
        int top=0;
        int bottom=n-1;
        while(num<=(n*n))
        {
            for(int i=left;i<=right;i++)
            {
                arr[top][i]=num++;
            }
            for(int i=top+1;i<=bottom;i++)
            {
                arr[i][right]=num++;
            }
            for(int i=right-1;i>=left;i--)
            {
                arr[bottom][i]=num++;
            }
            for(int i=bottom-1;i>top;i--)
            {
                arr[i][left]=num++;
            }
            top++;
            bottom--;
            left++;
            right--;
        }
        return arr;
    }
}
