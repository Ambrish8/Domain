class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int m=image.length;
        int n=image[0].length;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<(n+1)/2;j++)    //no. of columns will be fixed cuz there is only 3 column and 0th and 2nd column are to be changed..
            {
                int temp=image[i][j]^1;
                image[i][j]=image[i][n-j-1]^1;
                image[i][n-j-1]=temp;
            }
        }
        return image;
    }
}
