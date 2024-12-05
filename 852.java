class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int start=0;
        int end=arr.length-1;
        while(start<end)
        {
            int mid=start+(end-start)/2;
            if(arr[mid]>arr[mid+1])
            //you are in decreasing part of the array
            //this may be the answer but look at left
            //this is why end != mid-1
            {
                end=mid;
            }
            else if(arr[mid]<arr[mid+1])
            //you are in asc part of the array
            {
                start=mid+1;
            }
            else
            //in the end start==end pointing tto the largest number bcoz' of 2 checks
            // start and end always try to find max element in the above 2 checks
            //hence, when they are pointing to the max element
            {
                return mid;
            }
        }
        return start; // or return end
    }
}
