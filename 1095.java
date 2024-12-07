/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index);
 *     public int length();
 * }
 */
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int peak = findPeakIndex(mountainArr); // Step 1: Find peak
        // Step 2: Search in the increasing part
        int result = binarySearch(mountainArr, target, 0, peak, true);
        if (result != -1) {
            return result; // Target found in the increasing part
        }
        // Step 3: Search in the decreasing part
        return binarySearch(mountainArr, target, peak + 1, mountainArr.length() - 1, false);
    }
    
    // Function to find the peak index in a mountain array
    private int findPeakIndex(MountainArray mountainArr) {
        int start = 0;
        int end = mountainArr.length() - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (mountainArr.get(mid) < mountainArr.get(mid + 1)) {
                // Peak is on the right
                start = mid + 1;
            } else {
                // Peak is on the left or at mid
                end = mid;
            }
        }
        return start; // Peak index
    }
    
    // Binary search function
    private int binarySearch(MountainArray mountainArr, int target, int start, int end, boolean ascending) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int midValue = mountainArr.get(mid);
            if (midValue == target) {
                return mid; // Target found
            }
            if (ascending) {
                // Search in increasing part
                if (target < midValue) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                // Search in decreasing part
                if (target > midValue) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1; // Target not found
    }
}
