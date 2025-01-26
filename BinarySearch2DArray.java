public class BinarySearch2DArray
{
    public static boolean binarySearch2D(int[][] matrix, int target)
    {
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0)
        {
            return false;
        }
        int rows=matrix.length;
        int cols=matrix[0].length;
        int left=0;
        int right=rows*cols-1;

        while(left<=right)
        {
            int mid=left+(right-left)/2;
            int midElement = matrix[mid/cols][mid%cols];

            if(midElement == target)
            {
                return true;
            }
            else if(midElement<target)
            {
                left=mid+1;
            }
            else
            {
                right=mid-1;
            }
        }
        return false;
    }
    public static void main(String[] args)
    {
        int[][] matrix = {
            {1,3,5},
            {7,10,12},
            {14,17,20}
        };
        int target = 100;

        if(binarySearch2D(matrix,target))
        {
            System.out.println("Target found! ");
        }
        else
        {
            System.out.println("Target not found! ");
        }
    }
}